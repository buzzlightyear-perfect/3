<?php

namespace App\Http\Controllers;

use Illuminate\View\View;

class DosenController extends Controller
{
  
    public function index(): View
    {
        $daftar_dosen = [
            [
                'nip' => '198503122015041001',
                'nama' => 'Dr. Bhaskoro Prayoga U, S.Kom., M.T.',
                'mk' => 'Pemrograman Web Lanjut',
                'sks' => 3,
            ],
            [
                'nip' => '198711052019031002',
                'nama' => 'Faisal Fajari, S.ST., M.T.',
                'mk' => 'Framework Lanjutan',
                'sks' => 3,
            ],
            [
                'nip' => '199001272020122003',
                'nama' => 'Rhadian Arya, S.Kom., M.Cs.',
                'mk' => 'Pemrograman Perangkat Bergerak',
                'sks' => 3,
            ],
            [
                'nip' => '198206182014021004',
                'nama' => 'Fawaz, S.Kom., M.M.',
                'mk' => 'Proyek Perangkat Lunak',
                'sks' => 4,
            ],
        ];

        return view('dosen.index', compact('daftar_dosen'));
    }

    public function create(): View
    {
        return view('dosen.create');
    }
}
