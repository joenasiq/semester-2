package w8;
import java.util.Scanner;
import java.util.Stack;
public class Siakad {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Mahasiswa mhs1 = new Mahasiswa("22001","Ali Rahman","Teknik Informatika");
        Mahasiswa mhs2 = new Mahasiswa("22002","Budi Santoso","Teknik Informatika");
        Mahasiswa mhs3 = new Mahasiswa("22003","Citra Dewi","Sistem Informasi Bisnis");

        Matakuliah mk1 = new Matakuliah("MK001", "Struktur Data", 3);
        Matakuliah mk2 = new Matakuliah("MK002", "Basis Data", 3);
        Matakuliah mk3 = new Matakuliah("MK003", "Desain Web", 3);

        Penilaian nilai1 = new Penilaian(mhs1, mk1, 80, 85, 90);
        Penilaian nilai2 = new Penilaian(mhs1, mk2, 60, 75, 70);
        Penilaian nilai3 = new Penilaian(mhs2, mk1, 75, 70, 80);
        Penilaian nilai4 = new Penilaian(mhs3, mk2, 85, 90, 95);
        Penilaian nilai5 = new Penilaian(mhs3, mk3, 80, 90, 65);

        DataMahasiswa listMhs = new DataMahasiswa();
        listMhs.tambahMHS(mhs1);
        listMhs.tambahMHS(mhs2);
        listMhs.tambahMHS(mhs3);

        DataMahasiswa listMatKul = new DataMahasiswa();
        listMatKul.tambahMK(mk1);
        listMatKul.tambahMK(mk2);
        listMatKul.tambahMK(mk3);

        DataMahasiswa listPenilaian = new DataMahasiswa();
        listPenilaian.tambahPenilaian(nilai1);
        listPenilaian.tambahPenilaian(nilai2);
        listPenilaian.tambahPenilaian(nilai3);
        listPenilaian.tambahPenilaian(nilai4);
        listPenilaian.tambahPenilaian(nilai5);

        Stack<String> ngtt = new Stack<String>();

        ngtt.push("n");

        int menu;
        boolean key=true;
        
        do {
        System.out.println("=== MENU SISTEM AKADEMIK===");
        System.out.println("1. Tampilkan Daftar Mahasiswa");
        System.out.println("2. Tampilkan Daftar Mata Kuliah");
        System.out.println("3. Tampilkan Data Penilaian");
        System.out.println("4. Urutkan Mahasiswa Berdasarkan Nilai Akhir");
        System.out.println("5. Cari Mahasiswa Berdasarkan NIM");
        System.out.println("0. Keluar");
        System.out.println("==========================================");
        System.out.print("Pilih Menu: ");
        menu = in.nextInt();
        in.nextLine();
        System.out.println("==========================================");
            switch (menu) {
                
                case 1:
                    listMhs.tampilMHS();
                    break;
                case 2:
                    listMatKul.tampilMK();
                    break;
                case 3:
                    listPenilaian.tampilNilai();
                    break;
                case 4:
                    listPenilaian.nilaiAkhir();
                    break;
                case 5:
                    System.out.print("Masukkan nim yang ingin dicari: ");
                    String cari = in.nextLine();
                    double posisi = listMhs.cariNIM(cari);
                    int pss = (int)posisi;
                    listMhs.tampilPosisi(cari, pss);
                    break;
                default:
                    key = false;
                    break;
            }
        } while (key);
        
    }
}
