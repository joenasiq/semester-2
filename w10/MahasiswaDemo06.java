package w10;
import java.util.Scanner;
public class MahasiswaDemo06 {
    public static void main(String[] args) {
        StackTugasMahasiswa06 stack=new StackTugasMahasiswa06(5);
        Scanner scan=new Scanner(System.in);
        int pilih;
        do { 
            System.out.println("\nMenu: ");
            System.out.println("1. mengumpulkan tugas");
            System.out.println("2. menilai tugas");
            System.out.println("3. melihat tugas teratas");
            System.out.println("4. melihat daftar tugas");
            System.out.println("5. melihat tugas pertama dikumpulkan");
            System.out.println("6. melihat jumlah tugas yang dikumpulkan");
            System.out.println("7. keluar");
            System.out.print("pilih: ");
            pilih=scan.nextInt();
            scan.nextLine();
            switch(pilih){
                case 1:
                    System.out.print("Nama: ");
                    String nama=scan.nextLine();
                    System.out.print("NIM: ");
                    String nim=scan.nextLine();
                    System.out.print("kelas: ");
                    String kelas=scan.nextLine();
                    Mahasiswa06 mhs=new Mahasiswa06(nama, nim, kelas);
                    stack.push(mhs);
                    System.out.printf("tugas %s berhasil dikumpulkan\n",mhs.nama);
                    break;
                case 2:
                    Mahasiswa06 dinilai=stack.pop();
                    if(dinilai != null){
                        System.out.println("Menilai tugas dari "+dinilai.nama);
                        int nilai;
                        do {
                            System.out.print("Masukkan nilai(0-100): ");
                            nilai=scan.nextInt();
                        } while (nilai<0 || nilai>100);
                        dinilai.tugasDinilai(nilai);
                        System.out.printf("Nilai tugas %s adalah %d\n", dinilai.nama, nilai);
                        String biner=stack.konversiDesimalKeBiner(nilai);
                        System.out.println("nilai biner tugas: "+biner);
                    }
                    break;
                case 3:
                    Mahasiswa06 lihat=stack.peek();
                    if(lihat != null){
                        System.out.println("tugas terakhir dikumpulkan oleh "+lihat.nama);
                    }
                    break;
                case 4:
                    System.out.println("daftar semua tugas");
                    System.out.println("Nama\tNIM\tKelas");
                    stack.print();
                    break;
                case 5:
                    Mahasiswa06 terbawah=stack.bottom();
                    if (terbawah != null) {
                        System.out.println("tugas pertama dikumpulkan oleh: "+terbawah.nama);
                    }
                    break;
                case 6:
                    System.out.println("jumlah tugas yang dikumpulkan saat ini: "+stack.hitungTugas());
                    break;
                case 7:
                    System.out.println("keluar dari program");
                    break;
                default:
                    System.out.println("pilihan tidak valid!");
                
            }
            
        } while (pilih != 7);

    }
}
