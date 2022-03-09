package section10;
import java.util.Scanner;
public class eksponen {
    private static int pangkat(int a, int b){
        if(b==1){
            return a;
        }
        else{
            return a * pangkat(a, b - 1);
        }
    }
    public static void main(String[] args){
        System.out.println(pangkat(2,3));
        System.out.println(pangkat(5,3));
        System.out.println(pangkat(10,2));
        System.out.println(pangkat(2,5));
        System.out.println(pangkat(7,3));
    }
}
