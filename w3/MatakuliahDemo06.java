package w3;
import java.util.Scanner;
public class MatakuliahDemo06 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("masukkan jumlah mata kuliah: ");
        int jumlahMatkul = Integer.parseInt(sc.nextLine());
        Matakuliah06[] arrayOfMatakuliah=new Matakuliah06[jumlahMatkul];

        for (int i=0;i<jumlahMatkul;i++) {
            System.out.println("masukkan data mata kuliah ke-"+(i+1));
            arrayOfMatakuliah[i]=new Matakuliah06();
            arrayOfMatakuliah[i].tambahData();
        }

        for (int i=0;i<jumlahMatkul;i++) {
            System.out.println("data mata kuliah ke-"+(i+1));
            arrayOfMatakuliah[i].cetakInfo();
        }
    }
}
