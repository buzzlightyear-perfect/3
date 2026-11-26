
<?php

namespace Database\Seeders;

use Illuminate\Database\Seeder;
use Illuminate\Support\Facades\DB;

class MahasiswaSeeder extends Seeder
{
    public function run(): void
    {
        DB::table('mahasiswa')->insert([
            [
                'nim' => '2112001',
                'nama' => 'Dimas Prikitiw',
                'email' => 'dimas@unjani.com',
                'jurusan' => 'Informatika',
                'alamat' => 'Jl. Terusan Jenderal Sudirman No. 1, Cimahi',
                'created_at' => now(),
                'updated_at' => now(),
            ],
            [
                'nim' => '2112002',
                'nama' => 'Siti Nurhaliza',
                'email' => 'siti@unjani.com',
                'jurusan' => 'Informatika',
                'alamat' => 'Jl. Gatot Subroto No. 45, Bandung',
                'created_at' => now(),
                'updated_at' => now(),
            ],
        ]);
    }
}
