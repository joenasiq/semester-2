package w13;
import java.util.Scanner;
public class vaksinMain06 {
    public static void main(String[] args) {
        Scanner input06=new Scanner(System.in);
        queueDll06 antri=new queueDll06();
        int pilih;

        do { 
            System.out.println("+++++++++++++++++++++++++++++");
            System.out.println("PENGANTRI VAKSIN EXTRAVAGANZA");
            System.out.println("+++++++++++++++++++++++++++++");
            System.out.println("1. tambah data penerima vaksin");
            System.out.println("2. hapus data pengantri vaksin");
            System.out.println("3. daftar penerima vaksin");
            System.out.println("4. keluar");
            System.out.println("+++++++++++++++++++++++++++++");
            pilih = input06.nextInt();
            input06.nextLine();

            switch (pilih) {
                case 1:
                    System.out.println("-----------------------------");
                    System.out.println("masukkan data penerima vaksin");
                    System.out.println("-----------------------------");
                    System.out.print("nomor antrian: ");
                    int no=input06.nextInt();
                    input06.nextLine();
                    System.out.print("nama penerima: ");
                    String nama=input06.nextLine();
                    antri.enqueue(no,nama);
                    break;
                case 2:
                    antri.dequeue();
                    antri.print();
                    break;
                case 3:
                    antri.print();
                    break;
                case 4:
                    System.out.println("terima kasih");
                    break;
                default:
                    System.out.println("pilihan tidak valid");
            }
        } while (pilih != 4);
    }
}
