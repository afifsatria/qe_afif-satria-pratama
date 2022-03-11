package section11;

public class mainOngkir {
    public static void main(String[] args){
        ongkir o = new ongkir(); //object volume.java

        hitungOngkir ho = new hitungOngkir();
        ho.berat = 1;
        ho.harga = 5000;

        //memanggil method luas dan kelilingnya
        o.ongkir();
        ho.ongkir();
    }
}
