package w11;

public class AntrianKRS06 {
    KRS06[]data;
    int front,rear,size,max;
    int proses;

    public AntrianKRS06(int max){
        this.max=max;
        data=new KRS06[max];
        front=0;
        rear=-1;
        size=0;
        proses=0;
    }
    public boolean isEmpty(){
        if(size==0){
            return true;
        }else{
            return false;
        }
    }
    public boolean isFull(){
        if(size==max){
            return true;
        }else{
            return false;
        }
    }
    public void tambahAntrian(KRS06 kr){
        if(isFull()){
            System.out.println("queue penuh");
            return;
        }
        rear=(rear+1)%max;
        data[rear]=kr;
        size++;
        System.out.println("Mahasiswa "+kr.nama+" berhasil ditambahkan ke queue");
    }
    public void panggilDuaMahasiswa(){
        if(size<2){
            System.out.println("queue tidak cukup untuk memanggil 2 mahasiswa");
            return;
        }
        System.out.println("Memanggil dua mahasiswa untuk proses KRS:");
        for (int i=0;i<2;i++){
            KRS06 kr=data[front];
            kr.tampilkanData();
            front=(front+1)%max;
            size--;
            proses++;
        }
    }
    public void tampilkanSemua(){
        if(isEmpty()){
            System.out.println("queue kosong");
            return;
        }
        System.out.println("Daftar mahasiswa dalam queue:");
        for (int i=0;i<size;i++){
            int index=(front+i)%max;
            System.out.print((i+1)+". ");
            data[index].tampilkanData();
        }
    }
    public void lihatDuaTerdepan(){
        if(size==0){
            System.out.println("queue kosong");
        }else if(size==1){
            System.out.println("queue hanya ada 1 mahasiswa:");
            data[front].tampilkanData();
        }else{
            System.out.println("2 mahasiswa terdepan:");
            data[front].tampilkanData();
            data[(front+1)%max].tampilkanData();
        }
    }
    public void lihatAkhir(){
        if(isEmpty()){
            System.out.println("queue kosong");
        }else{
            System.out.println("Mahasiswa paling akhir:");
            data[rear].tampilkanData();
        }
    }
    public int getJumlahQueue(){
        return size;
    }
    public int getsudahProses(){
        return proses;
    }
    public int getBelumProses(){
        return 30-proses;
    }
}
