package ac.ifunpas.praktikum.alpro.modul1.latihan;

import java.util.Arrays;

public class LatihanArray3_193040053 {
	public static void main(String[] args)
    {
		// Deklarasi Array
        double []dataArray={2.1 , 0.0 , 3.5 , 3.14 , 0.9};

        System.out.println("Mengurutkan elemen Array berdasarkan nilai elemen terbesar ke terkecil");
        System.out.println("======================================================================");
        System.out.println("\nElemen array sebelum diurutkan : ");
        // Menampilkan urutan elemen awal
        for(int i= 0; i < dataArray.length; i++)
            System.out.print(dataArray[i]+ "  ");
        System.out.println("\n");

        Arrays.sort(dataArray); // ---> mengurutkan secara ascending menggunakan library Arrays
        
        System.out.println("Elemen array setelah diurutkan (Descending) : ");
        // Menampilkan urutan elemen array berdasarkan dari nilai elemen terbesar ke terkecil (descending)
        int i = dataArray.length -1;
		while (i >= 0) {
			System.out.print(dataArray[i]+ "  ");
			i--;
		}
    }
}
