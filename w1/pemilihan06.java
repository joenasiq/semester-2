import java.util.Scanner;
public class pemilihan06{
    public static void main (String [] args){
        Scanner sc=new Scanner(System.in);
        int nilaiTugas, nilaiKuis, nilaiUTS, nilaiUAS;

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("==============================");
        System.out.print("masukkan nilai tugas: ");
        nilaiTugas=sc.nextInt();
        System.out.print("masukkan nilai kuis: ");
        nilaiKuis=sc.nextInt();
        System.out.print("masukkan nilai UTS: ");
        nilaiUTS=sc.nextInt();
        System.out.print("masukkan nilai UAS: ");
        nilaiUAS=sc.nextInt();
        System.out.println("==============================");

        if (nilaiTugas>100||nilaiTugas<0||nilaiKuis>100||nilaiKuis<0||nilaiUTS>100||nilaiUTS<0||nilaiUAS>100||nilaiUAS<0) {
            System.out.println("nilai tidak valid");
            System.out.println("==============================");
        }
        else{
        double nilaiAkhir=((nilaiTugas*0.2)+(nilaiKuis*0.2)+(nilaiUTS*0.3)+(nilaiUAS*0.3));
        System.out.print("nilai akhir: "+nilaiAkhir);
        System.out.println("");
        String nilaiHuruf;
            if(nilaiAkhir>80){
                System.out.println("nilai huruf: A");
            }
            else if(nilaiAkhir>73&&nilaiAkhir<=80){
                System.out.println("nilai huruf: B+");
            }
            else if(nilaiAkhir>65&&nilaiAkhir<=73){
                System.out.println("nilai huruf: B");
            }
            else if(nilaiAkhir>60&&nilaiAkhir<=65){
                System.out.println("nilai huruf: C+");
            }
            else if(nilaiAkhir>50&&nilaiAkhir<=60){
                System.out.println("nilai huruf: C");
            }
            else if(nilaiAkhir>39&&nilaiAkhir<=50){
                System.out.println("nilai huruf: D");
            }
            else{
                System.out.println("nilai huruf: E");
            }
        System.out.println("==============================");
        if (nilaiAkhir>50){
            System.out.println("selamat anda lulus");
            System.out.println("==============================");
        }
        else {
            System.out.println("maaf anda tidak lulus");
            System.out.println("==============================");
        }
    }
}
}