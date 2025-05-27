package w2;

public class MataKuliah06 {
    String kodeMK, namaMK;
    int sks, jumlahJam;
    
    void tampilInformasi(){
        System.out.println("kode MK: "+kodeMK);
        System.out.println("nama MK: "+namaMK);
        System.out.println("sks: "+sks);
        System.out.println("jumlah jam: "+jumlahJam);
    }

    void ubahSKS(int sksBaru){
        sks=sksBaru;
    }

    void tambahJam(int jam){
        jumlahJam+=jam;
        System.out.println("jumlah jam setelah ditambah:"+jumlahJam);
    }

    void kurangiJam(int jam){
        if (jam > jumlahJam) {
            System.out.println("Pengurangan tidak dapat dilakukan! Jumlah jam tersisa tidak mencukupi");
        } else {
            jumlahJam -= jam;
            System.out.println("jumlah jam setelah dikurangi: "+jumlahJam);
        }
    }

    public MataKuliah06(){

    }

    public MataKuliah06(String kmk, String nmk, int sks, int jj){
        kodeMK=kmk;
        namaMK=nmk;
        this.sks=sks;
        jumlahJam=jj;
    }
    
}
