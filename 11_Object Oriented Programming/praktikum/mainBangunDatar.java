package section11;

public class mainBangunDatar {
    public static void main(String[] args){
        bangunDatar BD = new bangunDatar(); //object bangunDatar.java

        persegi p = new persegi(); //object persegi.java
        p.sisi = 4; // value dari sisi persegi.java

        segitiga s = new segitiga();
        s.sisi1 = 3;
        s.sisi2 = 4;
        s.sisi3 = 5;

        persegiPanjang pp = new persegiPanjang();
        pp.panjang = 7;
        pp.lebar = 8;

        //memanggil method luas dan kelilingnya
        BD.luas();
        BD.keliling();

        p.luas();
        p.keliling();

        s.luas();
        s.keliling();

        pp.luas();
        pp.keliling();

    }
}
