import rumus.Bola;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String pembuka = "Selamat Datang di Mata Kuliah \" Pemrograman Berorientasi Objek \" ";
        int tahun = 2022;

        System.out.println("---------------------------------------------------------------------------");
        System.out.println(pembuka + "Tahun " + tahun);
        System.out.println("---------------------------------------------------------------------------");
        
    //Scan Keyboard
    Scanner keyboard = new Scanner(System.in);
    
    Bola bola = new Bola();
    bola.r = 20;
    System.out.println("Menghitung Luas dan Volume Permukaan Bola");
    System.out.print("Masukkan Nilai r : ");
    bola.r = keyboard.nextInt();    
    bola.tampilkanLuasPermukaanBola();
    bola.tampilkanVolumeBola();

    keyboard.close();
    }
    
}
