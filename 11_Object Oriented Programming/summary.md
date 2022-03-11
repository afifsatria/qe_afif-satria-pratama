# Object Oriented Programming

## Resume
yang dipelajari:
1. Pemrograman Berorientasi Objek  (PBO)
2. Variabel dan Fungsi dalam kelas

## kenapa oop ?
1. Mempercepat pembuatan aplikasi
2. Jika program semakin besar/kompleks, kode kita sulit dipertahankan jika menggunakan prosedural.


## komponen oop
1. Class 
- Kumpulkan prosedur, fungsi, dan variabel, di satu tempat
- Cetak biru suatu objek
- Baru -> kelas java -> nama kelas
- Mewakili objek yang akan dibuat
- Ada aturan penulisan nama kelas (pascal case, dimulai dengan huruf kapital, dan tidak ada spasi di antaranya)

2. Object
- *variabel instan?  instance?* yang merupakan bentuk kelas
- Dijelaskan oleh variabel dan metode
- Berisi beberapa set variabel dan fungsi yang menggambarkan suatu objek

3. Attribute 
- Bagian dari kelas yang masih terkait erat dengan kelas itu
- Properti kelas
- Contoh: kita punya class bernama Car, lalu kita buat atributnya
  kecepatan int;
  ban int;
- Penggunaan atribut berlaku dari kurung kurawal sampai kurung kurawal terakhir {}, ini disebut scope
- Untuk penulisan gunakan huruf kecil, maka kata berikutnya menggunakan huruf kapital., misalnya int listCar;  int daftarGetMethod;

4. Method 
- Menjelaskan bagaimana suatu atribut bertindak
- Peran yang dimaksud berupa perilaku yang digambarkan dengan metode
- Misalnya ada kelas manusia, manusia memiliki perilaku seperti berbicara, makan, berjalan dll.

5. Inheritance 
- Hubungan 2 objek atau lebih 
- Ada objek utama yang mewarisi atribut/metodenya ke objek lain.
- Misalnya, kucing sebagai mamalia mewarisi bulu, telinga, dan mata induknya.
- Menggunakan kata kunci extends.
- Rectangle kelas publik memperluas FlatBuild {}
- Semua anggota di kelas itu dapat diakses oleh anak-anak/subclass mereka kecuali diberi pengubah pribadi

## 3 jenis pengubah
1. Publik = membuat anggota dan kelas dapat diakses dari mana saja.  Misal ada 2 package, maka setiap package memiliki class.  Jadi dari kelas 1, Anda dapat mengakses kelas lain dalam paket yang berbeda.
2. Private = member hanya bisa diakses di dalam kelas itu sendiri.
3. Protected = anggota tersebut dapat diakses oleh kelas tersebut, dan kelas lain tetapi dalam satu paket.  paket lain tidak dapat mengaksesnya.