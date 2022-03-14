package bigtask2;
import java.util.*;

public class muatanoop {
    public static void main(String[] args) {
        var ui = new mobil(new Scanner(System.in));
        ui.Start();
    }
}
class hewan{
    float berat;
}
class mobil extends hewan {
    Set<String> muatan = new HashSet<String>();
    float kapasitas;
    String muatanTambahan;
    // memanggil scanner dimanapun pada kelas mobil
    Scanner input;
    mobil(Scanner input){
        this.input=input;
    }
    public void Start(){
        this.tambahMuatan();
    }
    public void tambahMuatan() {
        muatan.add("Mammoth");
        muatan.add("Dinosaurus");
        muatan.add("Godzilla");
        muatan.add("Kingkong");
        System.out.print("Masukkan Sisa Kapasitas : ");
        kapasitas = input.nextFloat();
        System.out.print("Masukkan Nama Hewan : ");
        muatanTambahan = input.next();
        System.out.print("Masukkan Berat Hewan : ");
        berat = input.nextFloat();
        if (berat <= kapasitas) {
            muatan.add(muatanTambahan);
            System.out.println(muatan);
        }

    }
}
