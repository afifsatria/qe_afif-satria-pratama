package section10;

public class asterisk {
    private static void playWithAsterisk(int n){
        for (int i = 1; i <= n; i++){
            for (int j = 4; j >= i; j--){
                System.out.print("*");
            }
            for (int k = 1; k <= i; k++){

            }
            for(int l = 1; l<=i-1; l++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        playWithAsterisk(5);
    }
}
