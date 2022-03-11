package section11;

public class pembagian extends calc {
    int a, b;
    @Override
    int calc(){
        int calc = a / b;
        System.out.println("Hasil Pembagian : " + calc);
        return calc;
    }
}
