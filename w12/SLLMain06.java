package w12;

public class SLLMain06 {
    public static void main(String[] args) {
        SingeLinkedList06 sll=new SingeLinkedList06();
        Mahasiswa06 mhs1=new Mahasiswa06("24107","Eka","1A",3.5);
        Mahasiswa06 mhs2=new Mahasiswa06("24108","Dana","1B",3.75);
        Mahasiswa06 mhs3=new Mahasiswa06("24109","Lia","2C",3.4);
        Mahasiswa06 mhs4=new Mahasiswa06("24110","Edo","2D",3);

        sll.print();
        sll.addFirst(mhs4);
        sll.print();
        sll.addLast(mhs1);
        sll.print();
        sll.insertAfter("Edo", mhs3);
        sll.insertAt(2, mhs2);
        sll.print();

        System.out.println("data index 1: ");
        sll.getData(1);
        System.out.println("data mahasiswa Dana berada pada indeks: "+sll.indexOf("Dana"));
        System.out.println();
        sll.removeFirst();
        sll.removeLast();
        sll.print();
        sll.removeAt(0);
        sll.print();
    }
}
