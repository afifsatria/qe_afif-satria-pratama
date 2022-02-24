# Tugas Section 4 - Software Testing Fundamental
1. 
Line Coverage : mengevaluasi pada seberapa banyak baris kode yang ditulis telah dilakukan testing

Mutation Testing : testing yang dilakukan terhadap suatu program dengan memodifikasi satu bagian kecil dari sebuah fungsi/method kode program. Mutation testing dilakukan untuk menentukan apakah test case sudah cukup atau belum. Nilainya dinamakan dengan mutation score. Score ini bermakna:
- Jika mutation score = 100%, maka test case sudah cukup
- Jika mutation score < 100%, maka test case belum cukup, test case perlu ditambah lagi hingga mutant yang not killable menjadi killable dan mutation score menjadi 100%.


Kemudian disoal nomer 1 seperti gambar diatas penjelasannya adalah:
a. Untuk code di name com.hascode.tutorial.entity untuk line coverage jumlah yang sudah dieksekusi (testing) yaitu 6 baris dari 9 baris line yang dibuat yang berarti masih ada 3 line yang belum di test dengan jumlah persen 67%. Untuk mutation covarge memiliki score 67% dengan jumlah 2 yang sudah kill able atau termutasi dan yang 1 masih non kill able yang berarti kitaperlu menambah test case kembali agar mutant yang non kill able menjadi kill able dengan menambah mutant atau mengeditpada line yang masih non kill able yang dapat menjadikan mutant tersebuh kill able sehingga score bisa 100% yang menunjukkan semua telah termutasi dengan sempurna

b. untuk code di name com.hascode.tutorial.service untuk line coverage jumlah yang sudah dieksekusi (testing) yaitu 6 baris dari total 6 baris yang ditunjukkan dengan score line coverage 100%.
kemudian untuk mutation coverage nya memiliki score 75% dengan jumlah 3 yang sudah kill able atau termutasi dan 1 yang masih bersifat non kill able atau belum termutasi yang berartikita perlu menambah test case kembali agar mutant ersebut menjadi kill able dengan menambah mutant atau mengedit pada line yang masih non kill able sehingga score bisa 100% yang menunjukkan semua telah termutasi dengan sempurna

2. 
Coding diatas merupakan class dari Calculator yang didalamnya ada fungsi add dan subtract. untuk fungsi dapat berhasil dan berwarna hijau dikarenakan fungsi tersebut tidak ada kesalahan. Sedangkan untuk fungsi subtract gagal dan ditandai dengan warna merah dikarenakan untuk pengurangan seharusnya dimulai dari angka atau nilai yang terbesar dikurangi dengan angka atau nilai yang terkecil dan didalam fungsi tersebut disebutkan a-b dan belum tentu variabel a bernilai lebih besar daripada b bisa juga ternyata variabel b merupakan nilai yang paling besar daripada a. 
