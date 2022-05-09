# Post Processor

# Hal yang dipelajari:
1. Apa itu post processor?
2. Json Path

## Apa itu post processor
Elemen rencana pengujian yang digunakan untuk melakukan tindakan tertentu setelah pemrosesan permintaan sampler.  Pemroses pos ini biasanya digunakan untuk mengekstrak nilai tertentu dari respons permintaan sampler, mis.  kita dapat mengekstrak nilai variabel sesi dari permintaan HTTP dan meneruskan nilai variabel sesi ke permintaan berikutnya.

## Json Extractor
- Digunakan untuk ekstrak isi dari json respon
- Beberapa ekspresi yang umum digunakan :
    - $ = root element
    - . = child operator (object)
    - [] = child operator (array)
    - .. = recursive descent (langsung ke objek)
    - * = wildcard (all things)
    - [start:end] = array slice operator borrowed