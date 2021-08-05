package ac.ifunpas.praktikum.alpro.modul1.latihan;

import java.util.Scanner;

public class LatihanArray2_193040053 {
	public static void main(String[] args) {
        String [] arrNRP = new String[5];
        Scanner sc = new Scanner(System.in);

        // Input dari keyboard ke Array
        for (int indeks = 0; indeks < arrNRP.length; indeks++){
            System.out.println("Masukan NRP:");
            arrNRP[indeks] = sc.next();
        }

        // Tampilkan elemen dari Array
        for (int indeks = 0; indeks < arrNRP.length; indeks++){
            System.out.println("NRP : " + arrNRP[indeks]);
        }
    }

}
