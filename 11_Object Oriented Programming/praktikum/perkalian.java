package section11;

public class perkalian extends calc {
    int a, b;
    @Override
    int calc(){
        int calc = a * b;
        System.out.println("Hasil Perkalian : " + calc);
        return calc;
    }
}
