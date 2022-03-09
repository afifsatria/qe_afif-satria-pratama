package section10;

public class prima {
    public static boolean primeNumber(int number){
        int tmp=0;
        boolean prime;
        for(int i=1; i<=number; i++){
            if(number%i == 0){
                tmp = tmp + 1;
            }
        }
        if(tmp == 2){
            prime = true;
        }
        else{
            prime = false;
        }
        return prime;
    }
    public static void main(String[] args){
        System.out.println(primeNumber(11));
        System.out.println(primeNumber(13));
        System.out.println(primeNumber(17));
        System.out.println(primeNumber(20));
        System.out.println(primeNumber(35));
    }
}
