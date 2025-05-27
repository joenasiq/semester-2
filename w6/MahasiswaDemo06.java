package w6;
import java.util.Scanner;
public class MahasiswaDemo06 {
    public static void main(String[] args) {
        Scanner iya=new Scanner(System.in);
        MahasiswaBerprestasi06 list = new MahasiswaBerprestasi06();
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa=iya.nextInt();
        iya.nextLine();

        for (int i=0;i<jumlahMahasiswa;i++) {
            System.out.println("Masukkan data mahasiswa ke-"+(i+1));
            System.out.print("NIM: ");
            String nim=iya.nextLine();
            System.out.print("Nama: ");
            String nama=iya.nextLine();
            System.out.print("Kelas: ");
            String kelas=iya.nextLine();
            System.out.print("IPK: ");
            double ipk=iya.nextDouble();
            iya.nextLine();
            Mahasiswa06 mhs = new Mahasiswa06(nim, nama, kelas, ipk);
            list.tambah(mhs);
        }
        System.out.println("data mahasiswa sebelum sorting");
        list.tampiil();
        System.out.println("data yang sudah terurut menggunakan insertion sort (desc)");
        list.insertionSort();
        list.tampiil();
    }
}