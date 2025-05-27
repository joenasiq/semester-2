package w14;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        linkedList antrian = new linkedList();
        queue transaksi = new queue(100);

        int pilih;
        do {
            System.out.println("\n--- Menu SPBU ---");
            System.out.println("1. Tambah Antrian Kendaraan");
            System.out.println("2. Tampilkan Antrian");
            System.out.println("3. Cek Jumlah Antrian Kendaraan");
            System.out.println("4. Layani Kendaraan");
            System.out.println("5. Tampilkan Riwayat Transaksi");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Masukkan Plat Nomor: ");
                    String plat = sc.nextLine();
                    System.out.print("Masukkan Jenis Kendaraan: ");
                    String tipe = sc.nextLine();
                    System.out.print("Masukkan Merk: ");
                    String merk = sc.nextLine();
                    Kendaraan kd=new Kendaraan(plat,tipe,merk);
                    antrian.tambahAntrian(kd);
                    break;
                case 2:
                    antrian.tampilkanAntrian();
                    break;
                case 3:
                    System.out.println(">> jumlah kendaraan dalam antrian: "+antrian.hitungAntrian());
                    break;
                case 4:
                    Kendaraan dilayani=antrian.layaniKendaraan();
                    if(dilayani == null){
                        System.out.println("tidak ada kendaraan dalam antrian");
                    }else{
                        System.out.println("petugas melayani "+dilayani.platNomor);
                        System.out.print("masukkan Jenis BBM: ");
                        String jenisBBM=sc.nextLine();
                        System.out.print("masukkan Harga per liter: ");
                        double harga=sc.nextDouble();
                        System.out.print("masukkan Jumlah liter: ");
                        double liter=sc.nextDouble();
                        sc.nextLine();
                        BBM bbm=new BBM(jenisBBM,harga);
                        transaksiPengisian t=new transaksiPengisian(dilayani,bbm,liter,harga);
                        transaksi.enqueue(t);
                        System.out.println(">> transaksi berhasil dicatat");
                    }
                    break;
                case 5:
                    transaksi.tampilkanRiwayat();
                    break;
                case 0:
                    System.out.println("terima kasih");
                    break;
                default:
                    System.out.println("pilihan tidak valid");
            }
        } while(pilih != 0);
    }
}
