package section11;

public class pengurangan extends calc {
    int a, b;
    @Override
    int calc(){
        int calc = a - b;
        System.out.println("Hasil Pengurangan : " + calc);
        return calc;
    }
}
