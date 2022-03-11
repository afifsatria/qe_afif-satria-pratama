package section11;

public class hitungOngkir extends ongkir{
    double berat;
    double harga;
    @Override
    double ongkir(){
        double ongkir = (berat * harga);
        System.out.println("Total Ongkir : " + ongkir);
        return ongkir;
    }
}
