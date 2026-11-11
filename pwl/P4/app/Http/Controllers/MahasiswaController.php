<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;

class MahasiswaController extends Controller
{
    // Menampilkan daftar data mahasiswa
    public function index()
    {
        $daftar_mhs = [
            [
                'nim' => '2021001',
                'nama' => 'Aditya Pratama',
                'jurusan' => 'Informatika',
                'ipk' => 3.75,
            ],
            [
                'nim' => '2021002',
                'nama' => 'Bella Safitri',
                'jurusan' => 'Sistem Informasi',
                'ipk' => 3.82,
            ],
            [
                'nim' => '2021003',
                'nama' => 'Candra Wijaya',
                'jurusan' => 'Teknik Elektro',
                'ipk' => 3.40,
            ],
        ];

        return view('mahasiswa.index', compact('daftar_mhs'));
    }

    // Menampilkan form tambah data
    public function create()
    {
        return view('mahasiswa.create');
    }

    // Menangani pengiriman form (Store)
    public function store(Request $request)
    {
        $validated = $request->validate([
            'nim' => 'required|numeric',
            'nama' => 'required|string|max:100',
            'jurusan' => 'required',
        ]);

        return redirect()->route('mahasiswa.index')
            ->with(
                'success',
                'Data mahasiswa '.$request->nama.' berhasil disimpan!'
            );
    }
}
