package w12;

public class mahasiswa6 {
    String nim,nama,kelas,prodi;
    double ipk;

    public mahasiswa6(){}

    public mahasiswa6(String nim,String nama,String kelas,String prodi,double ipk){
        this.nim=nim;
        this.nama=nama;
        this.kelas=kelas;
        this.prodi=prodi;
        this.ipk=ipk;
    }
    void tampil(){
        System.out.println("nama: "+nama);
        System.out.println("nim"+nim);
        System.out.println("kelas"+kelas);
        System.out.println("prodi: "+prodi);
        System.out.println("ipk"+ipk);
    }
}
