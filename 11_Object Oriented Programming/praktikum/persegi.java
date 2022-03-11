package section11;

public class persegi extends bangunDatar {
    float sisi;

    @Override
    double luas(){
        double luas = sisi * sisi;
        System.out.println("Luas Persegi ; " + luas);
        return luas;
    }

    @Override
    float keliling(){
        float keliling = 4 * sisi;
        System.out.println("Keliling Persegi : " + keliling);
        return keliling;
    }
}
