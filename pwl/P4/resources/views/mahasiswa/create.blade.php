@extends('layouts.app')

@section('title', 'Tambah Mahasiswa')

@section('content')
    <h3>Form Tambah Mahasiswa</h3>

    @if ($errors->any())
        <div style="color: red; border: 1px solid red; padding: 8px; margin-bottom: 12px;">
            <strong>Data belum lengkap!</strong>
            <ul>
                @foreach ($errors->all() as $error)
                    <li>{{ $error }}</li>
                @endforeach
            </ul>
        </div>
    @endif

    {{-- Form input NIM, Nama Lengkap, dan Pilihan Program Studi --}}
    <form action="{{ route('mahasiswa.store') }}" method="POST">
        @csrf
        <table cellpadding="6" cellspacing="0">
            <tr>
                <td><label for="nim">NIM</label></td>
                <td>
                    <input type="text" name="nim" id="nim" value="{{ old('nim') }}"
                           placeholder="Contoh: 2021004" required>
                </td>
            </tr>
            <tr>
                <td><label for="nama">Nama Lengkap</label></td>
                <td>
                    <input type="text" name="nama" id="nama" value="{{ old('nama') }}"
                           maxlength="100" placeholder="Contoh: Dinda Permata" required>
                </td>
            </tr>
            <tr>
                <td><label for="jurusan">Program Studi</label></td>
                <td>
                    <select name="jurusan" id="jurusan" required>
                        <option value="">-- Pilih Program Studi --</option>
                        <option value="Informatika" {{ old('jurusan') == 'Informatika' ? 'selected' : '' }}>
                            Informatika
                        </option>
                        <option value="Sistem Informasi" {{ old('jurusan') == 'Sistem Informasi' ? 'selected' : '' }}>
                            Sistem Informasi
                        </option>
                        <option value="Teknik Elektro" {{ old('jurusan') == 'Teknik Elektro' ? 'selected' : '' }}>
                            Teknik Elektro
                        </option>
                        <option value="Teknik Industri" {{ old('jurusan') == 'Teknik Industri' ? 'selected' : '' }}>
                            Teknik Industri
                        </option>
                    </select>
                </td>
            </tr>
            <tr>
                <td></td>
                <td>
                    <button type="submit">Simpan Data</button>
                    <a href="{{ route('mahasiswa.index') }}">Kembali</a>
                </td>
            </tr>
        </table>
    </form>
@endsection
