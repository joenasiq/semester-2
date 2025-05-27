package w5;
import java.util.Scanner;
public class MainFaktorial06 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("masukkan nilai: ");
        int nilai=input.nextInt();

        Faktorial06 fk=new Faktorial06();
        System.out.println("nilai faktorial "+nilai+" menggunakan BF: "+fk.faktorialBF(nilai));
        System.out.println("nilai faktorial "+nilai+" menggunakan DC: "+fk.faktorialDC(nilai));
    }
}