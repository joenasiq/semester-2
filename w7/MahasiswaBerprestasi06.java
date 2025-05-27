package w7;

public class MahasiswaBerprestasi06 {
    Mahasiswa06[]listMhs=new Mahasiswa06[5];
    int idx;

    void tambah (Mahasiswa06 m){
        if(idx<listMhs.length){
            listMhs[idx]=m;
            idx++;
        }else{
            System.out.println("data sudah penuh");
        }
    }
    void tampiil() {
        for (int i = 0; i < idx; i++) {
            listMhs[i].tampilInformasi();
            System.out.println("---------------------------");
        }
    }

    int sequentialSearching(double cari){
        int posisi=-1;
        for(int j=0;j<listMhs.length;j++){
            if(listMhs[j].ipk==cari){
                posisi=j;
                break;
            }
        }
        return posisi;
    }
    void tampilPosisi(double x,int pos){
        if(pos!=-1){
            System.out.println("data mahasiswa dengan ipk: "+x+" ditemukan pada indeks "+pos);
        }else{
            System.out.println("data "+x+" tidak ditemukan");
        }
    }
    void tampilDataSearch(double x,int pos){
        if(pos!=-1){
            System.out.println("nim\t: "+listMhs[pos].nim);
            System.out.println("mama\t: "+listMhs[pos].nama);
            System.out.println("kelas\t: "+listMhs[pos].kelas);
            System.out.println("ipk\t: "+x);
        }else{
            System.out.println("data mahasiswa dengan ipk "+x+" tidak ditemukan");
        }
    }
    int findBinarySearch(double cari,int left,int right){
        int mid;
        if(right>=left){
            mid=(left+right)/2;
            if(cari==listMhs[mid].ipk){
                return(mid);
            }else if (listMhs[mid].ipk>cari) {
                return findBinarySearch(cari, left, mid-1);
            }else{
                return findBinarySearch(cari, mid+1, right);
            }
        }
        return -1;
    }
}