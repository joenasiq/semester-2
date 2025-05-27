package w8;

public class Matakuliah{
    String kodeMK;
    String namaMK;
    int sks;

    Matakuliah(){

    }
    Matakuliah(String kodeMK, String namaMK, int sks){
        this.kodeMK = kodeMK;
        this.namaMK = namaMK;
        this.sks = sks;
    }

    void tampilMatakuliah(){
        System.out.println("Kode MK: "+kodeMK+" | Nama MK: "+namaMK+" | SKS: "+sks);
    }
}
