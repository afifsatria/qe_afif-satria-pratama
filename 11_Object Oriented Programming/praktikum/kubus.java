package section11;

public class kubus extends volume {
    float sisi;
    @Override
    double volume(){
        double volume = sisi * sisi * sisi;
        System.out.println("Volume Kubus : " + volume);
        return volume;
    }

}
