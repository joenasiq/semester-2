package w10;
import java.util.Scanner;
public class SuratDemo06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StackSurat06 data = new StackSurat06(10);
        int pilihan;

        do {
            System.out.println("============================================");
            System.out.println("Menu Surat Izin Mahasiswa");
            System.out.println("1. terima surat izin");
            System.out.println("2. proses surat izin");
            System.out.println("3. lihat surat izin terakhir");
            System.out.println("4. cari surat izin berdasarkan nama mahasiswa");
            System.out.println("5. keluar");
            System.out.print("Pilih menu: ");
            pilihan=input.nextInt(); input.nextLine();
            switch (pilihan) {
                case 1:
                    System.out.println("============================================");
                    System.out.print("ID surat: ");
                    String id = input.nextLine();
                    System.out.print("nama mahasiswa: ");
                    String nama = input.nextLine();
                    System.out.print("kelas: ");
                    String kelas = input.nextLine();
                    char jenis;
                    do {
                        System.out.print("masukkan jenis izin (S/I): ");
                        jenis = input.next().toUpperCase().charAt(0);
                        if (jenis!='S' && jenis!='I') {
                            System.out.println("Jenis izin tidak valid");
                        }
                    } while(jenis!='S' && jenis!='I');
                    System.out.print("durasi (hari): ");
                    int durasi = input.nextInt(); input.nextLine();
                    Surat06 srt = new Surat06(id, nama, kelas, jenis, durasi);
                    data.push(srt);
                    break;
                case 2:
                    System.out.println("============================================");
                    Surat06 diproses=data.pop();
                    if(diproses != null){
                        System.out.println("Memverifikasi surat: ");
                        diproses.tampil();
                    }
                    break;
                case 3:
                    System.out.println("============================================");
                    Surat06 teratas=data.peek();
                    if(teratas != null){
                        System.out.println("surat Terakhir: ");
                        teratas.tampil();
                    }
                    break;
                case 4:
                    System.out.println("============================================");
                    System.out.print("masukkan nama mahasiswa: ");
                    String cariNama=input.nextLine();
                    data.cariSurat(cariNama);
                    break;
                case 5:
                    System.out.println("keluar dari program");
                    break;
                default:
                    System.out.println("pilihan tidak valid");
            }
        }while(pilihan!=5);
    }
}
