package w8;

public class Penilaian {
    Mahasiswa mhs;
    Matakuliah matkul;
    double nilaiTugas;
    double nilaiUTS;
    double nilaiUAS;
    double nilaiAkhir;

    Penilaian(){

    }
    Penilaian(Mahasiswa mhs, Matakuliah matkul, double tugas, double uts, double uas){
        this.mhs = mhs;
        this.matkul = matkul;
        nilaiTugas = tugas;
        nilaiUTS = uts;
        nilaiUAS = uas;
    }

    void hitungNilaiAkhir(){
        nilaiAkhir = (nilaiTugas*0.3)+(nilaiUTS*0.3)+(nilaiUAS*0.4);

    }

    void tampilNilaiAkhir(){
        System.out.println(mhs.nama+" | "+matkul.namaMK+" | Nilai Akhir: "+nilaiAkhir);
    }

    void tampilPenilaian(){
        System.out.println(mhs.nama+" | "+matkul.namaMK+" | Nilai Tugas: "+nilaiTugas+" | Nilai UTS: "+nilaiUTS+" | Nilai UAS: "+nilaiUAS);
    }
}
