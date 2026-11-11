@extends('layouts.app')

@section('title', 'Tambah Dosen')

@section('content')
    <h3>Form Tambah Dosen</h3>

    <form action="{{ route('dosen.index') }}" method="GET">
        <table cellpadding="6" cellspacing="0">
            <tr>
                <td><label for="nip">NIP</label></td>
                <td>
                    <input type="text" name="nip" id="nip" value="{{ old('nip') }}"
                           placeholder="Contoh: 198503122015041001" required>
                </td>
            </tr>
            <tr>
                <td><label for="nama">Nama Dosen</label></td>
                <td>
                    <input type="text" name="nama" id="nama" value="{{ old('nama') }}"
                           maxlength="100" placeholder="Contoh: Dr. Rina Wulandari, S.Kom., M.T." required>
                </td>
            </tr>
            <tr>
                <td><label for="mk">Mata Kuliah Diampu</label></td>
                <td>
                    <select name="mk" id="mk" required>
                        <option value="">-- Pilih Mata Kuliah --</option>
                        <option value="Pemrograman Web Lanjut">Pemrograman Web Lanjut</option>
                        <option value="Framework Lanjutan">Framework Lanjutan</option>
                        <option value="Pemrograman Perangkat Bergerak">Pemrograman Perangkat Bergerak</option>
                        <option value="Proyek Perangkat Lunak">Proyek Perangkat Lunak</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td><label for="sks">SKS</label></td>
                <td>
                    <input type="number" name="sks" id="sks" value="{{ old('sks', 3) }}" min="1" max="6" required>
                </td>
            </tr>
            <tr>
                <td></td>
                <td>
                    <button type="submit">Simpan Data</button>
                    <a href="{{ route('dosen.index') }}">Kembali</a>
                </td>
            </tr>
        </table>
    </form>
@endsection
