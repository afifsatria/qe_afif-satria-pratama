package section11;

public class tabung extends volume {
    float r, tinggi;

    @Override
    double volume(){
        double volume = (float)(Math.PI) * r * r * tinggi;
        System.out.println("Volume Tabung : " + volume);
        return volume;
    }
}
