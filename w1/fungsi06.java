package w1;

public class fungsi06 {
    public static void main(String[] args) {
        int[][] stok = {
            {10, 5, 15, 7},
            {6, 4, 11, 9},
            {2, 10, 10, 5},
            {5, 7, 12, 9}
        }; int[] harga= {75000, 50000, 60000, 10000};
        Pendapatan(stok, harga);
        HitungTotalStok(stok);
    }

    public static void Pendapatan(int[][] stok, int[] harga) {
        System.out.println("Pendapatan tiap cabang jika terjual habis:");
        for (int i = 0; i < stok.length; i++) {
            int pendapatan = 0;
            for (int j = 0; j < stok[i].length; j++) {
                pendapatan += stok[i][j] * harga[j];
            }
            System.out.println("RoyalGarden " + (i + 1) + ": Rp." + pendapatan);
        }
    System.out.println();
    }

    public static void HitungTotalStok(int[][] stok) {
        int[] total = new int[4];
        for (int i = 0; i < stok.length; i++) {
            for (int j = 0; j < stok[i].length; j++) {
                total[j] += stok[i][j];
            }
        }
        System.out.println("stok tiap jenis bunga: ");
        System.out.println("Aglonema: " + total[0]);
        System.out.println("Keladi: " + total[1]);
        System.out.println("Alocasia: " + total[2]);
        System.out.println("Mawar: " + total[3]);
        System.out.println();
    }
}