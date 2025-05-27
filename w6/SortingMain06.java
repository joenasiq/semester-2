package w6;

public class SortingMain06 {
    public static void main(String[] args) {
    int a[]={20,10,2,7,12};
    Sorting06 dataurut1=new Sorting06(a,a.length);
    System.out.println("data awal 1");
    dataurut1.tampil();
    dataurut1.bubbleSort();
    System.out.println("data sudah diurutkan dengan bubble sort (asc)");
    dataurut1.tampil();
    System.out.println("=========================================");
    int b[]={30,20,2,8,14};
    Sorting06 dataurut2=new Sorting06(b,b.length);
    System.out.println("data awal 2");
    dataurut2.tampil();
    dataurut2.SelectionSort();
    System.out.println("data sudah diurutkan dengan selection sort (asc)");
    dataurut2.tampil();
    System.out.println("=========================================");
    int c[]={40,10,4,9,3};
    Sorting06 dataurut3=new Sorting06(c,c.length);
    System.out.println("data awal 3");
    dataurut3.tampil();
    dataurut3.insertionSort();
    System.out.println("data sudah diurutkan dengan insertion sort (asc)");
    dataurut3.tampil();
    }
}
