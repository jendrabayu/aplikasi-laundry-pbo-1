package applaundry;

import java.util.ArrayList;
import java.util.Scanner;


public class MenuAdmin{
    Scanner input = new Scanner(System.in);
    private int ulang = 0;
    ArrayList<Admin> dataAdmin = new ArrayList<>();
    
    public MenuAdmin(){
        dataAdmin.add(new Admin("Jendra Bayu", "Jl. Monginsidi", "089521698552", "admin", "admin"));
       
    }
    
    public void menuAdmin(){
        while (ulang < 1) {            
            System.out.println("\n*******MENU ADMIN*******"
                + "\n1. Tambah Admin "
                + "\n2. Lihat Data Admin "
                + "\n3. Keluar");
            System.out.print("Pilih Menu = ");
            int pilih = input.nextInt();
            switch(pilih){
                case 1:
                    tambahkanAdmin();
                    break;
                case 2:
                    tampilkanAdmin();
                    break;
                case 3:
                    ulang = 2;
                    break;
            }
        }
        
    }
    
    private void tambahkanAdmin(){
        Admin admin = new Admin();
        System.out.println("========== TAMBAH ADMIN ==========");
        admin.tambahAdmin();
        dataAdmin.add(admin);
        System.out.println("Berhasil Ditambah\n");
    }
    
    private void tampilkanAdmin(){
        System.out.println("========== DATA SEMUA ADMIN ==========");
        for (int i = 0; i < dataAdmin.size(); i++) {
            dataAdmin.get(i).tampilAdmin();
        }
    }
}
