@extends('layouts.app')

@section('title', 'Daftar Dosen')

@section('content')
    <h3>Daftar Dosen Pengampu Mata Kuliah</h3>

    <table border="1" cellpadding="8" cellspacing="0" width="100%">
        <tr bgcolor="#E2E8F0">
            <th>No</th>
            <th>NIP</th>
            <th>Nama Dosen</th>
            <th>Mata Kuliah Diampu</th>
            <th>SKS</th>
            <th>Status</th>
        </tr>

        @forelse ($daftar_dosen as $index => $dosen)
            <tr>
                <td>{{ $index + 1 }}</td>
                <td>{{ $dosen['nip'] }}</td>
                <td>{{ $dosen['nama'] }}</td>
                <td>{{ $dosen['mk'] }}</td>
                <td>{{ $dosen['sks'] }}</td>
                <td>
                    @if ($dosen['sks'] >= 4)
                        <span>Dosennya Maha Sibuk</span>
                    @else
                        <span>Regular</span>
                    @endif
                </td>
            </tr>
        @empty
            <tr>
                <td colspan="6" align="center">Tidak ada data dosen.</td>
            </tr>
        @endforelse
    </table>
@endsection
