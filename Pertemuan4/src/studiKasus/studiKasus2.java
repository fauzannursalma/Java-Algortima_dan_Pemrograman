package studiKasus;

import java.util.Scanner;

public class studiKasus2 {
    String [] lemari;
    Scanner scan = new Scanner(System.in);

    void inputJumlahLemari(){
        System.out.println("Berapa jumlah lemari yang di butuhkan ?");
        int jumlahLemari = scan.nextInt();
        lemari = new String[jumlahLemari];
    }
    void inputIsiLemari() {
        System.out.println("\nMasukan bola basket pada lemari yang telah disediakan");
       for (int i = 0; i < lemari.length; i++){
           System.out.print("Lemari nomor " + i);
           System.out.print(", bola basket berwarna: ");
           lemari[i] = scan.next();
       }
    }

    public void pencarianSequential(){
        String hasil = " ";
        boolean ketemu = false;
        System.out.println("\nBola warna apa yang ingin di cari ?");
        String x = scan.next();            // x = elemen/nilai yang di cari
        for (int i = 0; i < lemari.length; i++){
            if (lemari[i].equals(x)){
                ketemu = true;
                hasil = hasil + i;
            }
        }
        if (ketemu == true){
            System.out.println("Bola warna " + x + " berada pada lemari nomor" + hasil);
        } else{
            System.out.println("Bola warna " + x + " tidak ditemukan");
        }
    }
}
