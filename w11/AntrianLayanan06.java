package w11;

public class AntrianLayanan06 {
    Mahasiswa06[]data;
    int front,rear,size,max;

    public AntrianLayanan06(int max){
        this.max=max;
        this.data=new Mahasiswa06[max];
        this.front=0;
        this.rear=-1;
        this.size=0;
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
    public void clear(){
        if(!isEmpty()){
            front=rear=-1;
            size=0;
            System.out.println("queue berhasil dikosongkan");
        }else{
            System.out.println("queue masih kosong");
        }
    }
    public void tambahAntrian(Mahasiswa06 mhs){
        if(isFull()){
            System.err.println("Antrian penuh, tidak dapat menambah mahasiswa");
            return;
        }
        rear=(rear+1)%max;
        data[rear]=mhs;
        size++;
        System.out.println(mhs.nama+" berhasil masuk ke antrian");
    }
    public Mahasiswa06 layaniMahasiswa(){
        if(isEmpty()){
            System.out.println("antrian kosong");
            return null;
        }
        Mahasiswa06 mhs=data[front];
        front=(front+1)%max;
        size--;
        return mhs;
    }
    public void lihatTerdepan(){
        if(isEmpty()){
            System.out.println("antrian kosong");
        }else{
            System.out.print("mahasiswa terdepan: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[front].tampilkanData();
        }
    }
    public void tampilkanSemua(){
        if(isEmpty()){
            System.out.println("antrian kosong");
            return;
        }
        System.out.println("daftar mahasiswa dalam antrian");
        System.out.println("NIM - NAMA - PRODI - KELAS");
        for (int i=0;i<size;i++){
            int index = (front+i)%max;
            System.out.print((i+1)+". ");
            data[index].tampilkanData();
        }
    }
    public int getJumlahAntrian(){
        return size;
    }
    public void lihatAkhir(){
        if(isEmpty()){
            System.out.println("antrian kosong");
        }else{
            System.out.print("mahasiswa di antrian paling belakang: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[rear].tampilkanData();
        }
    }
}
