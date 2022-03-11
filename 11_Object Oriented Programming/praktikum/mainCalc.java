package section11;

public class mainCalc {
        public static void main(String[] args){
            calc c = new calc(); //object volume.java

            penjumlahan tambah = new penjumlahan(); //object penjumlahan.java
            tambah.a = 3; // value dari int a penjumlahan
            tambah.b = 4;

            pengurangan kurang = new pengurangan();
            kurang.a = 15;
            kurang.b = 4;

            perkalian kali = new perkalian();
            kali.a = 10;
            kali.b = 10;

            pembagian bagi = new pembagian();
            bagi.a = 12;
            bagi.b = 3;

            //memanggil method luas dan kelilingnya
            c.calc();
            tambah.calc();
            kurang.calc();
            kali.calc();
            bagi.calc();
        }
}
