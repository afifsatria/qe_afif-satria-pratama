package section11;

public class mainVolume {
    public static void main(String[] args){
        volume v = new volume(); //object volume.java

        kubus k = new kubus(); //object kubus.java
        k.sisi = 10; // value dari sisi kubus.java

        balok b = new balok();
        b.panjang = 3;
        b.lebar = 6;
        b.tinggi = 10;

        tabung t = new tabung();
        t.r = 7;
        t.tinggi = 10;

        //memanggil method luas dan kelilingnya
        v.volume();
        k.volume();
        b.volume();
        t.volume();
    }
}
