# Praktikum Pemrograman Berorientasi Objek 1 (PO-1) - Modul 3
**Topik:** Input dari Keyboard (Scanner, BufferedReader, JOptionPane, dan GUI Dasar)  
**Lokasi:** `/home/bussparkir/GITHUB KULIAH/SMT3/Po1/P3/`  
**Penulis:** Bhaskoro Prayoga Utomo (2550081109) - Kelas D  

---

## Daftar Berkas Source Code

| No | Nama File | Deskripsi Program |
|:---|:---|:---|
| 1 | `Addition.java` | **Program III-1:** Penjumlahan 2 bilangan bulat menggunakan `java.util.Scanner`. |
| 2 | `ConditionalOperator.java` | **Program III-2:** Modifikasi Program II-7 dengan input nilai grade bertipe `double` dari keyboard. |
| 3 | `GetInputFromKeyboard_Error.java` | **Program III-3a:** Implementasi awal `BufferedReader` yang belum menangani `IOException` (untuk analisis error). |
| 4 | `GetInputFromKeyboard.java` | **Program III-3b:** Perbaikan Program III-3a dengan penanganan blok `try-catch` (`IOException`). |
| 5 | `EksplorasiScanner.java` | **Program III-4:** Penggunaan `Scanner` lengkap (`nextInt()`, `nextLine()`, `nextDouble()`) dengan penanganan *newline skipping*. |
| 6 | `DemoBufferedReader.java` | **Program III-5:** Penggunaan `BufferedReader` untuk input berkinerja tinggi beserta *parsing* ke integer dan double (`throws IOException`). |
| 7 | `ValidasiInputApp.java` | **Program III-6:** Validasi input keyboard menggunakan `Scanner` dan penanganan `InputMismatchException` dalam loop `while`. |
| 8 | `GetInputFromKb.java` | **Program III-7:** Input keyboard berbasis GUI dialog menggunakan `JOptionPane.showInputDialog` dan pesan output `showMessageDialog`. |
| 9 | `GetInputFromKeyboard2.java` | **Program III-8:** Penggunaan kombinasi dialog GUI `JOptionPane` dan output konsol `System.out.println`. |
| 10 | `Grafik.java` | **Program III-9:** Pembuatan panel grafis AWT (`Frame`, `Panel`, `paint`, `Graphics`). |
| 11 | `KalkulatorAritmatika.java` | **Tugas Akhir No. 1:** Program operasi aritmatika 2 operand (`*`, `/`, `+`, `-`) menggunakan kelas `Scanner`. |
| 12 | `HobbyBufferedReader.java` | **Tugas Akhir No. 2:** Program input nama dan hobi menggunakan `BufferedReader` sesuai format luaran yang ditentukan. |
| 13 | `TigaKataJOptionPane.java` | **Tugas Akhir No. 3:** Program meminta input tiga kata menggunakan `JOptionPane` dan menampilkannya ke layar GUI dan terminal. |

---

## Pembahasan Tugas Analisis Modul 3

### Tugas III-1
**Pertanyaan:** Jelaskan terdapat berapa objek pada Program III-1 (`Addition.java`). Bertipe apakah objek tersebut?  
**Jawaban:**
1. **Objek `input`** bertipe `java.util.Scanner`, yang dibuat melalui `new Scanner(System.in)` untuk membaca input pengguna dari stream masukan standar.
2. **Objek `System.in`** bertipe `java.io.InputStream`, yaitu objek aliran masukan standar sistem.
3. **Objek `System.out`** bertipe `java.io.PrintStream`, yaitu objek aliran keluaran standar sistem.
4. **Objek String Literal:**
   - `"Masukkan nilai integer pertama = "`
   - `"Masukkan nilai integer kedua = "`
   - `"Hasil penjumlahannya adalah "`
   Masing-masing merupakan instansiasi dari kelas `java.lang.String`.
*(Catatan: Variabel `num1`, `num2`, dan `sum` bukan objek, melainkan variabel bertipe primitif `int`)*.

