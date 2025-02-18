package w2;
public class MahasiswaMain06 {
    public static void main(String[] args) {
        Mahasiswa06 mhs1=new Mahasiswa06();
        mhs1.nama="Muhammad ALi Farhan";
        mhs1.NIM="2241720171";
        mhs1.kelas="S1 2J";
        mhs1.ipk=3.55;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("S1 2K");
        mhs1.updateIpk(3.60);
        mhs1.tampilkanInformasi();
    }
}
