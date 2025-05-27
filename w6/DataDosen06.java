package w6;

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
    void sortingASC(){
        for (int i=0;i<idx-1;i++){
            for (int j=0;j<idx-i-1;j++){
                if (listDsn[j].usia>listDsn[j+1].usia){
                    Dosen06 temp=listDsn[j];
                    listDsn[j]=listDsn[j+1];
                    listDsn[j+1]=temp;
                }
            }
        }
    }
    void sortingDSC(){
        for (int i=1;i<idx;i++){
            Dosen06 temp=listDsn[i];
            int j=i-1;
            while (j>=0 && listDsn[j].usia<temp.usia){
                listDsn[j+1]=listDsn[j];
                j--;
            }
            listDsn[j+1]=temp;
        }
    }
}