---

### Tugas III-3
**Pertanyaan:**
1. Apakah program III-3a dapat berjalan dengan baik? Jika terdapat kesalahan, analisa jenis kesalahannya?
2. Perbaiki Program III-3a menjadi Program III-3b dengan menambahkan blok try dan catch.

**Jawaban:**
1. **Tidak**, Program III-3a tidak dapat dikompilasi / dijalankan (*compile-time error*).  
   **Pesan Error:**
   ```text
   GetInputFromKeyboard_Error.java:15: error: unreported exception IOException; must be caught or declared to be thrown
           name = dataIn.readLine();
                                 ^
   ```
   **Analisis Jenis Kesalahan:**  
   Metode `readLine()` pada kelas `BufferedReader` berpotensi memicu *checked exception* bertipe `java.io.IOException` (misalnya kegagalan saat membaca aliran input I/O). Dalam aturan bahasa Java, *checked exception* wajib ditangani secara eksplisit menggunakan mekanisme penanganan exception (`try-catch`) atau dideklarasikan pada header metode (`throws IOException`). Karena pada Program III-3a tidak ada keduanya, kompilator menolak kode tersebut.
2. **Perbaikan (Program III-3b):**  
   Diterapkan pada berkas `GetInputFromKeyboard.java` dengan menambahkan blok `try-catch`:
   ```java
   try {
       name = dataIn.readLine();
   } catch (IOException e) {
       System.out.println("Error in getting input");
   }
   ```

---

### Tugas III-7
**Pertanyaan:** Jelaskan mengenai method pada Program III-4 (`EksplorasiScanner.java`)!  
**Jawaban:**
1. `nextInt()`: Membaca token berikutnya sebagai bilangan bulat bertipe `int`. Metode ini hanya mengonsumsi digit angka dan membiarkan karakter baris baru (`\n` / enter) tetap berada di dalam buffer.
2. `nextLine()`:
   - *Pembersih buffer (Buffer flushing)*: Digunakan tepat setelah `nextInt()` untuk membuang karakter sisa `\n` dari buffer, sehingga input baris teks berikutnya tidak terlewati (*newline skipping*).
   - *Pembaca baris*: Membaca seluruh karakter teks dalam satu baris hingga menemukan penanda akhir baris (enter), digunakan untuk membaca nama lengkap dan nama jurusan.
3. `nextDouble()`: Membaca token numerik berikutnya dan mengonversinya menjadi bilangan desimal/pecahan bertipe `double` (misalnya nilai IPK).
4. `print()`: Menampilkan keluaran string ke terminal tanpa menambahkan karakter baris baru di akhir.
5. `println()`: Menampilkan keluaran string ke terminal lalu memindahkan kursor ke baris baru (*newline*).
6. `close()`: Menutup stream `Scanner` dan membebaskan sumber daya I/O yang teralokasi pada sistem.

---

### Tugas III-8
**Pertanyaan:** Compile Program III-5 (`DemoBufferedReader.java`) hingga dapat dieksekusi!  
**Jawaban:**
Kompilasi dan eksekusi pada terminal:
```bash
javac DemoBufferedReader.java
java DemoBufferedReader
```
*Program ini menggunakan klausa `throws IOException` pada deklarasi `main`, sehingga pengecualian I/O didelegasikan langsung ke Java Virtual Machine (JVM).*

---

