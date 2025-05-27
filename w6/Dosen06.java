package w6;

public class Dosen06 {
    String kode,nama;
    boolean jenisKelamin;
    int usia;

    Dosen06(String kd,String name,boolean jk,int age){
        kode=kd;
        nama=name;
        jenisKelamin=jk;
        usia=age;
    }
    void tampil(){
        System.out.println("nama: "+nama);
        System.out.println("kode: "+kode);
        System.out.println("usia: "+usia);
        System.out.println("jenis kelamin: "+(jenisKelamin ? "Laki-laki":"Perempuan"));
    }
}
