package applaundry;

import java.util.ArrayList;


public class MenuCucian {
    ArrayList<Transaksi> dataCucian = new ArrayList<>();
    
    public MenuCucian(){
        Transaksi laundry = new Transaksi();
        dataCucian.add(new Transaksi(Admin.id, "Maria", "Jepang", "086252581811", 
                laundry.tanggalNow() , 10, "basah", laundry.hitungBiaya(10, "basah")));
        dataCucian.add(new Transaksi(Admin.id, "Ozawa", "Jepang", "089252581811", 
                laundry.tanggalNow() , 5, "kering", laundry.hitungBiaya(5, "kering")));
        
        
    }
    
    public void tambahkanCucian(){
        Transaksi laundry = new Transaksi();
        System.out.println("========== TAMBAH CUCIAN ==========");
        laundry.tambahCucian();
        dataCucian.add(laundry);
        
        System.out.println("\n======== NOTA CUCIAN ============");
        laundry.tampilCucian();
    }
    
    public void tampilkanAllTranaski(){
        System.out.println("========= DATA TRANSAKSI ==========");
        for (int i = 0; i < 10; i++) {
            dataCucian.get(i).tambahCucian();
        }
    }
    
    
    public static void main(String[] args) {
        MenuCucian m = new MenuCucian();
        m.tampilkanAllTranaski();
        m.tambahkanCucian();
    }
    
}
