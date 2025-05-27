package w5;
import java.util.Scanner;
public class MainPangkat06 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("masukkan jumlah elemen: ");
        int elemen=input.nextInt();

        Pangkat06[]png=new Pangkat06[elemen];
        for(int i=0;i<elemen;i++){
            System.out.print("masukkan nilai basis elemen ke-"+(i+1)+": ");
            int basis=input.nextInt();
            System.out.print("masukkan nilai pangkat elemen ke-"+(i+1)+": ");
            int pangkat=input.nextInt();
            png[i]=new Pangkat06(basis, pangkat);
        }

        System.out.println("hasill pangkat bruteforce: ");
        for (Pangkat06 p:png){
            System.out.println(p.nilai+"^"+p.pangkat+": "+p.pangkatBF(p.nilai, p.pangkat));
        }
        System.out.println("hasil pangkat divide and conquer: ");
        for (Pangkat06 p:png){
            System.out.println(p.nilai+"^"+p.pangkat+": "+p.pangkatDC(p.nilai, p.pangkat));
        }
    }
}