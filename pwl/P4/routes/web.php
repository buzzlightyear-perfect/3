<?php

use Illuminate\Support\Facades\Route;

// Rute mengembalikan string teks langsung
Route::get('/halo', function () {
    return 'Selamat datang di Praktikum Teknologi Web - Framework Laravel!';
});

// Rute mengembalikan data array dalam format JSON otomatis
Route::get('/info-kampus', function () {
    return [
        'universitas' => 'Universitas Jenderal Achmad Yani',
        'fakultas'   => 'Fakultas Sains dan Informatika',
        'jurusan'    => 'Informatika',
        'tahun'      => 2024
    ];
});

// Parameter Wajib
Route::get('/mahasiswa/{nim}', function ($nim) {
    return "Profil Mahasiswa dengan NIM: " . htmlspecialchars($nim);
})->whereNumber('nim'); // Constraint agar hanya menerima angka

// Parameter Opsional dengan nilai default
Route::get('/salam/{nama?}', function ($nama = 'Mahasiswa') {
    return "Halo, Selamat Belajar " . htmlspecialchars($nama) . "!";
});


Route::get('/tentang-laboratorium-web', function () {
    return 'Halaman Resmi Laboratorium Komputer dan Teknologi Web.';
})->name('lab.about');

// Uji pemanggilan Named Route menggunakan helper route()
Route::get('/uji-redirect', function () {
    return redirect()->route('lab.about');
});

// Group Route dengan Prefix dan Name
Route::prefix('akademik')->name('akademik.')->group(function () {

    // Route Jadwal Perkuliahan
    Route::get('/jadwal', function () {
        return "Jadwal Perkuliahan Semester Berjalan";
    })->name('jadwal');

    // Route Pengisian KRS
    Route::get('/krs', function () {
        return "Halaman Pengisian Kartu Rencana Studi (KRS)";
    })->name('krs');

    // Route Kartu Hasil Studi
    Route::get('/nilai', function () {
        return "Kartu Hasil Studi (KHS) dan Transkrip Nilai";
    })->name('nilai');

});

// TUGAS PRAKTIKUM: SISTEM PERPUSTAKAAN KAMPUS

// A. Route Katalog Buku dengan Parameter Kategori dan ID Buku
Route::get('/katalog/{kategori}/{id_buku}', function ($kategori, $id_buku) {
    return "Kategori Buku: " . htmlspecialchars($kategori) .
           " | ID Buku: " . htmlspecialchars($id_buku);
})

// B. Regex Constraint agar ID Buku hanya menerima angka
->where('id_buku', '[0-9]+');


// C. Route Group dengan Prefix Pustakawan
Route::prefix('pustakawan')->group(function () {

    // Route Dashboard
    Route::get('/dashboard', function () {
        return 'Halaman Dashboard Pustakawan';
    });

    // Route Sirkulasi
    Route::get('/sirkulasi', function () {
        return 'Halaman Pengelolaan Sirkulasi Peminjaman dan Pengembalian Buku';
    });

    // Route Laporan
    Route::get('/laporan', function () {
        return 'Halaman Laporan Perpustakaan Kampus';
    });

});


// D. Fallback Route
Route::fallback(function () {
    return 'Maaf, halaman yang Anda cari tidak ditemukan. Silakan periksa kembali URL yang diakses.';
});