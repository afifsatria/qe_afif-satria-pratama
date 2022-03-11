package section11;

public class penjumlahan extends calc {
    int a, b;
    @Override
    int calc(){
        int calc = a + b;
        System.out.println("Hasil Penjumlahan : " + calc);
        return calc;
    }
}
