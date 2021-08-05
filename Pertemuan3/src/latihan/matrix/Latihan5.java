package latihan.matrix;

import java.util.Scanner;

public class Latihan5 {
    // Deklarasi array 2 dimensi / matrix
    int [][] matriks1 = new int[2][2];
    int [][] matriks2 = new int[2][2];
    int [][] hasil    = new int[2][2];
    // hasil[][] untuk menampung elemen-elemen matrix  
    // hasil penjumlahan, pengurangan & perkalian kedua matriks
    int brs, kol, k, jumlah = 0;
    // brs = variabel baris
    // kol = variabel kolom
    // k = variable untuk perulangan operasi perkalian
    // jumlah = untuk menampung nilai hasil operasi perkalian
    
    public void insert(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan elemen matriks ke-1:");
        for (brs = 0; brs < matriks1.length; brs++) {
            for (int kol = 0; kol < matriks1.length; kol++) {
                matriks1[brs][kol] = scan.nextInt();
            }
        }
        System.out.println("Masukkan elemen matriks ke-2:");
        for (brs = 0;brs < matriks2.length; brs++) {
            for (kol = 0; kol < matriks2.length; kol++) {
                matriks2[brs][kol] = scan.nextInt();
            }
        }
        System.out.println("================================");
    }

    public void penjumlahanMatriks(){
        System.out.println("Hasil penjumlahan matriks 1 & 2:");
        System.out.println("--------------------------------");
        for (brs = 0; brs < matriks1.length; brs++) {
            for (kol = 0; kol < matriks2.length; kol++) {
                hasil[brs][kol] = matriks1[brs][kol] + matriks2[brs][kol];
                System.out.print(hasil[brs][kol] + "\t"); // \t untuk memberikan space tab
            }
            System.out.println();
        }
        System.out.println("================================");
    }

    public void penguranganMatriks(){
        System.out.println("Hasil pengurangan matriks 1 & 2:");
        System.out.println("--------------------------------");
        for (brs = 0; brs < matriks1.length; brs++) {
            for (kol = 0; kol < matriks2.length; kol++) {
                hasil[brs][kol] = matriks1[brs][kol] - matriks2[brs][kol];
                System.out.print(hasil[brs][kol] + "\t");
            }
            System.out.println();
        }
        System.out.println("================================");
    }

    public void perkalianMatriks(){
    	System.out.println("Hasil perkalian matriks 1 & 2: ");
        System.out.println("--------------------------------");
        for (brs = 0; brs < matriks1.length; brs++) {
            for (kol = 0; kol < matriks2.length; kol++) {
                for (k = 0; k < matriks2.length; k++) {    
                    jumlah = jumlah + matriks1[brs][k] * matriks2[k][kol];
                }
                hasil[brs][kol] = jumlah;
                System.out.print(hasil[brs][kol] + "\t");
                jumlah = 0;
            }
            System.out.println();
        }
        System.out.println("================================");
    }

    public static void main(String[] args) {
        Latihan5 l5 = new Latihan5(); // intansiasi object
        l5.insert();
        l5.penjumlahanMatriks();
        l5.penguranganMatriks();
        l5.perkalianMatriks();
    }
}
