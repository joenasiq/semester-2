package w8;

public class DataMahasiswa {
    

    Mahasiswa[] listMahasiswa = new Mahasiswa[3];
    int idxMHS;
    
    void tambahMHS(Mahasiswa mhs){
        if (idxMHS<listMahasiswa.length) {
            listMahasiswa[idxMHS]=mhs;
            idxMHS++;
        }
    }

    void tampilMHS(){
        for (Mahasiswa mhs : listMahasiswa) {
            mhs.tampilMahasiswa();
        }
    }

    Matakuliah[] listMK = new Matakuliah[3];
    int idxMK;

    void tambahMK(Matakuliah matkul){
        if (idxMK<listMK.length) {
            listMK[idxMK]=matkul;
            idxMK++;
        }
    }
    
    void tampilMK(){
        for (Matakuliah matakuliah : listMK) {
            matakuliah.tampilMatakuliah();
        }
    }
    
    Penilaian[] listNilai = new Penilaian[5];
    int idxNilai;

    void tambahPenilaian(Penilaian nilai){
        if (idxNilai<listNilai.length) {
            listNilai[idxNilai]=nilai;
            idxNilai++;
        }
    }

    void tampilNilai(){
        for (Penilaian nl : listNilai) {
            nl.tampilPenilaian();
        }
    }

    void nilaiAkhir(){
        for (int i = 0; i < listNilai.length; i++) {
            listNilai[i].hitungNilaiAkhir();
        }

        for (int i = 0; i < listNilai.length-1; i++) {
            for (int j = 1; j < listNilai.length-i; j++) {
                if (listNilai[j].nilaiAkhir>listNilai[j-1].nilaiAkhir) {
                    Penilaian temp=listNilai[j];
                    listNilai[j]=listNilai[j-1];
                    listNilai[j-1]=temp;
                }
            }
        }

        for (Penilaian nl : listNilai) {
            nl.tampilNilaiAkhir();
        }
    }

    double cariNIM(String cari){
        double posisi = -1;
        for (int i = 0; i < listMahasiswa.length; i++) {
            if (listMahasiswa[i].nim.equalsIgnoreCase(cari)) {
                posisi = i;
                break;
            }
        }
        return posisi;
    }

    void tampilPosisi(String cari, int pos){
        if (pos!=-1) {
            System.out.println("Mahasiswa ditemukan: NIM: "+listMahasiswa[pos].nim+" | Nama: "+listMahasiswa[pos].nama+" | Prodi: "+listMahasiswa[pos].prodi);
        }else{
            System.out.println("Mahasiswa dengan NIM "+cari+" tidak ditemukan.");
        }
        
    }
}
