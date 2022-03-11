package section11;

public class segitiga extends bangunDatar {
    float sisi1, sisi2, sisi3;

    @Override
    double luas(){
        double luas = 0.5 * (sisi1 * sisi2);
        System.out.println("Luas Segitiga : " + luas);
        return luas;
    }

    @Override
    float keliling(){
        float keliling = sisi1 + sisi2 + sisi3;
        System.out.println("Keliling Segitiga : " + keliling);
        return keliling;
    }

}
