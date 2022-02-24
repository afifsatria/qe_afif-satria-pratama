# Tugas Section 4 - Software Testing Fundamental
1. 
Line Coverage : mengevaluasi pada seberapa banyak baris kode yang ditulis telah dilakukan testing

Mutation Testing : n testing yang dilakukan terhadap suatu program dengan memodifikasi satu bagian kecil dari sebuah fungsi/method kode program. Mutation testing dilakukan untuk menentukan apakah test case sudah cukup atau belum. Nilainya dinamakan dengan mutation score. Score ini bermakna:
- Jika mutation score = 100%, maka test case sudah cukup
- Jika mutation score < 100%, maka test case belum cukup, test case perlu ditambah lagi hingga mutant yang not killable menjadi killable dan mutation score menjadi 100%.

![ss1](./screenshots/ss1.png)
Kemudian disoal nomer 1 seperti gambar diatas penjelasannya adalah:
1. Untuk code di name com.hascode.tutorial.entity untuk line coverage jumlah yang sudah dieksekusi (testing) yaitu 6 baris dari 9 baris line yang dibuat yang berarti masih ada 3 line yang belum di test dengan jumlah persen 67%

2. Untuk mutation covarge memiliki score 67% dengan jumlah 2 yang sudah kill able atau termutasi dan yang 1 masih non kill able yang berarti kitaperlu menambah test case kembali agar mutant yang non kill able menjadi kill able dengan menambah mutant atau mengeditpada line yang masih non kill able yang dapat menjadikan mutant tersebuh kill able sehingga score bisa 100% yang menunjukkan semua telah termutasi dengan sempurna

2. untuk code di name com.hascode.tutorial.service untuk line coverage jumlah yang sudah dieksekusi (testing) yaitu 6 baris dari total 6 baris yang ditunjukkan dengan score line coverage 100%.
kemudian untuk mutation coverage nya memiliki score 75% dengan jumlah 3 yang sudah kill able atau termutasi dan 1 yang masih bersifat non kill able atau belum termutasi yang berartikita perlu menambah test case kembali agar mutant ersebut menjadi kill able dengan menambah mutant atau mengedit pada line yang masih non kill able sehingga score bisa 100% yang menunjukkan semua telah termutasi dengan sempurna

2. 
[tugas.java](./praktikum/tugas.java)
Untuk tugas 2 diatas merupakan algoritma dari coding java. Berdasarkan Public classnya algoritma tersebut berfungsi Calculator. Kemudian didalam public class terdapat public yang memiliki fungsi penambahan dibuktikan dengan add yang terdapat sebagai fungsi penambahan. Kemudian didalamnya mendeklarasi a dan b sebagai objek yang akan diberi inputan dengan c sebagai objek hasil. Ketiga objek tersebut yang nantinya akan terisi dengan sebuah angka yang bertipe integer. Kemudian objek a dan b tersebut di isi dengansuatu nilai yang kemudian ditambah yang akan menghasilkan sebuah angka yang mana akan menjadi nilai dari C. Selanjutnya ada juga pengurangan yang ditandai dengan fungsi substract pada public yang sama sama terdapat objek a dan b sebagai wadah dari nilai yang nanti akan dikurangkan dan c sebagai objek hasil pengurangan. maka ketika a dan b di isi dengan suatu nilai berupa angka kemudian dikurangkan akan menghasilkan c sebagai hasil pengurangan tersebut. namun ketika algoritma tersebut di run hanya menampilkan sebuah notepad karena tidak terdapatnya public void dan algoritma lain didalamnya sebagai pelengkap dan penginisiasinya.
Output:
![ss-hasil](./screenshots/ss-hasil.png)