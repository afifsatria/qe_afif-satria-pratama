# Section Agile Testing

## Resume
Materi yang akan dibahas :
1. Apa itu SDLC?
2. Fase SDLC 
3. Model SDLC
4. Agile Testing Manifesto
5. 5 kunci dalam agile testing manifesto
6. Testing Pyramid

###  Apa itu SDLC (Software Development Life Cycle) ?
proses untuk merancang, mengembangkan, dan menguji software, untuk menyediakan alur terstruktur untuk menghasilkan software kualitas tinggi dengan biaya rendah dan memenuhi kebutuhan.

### Fase SDLC
  1. Requirements Gathering 
    tools apa yang akan digunakan, dan sistem akan dianalisis bagaimana nanti dijalankan, kelebihan kekurangan sistem, fungsi sistem , pembaharuan yang dapat diterapkan
  2. Design 
    membuat model cara kerja aplikasi/software
  3. Development (code) 
    buat test case yang nantinya akan di proyek kecil = dapat ditulis 1 dev aja, kalo besar bisa beberapa tim
  4. Testing 
    sistem diuji sebelum di publish, apakah bisa bekerja optimal atau tidak.
  5. Deployment  
    aplikasi sudah tersedia pada user untuk digunakan
  6. Maintenance
    aplikasi sudah selesai dan bisa digunakan oleh pengguna.
    bisa jadi ada bug pada aplikasi

### Model SDLC
  1. Waterfall 
     Pada model ini setelah melewati fase 1, fase berikutnya dimulai. jika ada satu detail kecil tertinggal maka akan mempengaruhi keseluruhan.
  2. Agile model  
     Pada model ini tim akan mencoba tiap produk yang sudah selesai untuk meminimalisir kesalahan. Hal itu dilakukan agar memicu proyek ke arah yg salah dan ga sesuai keinginan
  3. Iterative model  
     Pada model ini dibutuhkan repetisi tinggi, dapat mengkonsumsi bahan yang diperlukan jika ada 1 detail tertinggal
  4. V-shaped model
     Model ini merupakan lanjutan waterfall model. Pada model ini mencoba tiap fase dalam proses pengembangan suatu produk
  5. Bigbang model
     Model ini memiliki resiko tinggi saat dijalankan, karena semua bahan baku diinvestasikan dalam project tersebut. Model ini hanya berhasil untuk proyek yang kecil dan berbahaya untuk proyek yang besar
  6. Spiral model
     Model ini paling fleksibel dan mirip iterative model. model ini fokus pada repetisi dalam pengerjaannya.

### Agile Testing Manifesto
  hal-hal yang jauh dari agile testing manifesto : 
  - Testing is always behind
  - automation is even further behind that
  - testers can't work until development is done
  - there is pressure at the end of a sprint
  - there is blame around bugs (it's his fault etc.)

### 5 kunci dalam agile testing manifesto
  1. Testing is an "activity" not a phase 
     tester perlu beriringan dengan development. seperti membuat test case sebelum dev menulis code.

  2. "prevent bugs" rather than finding bugs 
     bug dapat muncul karena req yang kurang lengkap/detail. sehingga kita perlu menulis dulu req nya, dengan komunikasi sesama anggota tim.

  3. dont be a checker, be a "tester" 
     jangan hanya mengecek saja dan tidak paham kebutuhan user. maka kita perlu memberikan feedback terhadap apa yg dites

  4. dont try to break the system, instead help "build the best" possible system 
     QE akan mencari positif dan negatif. dan terkadang menemui bug. tapi kita perlu inget bahwa kita ingin membuat software yang berkualitas. sehingga kita perlu memposisikan diri sebagai user. 

  5. the whole "team is responsible" for quality, not just the tester 
     jangan hanya memberikan pekerjaan kepada QE yang tidak terlalu teliti dalam pengecekan bug, atau menyalahkan developer karena salah coding, tapi pada setiap bagian memiliki tanggung jawab.

#### Testing Pyramid
  3 level
  1. UI -> service -> unit test
  2. Ui -> integration -> unit test
  3. unit test itu seperti menguji tiap komponen perangkat lunak, pada saat di buat oleh developer, berupa modul, function, objek dll
  4. integration merupakan pengujian dr hasil gabungan unit2, dilakukan secara bertahap
  5. UI itu seperti testing tingkat tinggi
    semakin tinggi level maka semakin sedikit test yg kita lakukan karena semakin mahal, semakin rendah maka semakin cepat pelaksanaannya