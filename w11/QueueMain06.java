package w11;
import java.util.Scanner;
public class QueueMain06 {
    public static void menu(){
        System.out.println("masukkan operasi yang diinginkan");
        System.out.println("1. enqueue");
        System.out.println("2. dequeue");
        System.out.println("3. print");
        System.out.println("4. peek");
        System.out.println("5. clear");
        System.out.println("-------------------");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("masukkan kapasistas queue: ");
        int n=sc.nextInt();
        Queue06 Q=new Queue06(n);
        int pilih;
        do { 
            menu();
            pilih=sc.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("masukkan data baru: ");
                    int dataMasuk=sc.nextInt();
                    Q.enqueue(dataMasuk);
                    break;
                case 2:
                    int dataKeluar=Q.dequeue();
                    if(dataKeluar != 0){
                        System.out.println("data yang dikeluarkan "+ dataKeluar);
                        break;
                    }
                case 3:
                    Q.print();
                    break;
                case 4:
                    Q.peek();
                    break;
                case 5:
                    Q.clear();
                    break;
            }
        } while (pilih==1||pilih==2||pilih==3||pilih==4||pilih==5);
    }
}
