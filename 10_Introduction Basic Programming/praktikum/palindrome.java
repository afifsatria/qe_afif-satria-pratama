package section10;
public class palindrome {
    private static boolean palindrome(String value){
        StringBuilder s = new StringBuilder(value);
        s.reverse();
        String reverse = s.toString();
        if(value.equals(reverse)){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args){
        System.out.println(palindrome("civic"));
        System.out.println(palindrome("katak"));
        System.out.println(palindrome("kasur rusak"));
        System.out.println(palindrome("kupu-kupu"));
        System.out.println(palindrome("lion"));
    }
}
