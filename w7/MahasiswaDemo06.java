package w7;
import java.util.Scanner;
public class MahasiswaDemo06 {
    public static void main(String[] args) {
        Scanner iya=new Scanner(System.in);
        MahasiswaBerprestasi06 list = new MahasiswaBerprestasi06();
        int jumlahMahasiswa=5;

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
        list.tampiil();
        System.out.println("------------------------------------------------");
        System.out.println("pencarian data");
        System.out.println("------------------------------------------------");
        System.out.println("masukkan ipk mahasiswa yang dicari: ");
        System.out.print("ipk: ");
        double cari=iya.nextDouble();
        System.out.println("menggunakan binary search");
        double posisi2=list.findBinarySearch(cari, 0, jumlahMahasiswa-1);
        int pss2=(int)posisi2;
        list.tampilPosisi(cari, pss2);
        list.tampilDataSearch(cari, pss2);
    }
}