package w2;

public class MataKuliahMain06 {
    public static void main(String[] args) {
        MataKuliah06 mk1=new MataKuliah06("RTI242005","bahasa inggris 1", 2, 4);
        mk1.kurangiJam(1);
        mk1.tampilInformasi();

        MataKuliah06 mk2=new MataKuliah06("RTI242003","desain antarmuka", 2, 4);
        mk2.tambahJam(2);
        mk2.tampilInformasi();
    }
}
