package w1;

import java.util.Scanner;
public class perulangan06 {
    public static void main(String[] args) {
        Scanner una=new Scanner(System.in);
        System.out.print("Masukkan NIM Mahasiswa : ");
        String nim = una.nextLine();
        char angka1 = nim.charAt(nim.length()-2);
        char angka2 = nim.charAt(nim.length()-1);

        int n=(angka1-'0')*10+(angka2-'0');
        if (n<10) {
            n+=10;
        }
        System.out.println("==============================");
        System.out.println("n: "+n);

        for (int i = 1; i <= n; i++) {
            if (i == 6 || i == 10) {
                continue;
            }
            if (i % 2 == 1) {
                System.out.print("*");
            } else {
                System.out.print(i);
            }
        }
    }
}
