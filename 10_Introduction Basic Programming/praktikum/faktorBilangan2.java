package section10;
import java.util.Scanner;

public class faktorBilangan2 {
    public static void main(String[] args){

        int bilangan;
        Scanner s =new Scanner(System.in);
        bilangan = s.nextInt();
        System.out.println("Faktor dari Bilangan: ");
        System.out.println("Output: ");
        for(int i=bilangan; i>0; i--) {
            if(bilangan%i == 0){
                System.out.println(i + " ");
            }
        }
    }
}
