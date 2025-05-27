package w4;
import java.util.Scanner;
public class CafeDemo06 {
    public static void main(String[] args) {
        Scanner una=new Scanner(System.in);
        System.out.print("masukkan jumlah menu: ");
        int jumlahMenu=Integer.parseInt(una.nextLine());
        Cafe06[]arrayOfCafe=new Cafe06[jumlahMenu];

        for(int i=0;i<jumlahMenu;i++){
            System.out.println("masukkan data menu ke-"+(i+1));
            arrayOfCafe[i]=new Cafe06();
            arrayOfCafe[i].tambahData();
        }
        for(int i=0;i<jumlahMenu;i++){
            System.out.println("data menu ke-"+(i+1));
            arrayOfCafe[i].info();
        }
        
    }
}
