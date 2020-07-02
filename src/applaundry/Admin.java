
package applaundry;

import java.util.ArrayList;
import java.util.Scanner;


public class Admin extends Person{
    public static int id;
    private String username, password;
    Scanner input = new Scanner(System.in);
    
    public Admin(){
        
    }
    
    public Admin(String nama, String alamat, String nomorHp,String username, String password) {
        this.nama = nama;
        this.alamat = alamat;
        this.nomorHp = nomorHp;
        this.username = username;
        this.password = password;
    }


    public void setId(int id) {
        Admin.id = id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
    
    public void tambahAdmin(){
        System.out.print("\nNama     = ");
        this.nama = input.nextLine();
        System.out.print("Username = ");
        this.username = input.nextLine();
        System.out.print("Password = ");
        this.password = input.nextLine();
        System.out.print("Alamat   = ");
        this.alamat = input.nextLine();
        System.out.print("Nomor Hp = ");
        this.nomorHp = input.nextLine();
    }
    
    public void tampilAdmin(){
        System.out.println("\nNama     = "+nama);
        System.out.println("Alamat   = "+alamat);
        System.out.println("Nomor Hp = "+nomorHp);
        System.out.println("Username = "+username);
        System.out.println("Password = "+password);
    }

    
    
    
    
    
    
}
