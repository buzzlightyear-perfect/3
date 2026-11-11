<!DOCTYPE html>
<html lang="id">
<head>
    <meta charset="UTF-8">
    <title>@yield('title', 'Praktikum Laravel')</title>
</head>
<body>
    <header>
        <h2>Sistem Informasi Akademik</h2>

        <nav>
            <a href="{{ route('mahasiswa.index') }}">Daftar Mahasiswa</a> |
            <a href="{{ route('mahasiswa.create') }}">+ Tambah Mahasiswa</a> |
            <a href="{{ route('dosen.index') }}">Daftar Dosen</a> |
            <a href="{{ route('dosen.create') }}">+ Tambah Dosen</a>
        </nav>

        <hr>
    </header>

    <main>
        @if(session('success'))
            <p style="color: green;">{{ session('success') }}</p>
        @endif

        @yield('content')
    </main>

    <footer>
        <hr>
        <p>&copy; 2024 Laboratorium Teknologi Web - Universitas Jenderal Achmad Yani</p>
    </footer>
</body>
</html>
