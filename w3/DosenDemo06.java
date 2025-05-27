package w3;

import java.util.Scanner;

public class DosenDemo06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dummy;
        System.out.print("Masukkan jumlah dosen: ");
        int jumlahDosen = Integer.parseInt(sc.nextLine());
        Dosen06[] arrayOfDosen = new Dosen06[jumlahDosen];

        for (int i = 0; i < jumlahDosen; i++) {
            System.out.println("Masukkan data dosen ke-" + (i + 1));
            System.out.print("Kode         : ");
            String kode = sc.nextLine();
            System.out.print("Nama         : ");
            String nama = sc.nextLine();
            System.out.println("(true = Laki-laki, false = Perempuan)");
            System.out.print("Jenis Kelamin: ");
            dummy=sc.nextLine();
            boolean jenisKelamin = Boolean.parseBoolean(dummy);
            System.out.print("Usia         : ");
            dummy=sc.nextLine();
            int usia = Integer.parseInt(dummy);
            arrayOfDosen[i] = new Dosen06(kode, nama, jenisKelamin, usia);
            System.out.println("--------------------------------------");

        }
        DataDosen06.dataSemuaDosen(arrayOfDosen);
        DataDosen06.jumlahDosenPerJenisKelamin(arrayOfDosen);
        DataDosen06.rerataUsiaDosenPerJenisKelamin(arrayOfDosen);
        DataDosen06.infoDosenPalingTua(arrayOfDosen);
        DataDosen06.infoDosenPalingMuda(arrayOfDosen);
    }
}