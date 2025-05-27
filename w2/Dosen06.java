package w2;

public class Dosen06 {
    String idDosen, namaDosen, bidangKeahlian;
    int tahunBergabung;
    boolean statusAktif;
    
    void tampilInformasi() {
        System.out.println("nama dosen: "+namaDosen);
        System.out.println("id dosen: "+idDosen);
        System.out.println("tahun bergabung: "+tahunBergabung);
        System.out.println("bidang keahlian: "+bidangKeahlian);
    }

    void setStatusAktif(boolean status){
        if(status==true){
            System.out.println("status: aktif");
        }else{
            System.out.println("status: nonaktif");
        }
    }

    void hitungMasaKerja(int thnSkrg){
        int totalTahun=thnSkrg-tahunBergabung;
        System.out.println("masa kerja: "+totalTahun+" tahun");
    }

    void ubahKeahlian(String bidang){
        bidangKeahlian=bidang;
    }

    public Dosen06(){

    }

    public Dosen06(String id, String nama, int tahun, boolean status, String bidang){
        idDosen=id;
        namaDosen=nama;
        tahunBergabung=tahun;
        statusAktif=status;
        bidangKeahlian=bidang;
    }
}
