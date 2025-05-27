package w7;
import java.util.Scanner;
public class DosenDemo06 {
    public static void main(String[] args) {
        Scanner wow=new Scanner(System.in);
        DataDosen06 data=new DataDosen06();
        int menu;
        do {
            System.out.println("---------------------------");
            System.out.println("1. Tambah Data Dosen");
            System.out.println("2. Tampil Data Dosen");
            System.out.println("3. Cari Dosen Berdasarkan Nama");
            System.out.println("4. Cari Dosen Berdasarkan Usia");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            menu=wow.nextInt();
            wow.nextLine();

            switch (menu) {
                case 1:
                    System.out.println("usahakan memasukkan data dosen urut usia dari termuda ke tertua(asc)");
                    System.out.println("---------------------------");
                    System.out.print("Masukkan nama dosen: ");
                    String nama=wow.nextLine();
                    System.out.print("Masukkan kode dosen: ");
                    String kode=wow.nextLine();
                    System.out.print("Masukkan usia dosen: ");
                    int usia=wow.nextInt();
                    System.out.println("true=Laki-laki || false=Perempuan");
                    System.out.print("Masukkan jenis kelamin: ");
                    boolean jk=wow.nextBoolean();
                    wow.nextLine();
                    data.tambah(new Dosen06(kode,nama,jk,usia));
                    break;
                case 2:
                    System.out.println("Data Dosen:");
                    data.tampil();
                    break;
                case 3:
                    System.out.print("Masukkan nama dosen yang ingin dicari: ");
                    String cariNama=wow.nextLine();
                    data.pencarianDataSequential06(cariNama);
                    break;
                case 4:
                    System.out.print("Masukkan usia dosen yang ingin dicari: ");
                    int cariUsia=wow.nextInt();
                    data.pencarianDataBinary06(cariUsia);
                    break;
                case 5:
                    System.out.println("Keluar dari program");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }while(menu!=5);
    }
}
