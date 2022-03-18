# PENGENALAN RESTFUL API / BASIC OF API TESTING
  
## Resume  
Materi yang di pelajari :
1. API & REST API
2. Testing API
3. Advantages & Challange testing Api

## API & REST API
API (Application Programming Interface) adalah penghubung antara server dan aplikasi yang memungkinkan aplikasi berinteraksi dengan aplikasi lain dan dapat berbagi data.

Tujuan menggunakan API
Untuk mempercepat proses pengembangan dengan memberikan fungsi secara terpisah, sehingga pengembang tidak perlu membuat sayuran serupa. Kebakaran bertindak sebagai utusan yang menerima permintaan dari pengguna dan mengatakan kepada sistem untuk melakukannya kemudian menanggapi permintaan permintaan.

Rest API (Representational State Transfer) adalah arsitektur komunikasi berbasis web standar yang sering diterapkan dalam pengembangan layanan berbasis web. Umumnya menggunakan HTTP (Hypertext Transfer Protocol) sebagai protokol untuk komunikasi data. Sisanya juga merupakan salah satu implementasi layanan web sebagai tanda yang digunakan untuk pertukaran data antara aplikasi dan sistem.

Break API berisi aturan atau batasan yang dapat membatasi programmer untuk mengakses atau melaksanakan tindakan tertentu dalam database. Jika api adalah penghubung, sisanya adalah aturan sesuai dengan keinginan programmer dalam merancang layanan web. Kesederhanaan, ada permintaan dan respons terhadap data yang dikirim atau diterima. Data yang digunakan dalam Break API umumnya JSON.
  
HTTP (Hypertext Transfer Protocol) dirancang untuk memungkinkan komunikasi antara klien dan server. HTTP berfungsi sebagai respons protokol dari permintaan dan server klien. 

HTTP Method yang sering digunakan yaitu :
1. Get 
Digunakan untuk mengambil informasi tentang resource yang telah ditentukan oleh URL. Secara singkat get digunakan untuk membaca data. get merupakan metode yang aman berarti bahwa permintaan mendapatkannya mungkin tidak menghasilkan perubahan pada status server. Seharusnya tidak menyebabkan pembuatan, pembaruan atau penghapusan metode aplikasi ini metode ini harus dilakukan beraksi saja.
2. Put 
Metode ini digunakan untuk membuat resource baru
3. Post
Metode ini digunakan untuk mengirim data baru ke server. Sederhana digunakan untuk memperbarui resource yang ada atau membuat yang baru 
4. Delete
Metode ini digunakan untuk menghapus resource

## REST API COMPONENT
Terdiri dari 4 :
1. Method 
(Get, Put, Post, Delete)
2. Url (base URL + Path)
cara untuk mendapatkan request. URL terdiri dari kata kunci yang menunjukkan ke server apa yang coba kita lakukan. Contohnya : https://alta.id  
3. Header
merupakan kumpulan dari field dan value yang terkait dengan pemberian informasi tentang pesan ke penerima. juga berisi informasi autentikasi yang memberitahu pesan tsb sah
4. Body
Mendefinisikan parameter apa ynag dikirimkan ke server, ini menentukan apa informasi yang akan diupdate, dibuat maupun dihapus.

## APA ITU JSON ?
JSON (Java Script Notation) adalah format data yang digunakan untuk pertukaran dan penyimpanan data. JSON adalah bagian dari Javascript. JSON dapat dibaca dengan berbagai bahasa pemrograman seperti C, C ++, C #, Java, Javascript Perl, Python, dan banyak lagi. Ini membuat Bahasa JSON ideal untuk hubungan data antar aplikasi.

HTTP RESPONSE CODE, seperti :
1. 200 OK : menandakan bahwa request yang dikirim succes 
2. 201 created : menandakan bahwa request yang dikirim succes dan resourcenya berhasil dibuat (biasanya digunakan untuk method post dan put)
3. 400 bad request : Terjadi ketika kita mengajukan request post / put dan datanya tidak sesuai atau ada kesalahan dalam formatnya
4. 404 not found : terjadi ketika resource yang diperlukan tidak ditemukan
5. 401 unouthorized : terjadi ketika tidak melakukan authentication terlebih dahulu sebelum melakukan request 
6. 405 method : ketika request tidak support atau salah http methodnya misalnya, ketika ingin melakukan post tapi kita menggunakan method get 
7. 500 internal : eror ini karna ada kesalahan di server 

## TESTING API  
memastikan functional API diharapkan bisa ngasih gambaran gimana respon aplikasi web, tanpa ataupun GUI nya siap meluaskan cakupan testing, melakukan testing sedini mungking, dimana GUI belum sepenuhnya siap untuk disertakan dalam proses testing 
 
## Kind of API Testing 
- functionality = untuk memvalidasi suatu fitur apakah sudah berfungsi atau belum 
- load test = menguji kekuatan suatu sistem, apakah bisa menjalankan beban yg diberikan 
- security = menguji keamanan suatu sistem 
tools yang digunakan : postman, frsby, jmeter, rest assured. 
  
## Tahapan melakukan API Testing 
- spesification review = mereview dari speisifikasi API dan use case dokumen 
- Specification dev 
- framework dev = milih tools API testing 
- test case dev = bikin test scenario dan test case 
- execution & report 
 
## Advantages of testing Api 
- efisiensi waktu 
- bahasa yang independen 
- mengurangi biaya testing 
- mengurangi resiko 
 