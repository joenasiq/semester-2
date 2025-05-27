package w5;
import java.util.Scanner;
public class MainSum06 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("masukkan jumlah elemen: ");
        int elemen=input.nextInt();

        Sum06 sm=new Sum06(elemen);
        for(int i=0;i<elemen;i++){
            System.out.print("masukkan keuntungan ke-"+(i+1)+": ");
            sm.keuntungan[i]=input.nextDouble();
        }
        System.out.println("total keuntungan menggunakan brute force: "+sm.totalBF());
        System.out.println("total keuntungan menggunakan divide and conquer: "+sm.totalDC(sm.keuntungan, 0, elemen-1));
    }
}