### Tugas III-9
**Pertanyaan:** Analisis Program III-9 (`Grafik.java`)!  
**Jawaban:**
Program III-9 mendemonstrasikan pemrograman grafis berbasis GUI menggunakan Java Abstract Window Toolkit (AWT):
- **Inheritance Panel:** Kelas `Grafik` mewarisi (*extends*) `java.awt.Panel` sebagai kontainer grafis kustom.
- **Konstruktor `Grafik()`:** Mengatur warna latar belakang panel menjadi warna hitam dengan `setBackground(Color.black)`.
- **Method `paint(Graphics g)`:** Method lifecycle AWT yang dioverride untuk menggambar objek 2 dimensi pada kanvas:
  - `g.setColor(new Color(0, 255, 0))`: Mengeset kuas ke warna hijau cerah via nilai RGB `(r, g, b)`.
  - `g.setFont(new Font("Helvetica", Font.PLAIN, 16))`: Mengatur tipe font Helvetica, gaya plain, ukuran 16 pt.
  - `g.drawString("Hello GUI World!", 30, 100)`: Menggambar teks pada titik koordinat piksel (x=30, y=100).
  - `g.setColor(new Color(1.0f, 0, 0))`: Mengeset kuas ke warna merah via nilai float `(r, g, b)`.
  - `g.fillRect(30, 100, 150, 10)`: Menggambar bidang persegi panjang terisi (*filled rectangle*) mulai titik koordinat x=30, y=100 dengan lebar 150 piksel dan tinggi 10 piksel.
- **Method `main`:** Menginisialisasi komponen top-level window `Frame` dengan judul *"Testing Graphics Panel"*, memasukkan panel `Grafik` ke dalamnya (`f.add(gp)`), menetapkan dimensi jendela 600x300 piksel (`f.setSize`), serta menampilkannya ke layar (`f.setVisible(true)`).

---

### Tugas Akhir No. 4
**Pertanyaan:** Jelaskan apa yang Anda ketahui mengenai method `nextInt()`!  
**Jawaban:**
- **Definisi:** `nextInt()` adalah metode dari kelas `java.util.Scanner` yang digunakan untuk memindai token masukan berikutnya dari aliran masukan standar (`System.in`) dan mengonversinya menjadi tipe data primitif `int`.
- **Mekanisme Delimiter:** Secara default, `nextInt()` menggunakan spasi (*whitespace* seperti spasi, tab, atau enter) sebagai pembatas token. Karakter non-digit sebelum token akan dilewati hingga menemukan angka.
- **Pengecualian (*Exceptions*):**
  - Melempar `InputMismatchException` jika token yang dibaca bukan representasi integer yang valid atau berada di luar rentang nilai `int` (misal memasukkan huruf `"abc"` atau angka desimal `3.14`).
  - Melempar `NoSuchElementException` jika aliran input habis (*EOF*) sebelum menemukan token.
  - Melempar `IllegalStateException` jika objek Scanner telah ditutup (`close()`).
- **Isu Newline Skipping:** `nextInt()` hanya mengonsumsi digit numerik dan **tidak** menyerap karakter penanda akhir baris (`\n`). Jika baris berikutnya dibaca menggunakan `nextLine()`, metode `nextLine()` akan langsung membaca karakter sisa `\n` tersebut sehingga tampak terlewati (*skipped*). Penanganannya adalah dengan menambahkan `scanner.nextLine()` ekstra untuk membersihkan buffer.

---

## Panduan Kompilasi & Menjalankan Program

Untuk mengompilasi seluruh program yang valid:
```bash
javac Addition.java ConditionalOperator.java GetInputFromKeyboard.java EksplorasiScanner.java DemoBufferedReader.java ValidasiInputApp.java GetInputFromKb.java GetInputFromKeyboard2.java Grafik.java KalkulatorAritmatika.java HobbyBufferedReader.java TigaKataJOptionPane.java
```

Untuk menjalankan program:
```bash
# Menjalankan Program III-1
java Addition

# Menjalankan Program III-2
java ConditionalOperator

# Menjalankan Program III-3b
java GetInputFromKeyboard

# Menjalankan Program III-4
java EksplorasiScanner

# Menjalankan Program III-5
java DemoBufferedReader

# Menjalankan Program III-6
java ValidasiInputApp

# Menjalankan Program III-7
java GetInputFromKb

# Menjalankan Program III-8
java GetInputFromKeyboard2

# Menjalankan Tugas Akhir 1
java KalkulatorAritmatika

# Menjalankan Tugas Akhir 2
java HobbyBufferedReader

# Menjalankan Tugas Akhir 3
java TigaKataJOptionPane
```
