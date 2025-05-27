package w3;

public class DataDosen06 {
    public static void dataSemuaDosen(Dosen06[]arrayOfDosen){
        for (Dosen06 dosen : arrayOfDosen) {
            System.out.println("Kode         : " + dosen.kode);
            System.out.println("Nama         : " + dosen.nama);
            System.out.println("Jenis Kelamin: " + (dosen.jenisKelamin ? "Laki-laki" : "Perempuan"));
            System.out.println("Usia         : " + dosen.usia + " tahun");
            System.out.println("--------------------------------------");
        }
    }
    public static void jumlahDosenPerJenisKelamin(Dosen06[] arrayOfDosen) {
        int jumlahPria = 0, jumlahWanita = 0;
        for (Dosen06 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin) {
                jumlahPria++;
            } else {
                jumlahWanita++;
            }
        }
        System.out.println("Jumlah dosen Laki-laki : " + jumlahPria);
        System.out.println("Jumlah dosen Perempuan : " + jumlahWanita);
    }
    public static void rerataUsiaDosenPerJenisKelamin(Dosen06[] arrayOfDosen) {
        int totalUsiaPria = 0, totalUsiaWanita = 0;
        int jumlahPria = 0, jumlahWanita = 0;

        for (Dosen06 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin) {
                totalUsiaPria+=dosen.usia;
                jumlahPria++;
            } else {
                totalUsiaWanita+=dosen.usia;
                jumlahWanita++;
            }
        }
        System.out.println("Rata-rata usia dosen Laki-laki : " + (jumlahPria > 0 ? (totalUsiaPria / (double) jumlahPria) : 0) + " tahun");
        System.out.println("Rata-rata usia dosen Perempuan : " + (jumlahWanita > 0 ? (totalUsiaWanita / (double) jumlahWanita) : 0) + " tahun");
        System.out.println("--------------------------------------");

    }
    public static void infoDosenPalingTua(Dosen06[] arrayOfDosen) {
        if (arrayOfDosen.length == 0) return;
        Dosen06 dosenTertua = arrayOfDosen[0];
        for (Dosen06 dosen : arrayOfDosen) {
            if (dosen.usia > dosenTertua.usia) {
                dosenTertua = dosen;
            }
        }
        System.out.println("data dosen paling tua");
        System.out.println("Kode         : " + dosenTertua.kode);
        System.out.println("Nama         : " + dosenTertua.nama);
        System.out.println("Jenis Kelamin: " + (dosenTertua.jenisKelamin ? "Laki-laki" : "Perempuan"));
        System.out.println("Usia         : " + dosenTertua.usia + " tahun");
        System.out.println("--------------------------------------");
    }
    public static void infoDosenPalingMuda(Dosen06[] arrayOfDosen) {
        if (arrayOfDosen.length == 0) return;
        Dosen06 dosenTermuda = arrayOfDosen[0];
        for (Dosen06 dosen : arrayOfDosen) {
            if (dosen.usia < dosenTermuda.usia) {
                dosenTermuda = dosen;
            }
        }
        System.out.println("data dosen paling muda");
        System.out.println("Kode         : " + dosenTermuda.kode);
        System.out.println("Nama         : " + dosenTermuda.nama);
        System.out.println("Jenis Kelamin: " + (dosenTermuda.jenisKelamin ? "Laki-laki" : "Perempuan"));
        System.out.println("Usia         : " + dosenTermuda.usia + " tahun");
        System.out.println("--------------------------------------");
    }
}