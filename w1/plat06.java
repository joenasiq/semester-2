import java.util.Scanner;
public class plat06 {
    public static void main(String[] args) {
        char[] kode = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};
        char[][] kota = {
            {'B','A','N','T','E','N',' ',' ',' ',' ',' ',' '},
            {'J','A','K','A','R','T','A',' ',' ',' ',' ',' '},
            {'B','A','N','D','U','N','G',' ',' ',' ',' ',' '},
            {'C','I','R','E','B','O','N',' ',' ',' ',' ',' '},
            {'B','O','G','O','R',' ',' ',' ',' ',' ',' ',' '},
            {'P','E','K','A','L','O','N','G','A','N',' ',' '},
            {'S','E','M','A','R','A','N','G',' ',' ',' ',' '},
            {'S','U','R','A','B','A','Y','A',' ',' ',' ',' '},
            {'M','A','L','A','N','G',' ',' ',' ',' ',' ',' '},
            {'T','E','G','A','L',' ',' ',' ',' ',' ',' ',' '}
        };
        Scanner una = new Scanner(System.in);
        System.out.print("Masukkan kode plat nomor (A, B, F, G, H, L, N, T): ");
        char input = una.next().charAt(0);

        boolean ditemukan = false;
        for (int i = 0; i < kode.length; i++) {
            if (kode[i] == input) {
                System.out.print("Kode plat " + input + " berasal dari kota: ");
                for (char c : kota[i]) {
                    if (c != ' ') {
                        System.out.print(c);
                    }
                }
                System.out.println();
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Kode plat tidak ditemukan.");
        }
    }
}
