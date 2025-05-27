package w5;

public class MainNilai06 {
    public static void main(String[] args) {
        String[] nama = {"Ahmad", "Budi", "Cindy", "Dian", "Eko", "Fajar", "Gina", "Hadi"};
        String[] nim = {"220101001", "220101002", "220101003", "220101004", "220101005", "220101006", "220101007", "220101008"};
        int[] tahunMasuk = {2022, 2022, 2021, 2021, 2023, 2020, 2023, 2020};
        int[] uts = {78, 85, 90, 76, 92, 88, 80, 82};
        int[] uas = {82, 88, 87, 79, 95, 85, 83, 84};
        Nilai06 nl=new Nilai06();

        int nilaiTertinggi = nl.nilaiTertinggiDC(uts, 0, uts.length - 1);
        int nilaiTerendah = nl.nilaiTerendahDC(uts, 0, uts.length - 1);
        double rataUAS = nl.rataUASBF(uas);

        System.out.println("=========================================");
        System.out.println("Mahasiswa dengan Nilai UTS Tertinggi:");
        System.out.println("   Nama        : "+nama[nilaiTertinggi]);
        System.out.println("   NIM         : "+nim[nilaiTertinggi]);
        System.out.println("   Tahun Masuk : "+tahunMasuk[nilaiTertinggi]);
        System.out.println("   Nilai UTS   : "+uts[nilaiTertinggi]);
        System.out.println("=========================================");
        System.out.println("Mahasiswa dengan Nilai UTS Terendah:");
        System.out.println("   Nama        : "+nama[nilaiTerendah]);
        System.out.println("   NIM         : "+nim[nilaiTerendah]);
        System.out.println("   Tahun Masuk : "+tahunMasuk[nilaiTerendah]);
        System.out.println("   Nilai UTS   : "+uts[nilaiTerendah]);
        System.out.println("=========================================");
        System.out.println("Rata-rata Nilai UAS: "+rataUAS);
        System.out.println("=========================================");
    }
}