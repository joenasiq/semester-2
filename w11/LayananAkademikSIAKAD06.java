package w11;
import java.util.Scanner;
public class LayananAkademikSIAKAD06 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        AntrianLayanan06 antrian=new AntrianLayanan06(5);
        int pilihan;
        do {
            System.out.println("\n=== menu antrian layanan akademik ===");
            System.out.println("1. tambah mahasiswa ke antrian");
            System.out.println("2. layani mahasiswa");
            System.out.println("3. lihat mahasiswa terdepan");
            System.out.println("4. lihat semua antrian");
            System.out.println("5. jumlah mahasiswa dalam antrian");
            System.out.println("6. cek antrian paling belakang");
            System.out.println("0. keluar");
            System.out.print("pilih menu: ");
            pilihan=sc.nextInt();
            sc.nextLine();
            switch(pilihan){
                case 1:
                    System.out.print("NIM: ");
                    String nim=sc.nextLine();
                    System.out.print("nama: ");
                    String nama=sc.nextLine();
                    System.out.print("prodi: ");
                    String prodi=sc.nextLine();
                    System.out.print("kelas: ");
                    String kelas=sc.nextLine();
                    Mahasiswa06 mhs=new Mahasiswa06(nim, nama, prodi, kelas);
                    antrian.tambahAntrian(mhs);
                    break;
                case 2:
                    Mahasiswa06 dilayani=antrian.layaniMahasiswa();
                    if(dilayani != null){
                        System.out.print("melayani mahasiswa: ");
                        dilayani.tampilkanData();
                    }
                    break;
                case 3: 
                    antrian.lihatTerdepan();
                    break;
                case 4:
                    antrian.tampilkanSemua();
                    break;
                case 5:
                    System.out.println("jumlah dalam antrian: "+antrian.getJumlahAntrian());
                    break;
                case 6:
                    antrian.lihatAkhir();
                    break;
                case 0:
                    System.out.println("terima kasih");
                    break;
                default:
                    System.out.println("pilihan tidak valid");
            }
        } while (pilihan !=0);
    }
}
