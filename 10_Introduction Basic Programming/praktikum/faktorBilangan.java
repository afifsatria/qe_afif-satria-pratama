package section10;

import java.util.Scanner;

public class faktorBilangan {
    public static void main(String[] args){
        int bilangan;
        Scanner s =new Scanner(System.in);
        bilangan = s.nextInt();
        System.out.println("Output: ");
        for(int i=1; i  <= bilangan; i++){
            if(bilangan%i == 0){
                System.out.println(i  + " ");
            }
        }
    }
}
