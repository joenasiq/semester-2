import java.util.Scanner;
public class array06 {
    public static void main(String[] args) {
        Scanner una=new Scanner(System.in);
        System.out.println("Program Menghitung IP Semester");
        System.out.println("==============================");
        System.out.print("jumlah mata kuliah: ");
        int jmlMatkul=una.nextInt();
        una.nextLine();
        String[] namaMatKul=new String[jmlMatkul];
        double[] bobot=new double[jmlMatkul];
        int[] nilaiAngka=new int[jmlMatkul];
        double[] nilaiSetara=new double[jmlMatkul];
        String[] nilaiHuruf=new String[jmlMatkul];

        double totalNilai=0;
        int totalbobot=0;
        for (int i = 0; i < jmlMatkul; i++) {
            System.out.println("\nMata Kuliah ke-" + (i + 1));
            System.out.print("Nama Mata Kuliah: ");
            namaMatKul[i]=una.nextLine();
            System.out.print("Bobot: ");
            bobot[i] = una.nextInt();
            System.out.print("Nilai Angka: ");
            nilaiAngka[i] = una.nextInt();
            una.nextLine();

            if (nilaiAngka[i] >= 80) {
                nilaiHuruf[i] = "A";
                nilaiSetara[i] = 4.0;
            } else if (nilaiAngka[i] >= 73) {
                nilaiHuruf[i] = "B+";
                nilaiSetara[i] = 3.5;
            } else if (nilaiAngka[i] >= 65) {
                nilaiHuruf[i] = "B";
                nilaiSetara[i] = 3.0;
            } else if (nilaiAngka[i] >= 60) {
                nilaiHuruf[i] = "C+";
                nilaiSetara[i] = 2.5;
            } else if (nilaiAngka[i] >= 50) {
                nilaiHuruf[i] = "C";
                nilaiSetara[i] = 2.0;
            } else if (nilaiAngka[i] >= 39) {
                nilaiHuruf[i] = "D";
                nilaiSetara[i] = 1.0;            
            } else {
                nilaiHuruf[i] = "E";
                nilaiSetara[i] = 0.0;
            }
            totalNilai += nilaiSetara[i] * bobot[i];
            totalbobot += bobot[i];
        }
        
        double ipSemester= totalNilai / totalbobot;
        System.out.println("\nHasil dari Konversi Nilai");
        System.out.println("==============================");
        System.out.printf("%-20s %-13s %-13s %-10s\n", "matkul", "nilai angka", "Nilai huruf", "bobot nilai");
        for (int i = 0; i < jmlMatkul; i++) {
            System.out.printf("%-20s %-13s %-13s %-15s\n", namaMatKul[i],nilaiAngka[i] , nilaiHuruf[i], bobot[i]);
        }
        System.out.println("==============================");
        System.out.printf("IP Semester: %.2f\n", ipSemester);

    }
}
