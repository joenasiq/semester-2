package w12;
import java.util.Scanner;
public class main6 {
    public static void main(String[] args) {
        Scanner input6=new Scanner(System.in);
        queue6 antrian=new queue6(10);
        int menu;
        
        do {
            System.out.println("1. tambah antrian");
            System.out.println("2. panggil antrian");
            System.out.println("3. cek antrian kosong");
            System.out.println("4. cek antrian penuh");
            System.out.println("5. tampilkan semua antrian");
            System.out.println("6. tampilkan antrian depan & belakang");
            System.out.println("7. tampilkan jumlah mahasiswa dalam antrian");
            System.out.println("8. kosongkan antrian");
            System.out.println("0. keluar");
            System.out.print("pilih: ");
            menu=input6.nextInt(); 
            input6.nextLine();

            switch (menu) {
                case 1:
                    System.out.print("nama: ");
                    String nama=input6.nextLine();
                    System.out.print("nim: ");
                    String nim=input6.nextLine();
                    System.out.print("kelas: ");
                    String kelas=input6.nextLine();
                    System.out.print("prodi: ");
                    String prodi=input6.nextLine();
                    System.out.print("ipk: ");
                    double ipk=input6.nextDouble();
                    mahasiswa6 mhs=new mahasiswa6(nama,nim,kelas,prodi,ipk);
                    antrian.enqueue(mhs);
                    break;
                case 2:
                    antrian.dequeue();
                    break;
                case 3:
                    if(antrian.isEmpty()){
                        System.out.println("antrian kosong");
                    }else{
                        System.out.println("antrian tidak kosong");
                    }
                break;
                case 4:
                    if(antrian.isFull()){
                        System.out.println("antrian penuh");
                    }else{
                        System.out.println("antrian belum penuh");
                    }
                    break;
                case 5:
                    antrian.tampilAntrian();
                    break;
                case 6:
                    antrian.tampilDepanBelakang();
                    break;
                case 7:
                    System.out.println("jumlah mahasiswa dalam antrian: "+antrian.getJumlah());
                    break;
                case 8:
                    antrian.clear();
                    break;
                case 0:
                    System.out.println("program selesai");
                    break;
                default:
                    System.out.println("pilihan tidak valid");
            }
        } while(menu != 0);
    }
}
