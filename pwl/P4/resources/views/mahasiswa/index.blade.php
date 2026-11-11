@extends('layouts.app')

@section('title', 'Daftar Mahasiswa')

@section('content')
    <h3>Data Mahasiswa Terdaftar</h3>

    <table border="1" cellpadding="8" cellspacing="0" width="100%">
        <tr bgcolor="#E2E8F0">
            <th>No</th>
            <th>NIM</th>
            <th>Nama Lengkap</th>
            <th>Program Studi</th>
            <th>IPK</th>
            <th>Status</th>
        </tr>

        @forelse ($daftar_mhs as $index => $mhs)
            <tr>
                <td>{{ $index + 1 }}</td>
                <td>{{ $mhs['nim'] }}</td>
                <td>{{ $mhs['nama'] }}</td>
                <td>{{ $mhs['jurusan'] }}</td>
                <td>{{ number_format($mhs['ipk'], 2) }}</td>
                <td>
                    @if ($mhs['ipk'] >= 3.50)
                        <span>Cumlaude</span>
                    @else
                        <span>Sangat Memuaskan</span>
                    @endif
                </td>
            </tr>
        @empty
            <tr>
                <td colspan="6" align="center">
                    Tidak ada data mahasiswa.
                </td>
            </tr>
        @endforelse
    </table>
@endsection
