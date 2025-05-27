package w12;

public class queue6 {
    node6 front,rear;
    int size=0,max;

    public queue6(){}

    public queue6(int max){
        this.max=max;
    }
    public boolean isEmpty(){
        return front==null;
    }
    public boolean isFull(){
        return size>=max;
    }
    public void clear(){
        front=rear=null;
        size=0;
        System.out.println("antrian dikosongkan");
    }
    public void enqueue(mahasiswa6 mhs){
        if(isFull()){
            System.out.println("antrian penuh Tidak bisa menambahkan");
            return;
        }
        node6 baru=new node6(mhs);
        if(isEmpty()){
            front = rear = baru;
        }else{
            rear.next=baru;
            rear=baru;
        }
        size++;
        System.out.println("berhasil ditambahkan ke antrian");
    }
    public void dequeue(){
        if(isEmpty()){
            System.out.println("antrian kosong");
            return;
        }
        System.out.print("memanggil mahasiswa: ");
        front.data.tampil();
        front=front.next;
        size--;
        if(front==null)rear=null;
    }
    public void tampilAntrian(){
        if(isEmpty()){
            System.out.println("antrian kosong");
            return;
        }
        node6 current=front;
        System.out.println("daftar antrian");
        while(current != null){
            current.data.tampil();
            current=current.next;
        }
    }
    public void tampilDepanBelakang(){
        if (isEmpty()) {
            System.out.println("antrian kosong");
            return;
        }
        System.out.print("antrian terdepan: ");
        front.data.tampil();
        System.out.print("antrian paling akhir: ");
        rear.data.tampil();
    }
    public int getJumlah(){
        return size;
    }
}
