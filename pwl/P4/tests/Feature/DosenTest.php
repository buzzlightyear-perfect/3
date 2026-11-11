<?php

namespace Tests\Feature;

use Tests\TestCase;

class DosenTest extends TestCase
{
    public function test_dosen_index_page_can_be_rendered(): void
    {
        $response = $this->get('/dosen');

        $response->assertStatus(200);
        $response->assertSee('Daftar Dosen Pengampu Mata Kuliah');
        $response->assertSee('Dr. Bhaskoro Prayoga U, S.Kom., M.T.');
        $response->assertSee('Dosennya Maha Sibuk');
        $response->assertSee('Regular');
    }

    public function test_dosen_create_page_can_be_rendered(): void
    {
        $response = $this->get('/dosen/tambah');

        $response->assertStatus(200);
        $response->assertSee('Form Tambah Dosen');
    }

    public function test_mahasiswa_pages_can_be_rendered(): void
    {
        $response = $this->get('/mahasiswa');
        $response->assertStatus(200);
        $response->assertSee('Data Mahasiswa Terdaftar');

        $response = $this->get('/mahasiswa/tambah');
        $response->assertStatus(200);
        $response->assertSee('Form Tambah Mahasiswa');
    }
}
