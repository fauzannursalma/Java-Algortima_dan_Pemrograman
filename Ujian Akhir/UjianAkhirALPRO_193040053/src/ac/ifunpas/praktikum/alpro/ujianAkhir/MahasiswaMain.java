package ac.ifunpas.praktikum.alpro.ujianAkhir;
import java.io.IOException;
import java.util.Scanner;
public class MahasiswaMain {
    // Fauzan Nursalma Mawardi - 193040053
    public static void main(String[] args) throws IOException {
        MahasiswaController mc = new MahasiswaController();
        Scanner scan = new Scanner(System.in);
        mc.ambilData();
        int menu = 0;
        boolean loop = true;

        while (menu != 99){
            System.out.println("Menu:");
            System.out.println("1. Tampil Data");
            System.out.println("2. Sort Data");
            System.out.print("Masukan menu yang di inginkan:");
            menu = scan.nextInt();
            switch (menu){
                case 1: mc.tampilData();break;
                case 2: ;break;
                case 99:
                    System.out.println("Selamat Tinggal"); break;
                default:
                    System.out.println("Menu tidak tersedia");
            }
        }
    }
}
