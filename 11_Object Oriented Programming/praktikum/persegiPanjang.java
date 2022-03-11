package section11;

public class persegiPanjang extends bangunDatar{
    float panjang, lebar;

    @Override
    double luas(){
        double luas = panjang * lebar;
        System.out.println("Luas Persegi Panjang : " + luas);
        return luas;
    }

    @Override
    float keliling(){
        float keliling = (2 * panjang) + (2 * lebar);
        System.out.println("Keliling Persegi Panjang : " + keliling);
        return keliling;
    }
}
