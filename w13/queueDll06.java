package w13;

public class queueDll06 {
    nodeVaksin06 head, tail;
    int size;

    public queueDll06(){
        head=tail=null;
        size=0;
    }
    public boolean isEmpty(){
        return head==null;
    }
    public void enqueue(int nomor, String nama) {
        nodeVaksin06 newNode=new nodeVaksin06(null,nomor,nama,null);
        if(isEmpty()){
            head=tail=newNode;
        }else{
            tail.next=newNode;
            newNode.prev=tail;
            tail=newNode;
        }
        size++;
    }
    public void dequeue(){
        if(isEmpty()){
            System.out.println("antrian kosong");
        }else{
            System.out.println(head.nama+" telah selesai divaksinasi");
            head=head.next;
            if(head != null)head.prev=null;
            else tail=null;
            size--;
        }
    }
    public void print(){
        if(isEmpty()){
            System.out.println("antrian kosong");
            return;
        }
        System.out.println("+++++++++++++++++++++++++++++");
        System.out.println("daftar pengantri vaksin");
        System.out.println("+++++++++++++++++++++++++++++");
        System.out.println("|no.\t|nama\t|");
        nodeVaksin06 current=head;
        while(current != null){
            System.out.println("|"+current.nomor+"\t|"+current.nama+"\t|");
            current = current.next;
        }
        System.out.println("+++++++++++++++++++++++++++++");
        System.out.println("sisa antrian: "+size);
    }
}
