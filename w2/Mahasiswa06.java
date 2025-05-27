package w2;
public class Mahasiswa06{
    String nama;
    String NIM;
    String kelas;
    double ipk;

    public Mahasiswa06(){

    }

    public Mahasiswa06(String nm, String nim, double ipk, String kls){
        nama=nm;
        NIM=nim;
        this.ipk=ipk;
        kelas=kls;
    }

    void tampilkanInformasi() {
        System.out.println("nama: "+nama);
        System.out.println("NIM: "+NIM);
        System.out.println("kelas: "+kelas);
        System.out.println("ipk: "+ipk);
    }

    void ubahKelas(String kelasBaru){
        kelas=kelasBaru;
    }

    void updateIpk(double ipkBaru){
        if (ipkBaru < 0.0 || ipkBaru > 4.0) {
            ipk = ipkBaru;
            System.out.println("IPK tidak valid, harus antara 0.0 dan 4.0");
        }else{
            System.out.println("ipk: "+ipk);
        }
    }

    String nilaiKinerja(){
        if (ipk>=3.5){
            return "kinerja sangat baik";
        }else if(ipk>=3.0){
            return "kinerja baik";
        }else if(ipk>=2.0){
            return "kinerja cukup";
        }else{
            return "kinerja kurang";
        }
    }
}