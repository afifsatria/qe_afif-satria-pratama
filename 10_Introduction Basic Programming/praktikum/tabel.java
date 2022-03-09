package section10;
import java.util.Scanner;
public class tabel {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Masukkan Nilai x: ");
        int x = s.nextInt();
        System.out.print("Masukkan Nilai y: ");
        int y = s.nextInt();
        for(int i = 1; i <= x; i++){
            for(int j = 1; j <= y; j++){
                System.out.print(" " + i*j + "\t");
            }
            System.out.print("\n\n");
        }

    }
}
