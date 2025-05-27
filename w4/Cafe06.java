package w4;
import java.util.Scanner;

public class Cafe06 {
    public String nama, kategori;
    public double harga;

    public Cafe06(String nama,double harga,String kategori){
        this.nama=nama;
        this.harga=harga;
        this.kategori=kategori;
    }

    public Cafe06(){
        
    }

    void tambahData(){
        Scanner una=new Scanner(System.in);
        System.out.print("nama menu: ");
        this.nama=una.nextLine();
        System.out.print("harga menu: ");
        this.harga=Double.parseDouble(una.nextLine());
        System.out.print("kategori(makanan/minuman): ");
        this.kategori=una.nextLine();
    }

    void info(){
        System.out.println("nama: "+this.nama);
        System.out.println("harga: "+this.harga);
        System.out.println("kategori: "+this.kategori);
    }
    
}
