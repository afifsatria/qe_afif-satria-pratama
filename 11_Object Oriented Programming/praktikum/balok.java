package section11;

public class balok extends volume{
    float panjang, lebar, tinggi;
    @Override
    double volume(){
        double volume = panjang * lebar * tinggi;
        System.out.println("Volume balok : " + volume);
        return volume;
    }
}
