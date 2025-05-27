package w1;

import java.util.Scanner;
public class menghitung06 {
    public static void main(String[] args) {
        Scanner una = new Scanner(System.in);
        System.out.print("panjang sisi kubus: ");
        int s = una.nextInt();
    
            tampilkanMenu();
            int menu = una.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("Volume kubus : " + volume(s));
                    break;
                case 2:
                    System.out.println("Luas permukaan kubus : " + LuasPermukaan(s));
                    break;
                case 3:
                    System.out.println("Keliling kubus : " + keliling(s));
                    break;
                default:
                    System.out.println("Aksi tidak valid.");
        }
    }

    public static int volume(int s) {
        return s * s * s;
    }
    public static int LuasPermukaan(int s) {
        return 6 * (s * s);
    }
    public static int keliling(int s) {
        return 12 * s;
    }

    public static void tampilkanMenu() {
            System.out.println("Pilih opsi:");
            System.out.println("1. Menentukan Volume");
            System.out.println("2. Menentukan Luas Permukaan");
            System.out.println("3. Menentukan Keliling");
            System.out.print("Masukkan opsi: ");
    }
}
