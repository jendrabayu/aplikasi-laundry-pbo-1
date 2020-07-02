
package applaundry;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Transaksi extends Person{
    Scanner input = new Scanner(System.in);
    private String tanggal,tipeCuci;
    private int total, berat, idAdm;

    public Transaksi(int idAdm, String nama, String alamat, String nomorHp, String tanggal, int berat, String tipeCuci, int total) {
        this.tanggal = tanggal;
        this.nama = nama;
        this.alamat = alamat;
        this.nomorHp = nomorHp;
        this.berat = berat;
        this.tipeCuci = tipeCuci;
        this.total = total;
        this.idAdm = idAdm;
    }
    
    public Transaksi(){
        
    }
    
    public void tambahCucian(){
        System.out.print("\nNama        = ");
        this.nama = input.nextLine();
        System.out.print("Alamat      = ");
        this.alamat = input.nextLine();
        System.out.print("Nomor Hp    = ");
        this.nomorHp = input.nextLine();
        System.out.print("Berat       = ");
        this.berat = input.nextInt();
        System.out.print("Tipe Cucian = ");
        
        this.tanggal = tanggalNow();
        this.total = hitungBiaya(berat, tipeCuci);
        this.idAdm = Admin.id;
        
    }
    
    
    public void tampilCucian(){
        System.out.println("\nTanggal     = "+tanggal);
        System.out.println("Nama = "+nama);
        System.out.println("Alamat   = "+alamat);
        System.out.println("Nomor Hp = "+nomorHp);
        System.out.println("Berat = "+berat);
        System.out.println("Tipe Cucian = "+tipeCuci);
        System.out.println("Total Biaya = "+total);
        System.out.println("Id Admin    = "+idAdm);
        
    }
    
    protected int hitungBiaya(int berat, String tipe){
        int total = 0;
        switch (tipe) {
            case "basah":
                total = 3500 * berat;
                break;
            case "kering":
                total = 5000 * berat;
                break;
            default:
                total = 7000 * berat;
                break;
        }
        return total;
    }
    
    protected String tanggalNow(){
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");  
        Date date = new Date();  
        return dateFormat.format(date);  
    }
    
    
    
}
