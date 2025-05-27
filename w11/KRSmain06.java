package w11;
import java.util.Scanner;
public class KRSmain06 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        AntrianKRS06 antrian = new AntrianKRS06(10);
        int pilih;

        do {
            System.out.println("\n=== MENU ANTRIAN KRS DPA ===");
            System.out.println("1. tambah Mahasiswa ke Antrian");
            System.out.println("2. panggil 2 Mahasiswa (Proses KRS)");
            System.out.println("3. tampilkan Semua Antrian");
            System.out.println("4. lihat 2 Antrian Terdepan");
            System.out.println("5. lihat Antrian Paling Akhir");
            System.out.println("6. cetak Jumlah Antrian");
            System.out.println("7. cetak Jumlah Sudah Proses");
            System.out.println("8. cetak Jumlah Belum Proses");
            System.out.println("0. keluar");
            System.out.print("pilih: ");
            pilih = sc.nextInt(); 
            sc.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("NIM: ");
                    String nim=sc.nextLine();
                    System.out.print("Nama: ");
                    String nama=sc.nextLine();
                    System.out.print("Prodi: ");
                    String prodi=sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas=sc.nextLine();
                    antrian.tambahAntrian(new KRS06(nim, nama, prodi, kelas));
                    break;
                case 2:
                    antrian.panggilDuaMahasiswa();
                    break;
                case 3:
                    antrian.tampilkanSemua();
                    break;
                case 4:
                    antrian.lihatDuaTerdepan();
                    break;
                case 5:
                    antrian.lihatAkhir();
                    break;
                case 6:
                    System.out.println("jumlah dalam antrian: "+antrian.getJumlahQueue());
                    break;
                case 7:
                    System.out.println("jumlah sudah proses KRS: "+antrian.getsudahProses());
                    break;
                case 8:
                    System.out.println("jumlah belum proses KRS: "+antrian.getBelumProses());
                    break;
                case 0:
                    System.out.println("terima kasih");
                    break;
                default:
                    System.out.println("pilihan tidak valid");
            }
        } while (pilih != 0);
    }
}
