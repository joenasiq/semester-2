package w8;

public class Mahasiswa {
    String nim;
    String nama;
    String prodi;

    Mahasiswa(){

    }

    Mahasiswa(String nim, String nm, String prodi){
        this.nim = nim;
        nama = nm;
        this.prodi = prodi;
    }

    void tampilMahasiswa(){
        System.out.println("NIM: "+nim+" | Nama: "+nama+" | Prodi: "+prodi);
    }
}
