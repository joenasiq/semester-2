package w7;

public class DataDosen06 {
    Dosen06[]listDsn=new Dosen06[10];
    int idx;

    void tambah(Dosen06 dsn){
        if (idx<listDsn.length){
            listDsn[idx]=dsn;
            idx++;
        }else{
            System.out.println("Data dosen sudah penuh!");
        }
    }
    void tampil(){
        if (idx==0) {
            System.out.println("Belum ada data dosen.");
            return;
        }
        for (int i=0;i<idx;i++){
            System.out.println("---------------------------");
            listDsn[i].tampil();
        }
    }
    void pencarianDataSequential06(String nama){
        boolean ada=false;
        int sama=0;
        for(int i=0;i<idx;i++){
            if (listDsn[i].nama.equalsIgnoreCase(nama)){
                System.out.println("---------------------------");
                listDsn[i].tampil();
                ada=true;
                sama++;
            }
        }
        if(!ada){
            System.out.println("---------------------------");
            System.out.println("Dosen dengan nama "+nama+" tidak ditemukan.");
        }else if(sama>1){
            System.out.println("---------------------------");
            System.out.println("PERINGATAN");
            System.out.println("ada lebih dari satu dosen dengan nama "+nama);
        }
    }
    void pencarianDataBinary06(int usia){
        int left=0,right=idx-1,mid;
        boolean ada=false;
        int sama=0;
        while(left<=right){
            mid=(left+right)/2;
            if(listDsn[mid].usia==usia){
                ada=true;
                int i=mid;
                while(i>=0 && listDsn[i].usia==usia){
                    System.out.println("---------------------------");
                    listDsn[i].tampil();
                    sama++;
                    i--;
                }
                i=mid+1;
                while(i<idx && listDsn[i].usia==usia){
                    System.out.println("---------------------------");
                    listDsn[i].tampil();
                    sama++;
                    i++;
                }
                break;
            }else if(listDsn[mid].usia>usia){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        if(!ada){
            System.out.println("---------------------------");
            System.out.println("Dosen dengan usia "+usia+" tidak ditemukan");
        }else if(sama>1){
            System.out.println("---------------------------");
            System.out.println("PERINGATAN");
            System.out.println("ada lebih dari satu dosen dengan usia "+usia);
        }
    }
}
