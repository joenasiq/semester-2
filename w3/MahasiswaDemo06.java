package w3;
import java.util.Scanner;
public class MahasiswaDemo06 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Mahasiswa06[] arrayOfMahasiswa=new Mahasiswa06[3];
        String dummy;

        for (int i=0;i<3;i++){
            arrayOfMahasiswa[i]=new Mahasiswa06();
            System.out.println("masukkan data mahasiswa ke-"+(i+1));
            System.out.print("nim   : ");
            arrayOfMahasiswa[i].nim=sc.nextLine();
            System.out.print("nama  : ");
            arrayOfMahasiswa[i].nama=sc.nextLine();
            System.out.print("kelas : ");
            arrayOfMahasiswa[i].kelas=sc.nextLine();
            System.out.print("ipk   : ");
            dummy=sc.nextLine();
            arrayOfMahasiswa[i].ipk=Float.parseFloat(dummy);
            System.out.println("--------------------------------------");
        }
        for(int i=0;i<3;i++){
            System.out.println("data mahasiswa ke-"+(i+1));
            arrayOfMahasiswa[i].cetakInfo();
        }
    }
}
