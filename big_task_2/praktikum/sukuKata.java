package bigtask2;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class sukuKata {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("[^aeiouy]*[aeiouy]+(?:[^aeiouy]*$|[^aeiouy](?=[^aeiouy]))?", Pattern.CASE_INSENSITIVE);
        Scanner s = new Scanner(System.in);
        System.out.print("Masukkan Kata :");
        String Kata = s.nextLine();
        Matcher matcher = pattern.matcher(Kata);
        while (matcher.find()){
            if (matcher.group().contains("o")){
                System.out.print("-");
            }
            else {
                System.out.print(".");
            }
        }
    }
}