package w2;
public class Mahasiswa06{
    String nama;
    String NIM;
    String kelas;
    double ipk;

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
        ipk=ipkBaru;
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