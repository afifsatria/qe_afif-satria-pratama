package bigtask2;
import java.util.Scanner;
//dapat menggunakan multi dimensional array tidak perlu menggunakan oop
public class indeksHuruf {
    public static void main(String[] args) {
        int hasilKolom = 0;
        int hasilBaris = 0;
        //tambah lagi
        char[][] tabelHuruf = {{'A', 'B', 'C', 'D', 'E'}, {'F', 'G', 'H', 'I', 'J'},{'L','M','N','O','P'},{'Q','R','S','T','U'},{'V','W','X','Y','Z'}};
        Scanner s = new Scanner(System.in);
        System.out.print("Masukkan Huruf : ");
        //biar ngebaca semua huruf kecil menjadi besar
        char Huruf = s.nextLine().toUpperCase().charAt(0);
        if (Huruf == 'K'){
            Huruf = 'C';
        }

        for (int baris = 0; baris < tabelHuruf.length; ++baris) {
            for (int kolom = 0; kolom < tabelHuruf[baris].length; ++kolom){
                if (Huruf == tabelHuruf[baris][kolom] ){
                    hasilKolom = kolom;
                    hasilBaris = baris;
                }
            }
        }
        System.out.println((hasilKolom + 1) + " " + (hasilBaris + 1));
    }
}
