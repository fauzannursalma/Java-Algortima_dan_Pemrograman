package mesinKarakter.latihan;

public class MesinKarakterMain {
    public static void main(String[] args) {
        MesinKarakter mesinKarakter = new MesinKarakter();
        String file = "D:\\Kuliah\\semester3\\Algoritma & Pemrograman\\Praktikum_Alpro\\Pertemuan5\\src\\helloWorld.txt";
        mesinKarakter.bukaFile(file);
        System.out.println("Isi dari file helloWorld.txt adalah: ");
        mesinKarakter.bacaFile();
        mesinKarakter.closeFile();

        System.out.println("\n");

        System.out.print("Kata yang ada pada file helloWorld.txt berjumlah: ");
        mesinKarakter.bukaFile(file);
        System.out.println(mesinKarakter.hitungJumlahKata());
        mesinKarakter.closeFile();

        System.out.print("Huruf yang ada pada file helloWorld.txt berjumlah: ");
        mesinKarakter.bukaFile(file);
        System.out.println(mesinKarakter.hitungJumlahKarakter());
        mesinKarakter.closeFile();

        System.out.print("Huruf spesifik (L) yang ada pada file helloWorld.txt berjumlah: ");
        mesinKarakter.bukaFile(file);
        System.out.println(mesinKarakter.hitungKarakterSpesifik('l'));
        mesinKarakter.closeFile();

        mesinKarakter.bukaFile("D:\\Kuliah\\semester3\\Algoritma & Pemrograman\\Praktikum_Alpro\\Pertemuan5\\src\\unpas.txt");
        mesinKarakter.ambilHurufAwal();
        mesinKarakter.closeFile();
    }
}
