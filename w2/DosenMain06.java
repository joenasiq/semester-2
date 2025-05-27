package w2;

public class DosenMain06 {
    public static void main(String[] args) {
        Dosen06 ds1=new Dosen06("DS","Damianus",2013,true,"Perencanaan Wilayah dan Kota");
        ds1.hitungMasaKerja(2025);
        ds1.tampilInformasi();

        Dosen06 ds2=new Dosen06("GN","Gunawan", 2017, true,"accounting");
        ds2.ubahKeahlian("computer science");
        ds2.tampilInformasi();
    }
}
