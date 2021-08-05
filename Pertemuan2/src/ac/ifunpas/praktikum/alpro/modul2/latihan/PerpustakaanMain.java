package ac.ifunpas.praktikum.alpro.modul2.latihan;

import java.util.Scanner;

public class PerpustakaanMain {
    public static void main(String[] args) {
        // Array of Records
       Perpustakaan[] arrPerpus = new Perpustakaan[2];//Elemen Array of Record = 0, 1
       Perpustakaan p = new Perpustakaan();

        // Atribut menampung inputan dari keyboard
        Scanner sc = new Scanner(System.in);
        String kodeBuku;
        String judulBuku;
        String penulisBuku;
        String penerbit;
        int jumlahHal;
        int tahunTerbit;

        // Menerima inputan dari keyboard
        System.out.println("Masukan Kode Buku: ");
        kodeBuku = sc.nextLine();
        System.out.println("Masukan Judul Buku: ");
        judulBuku = sc.nextLine();
        System.out.println("Masukan Penerbit Buku: ");
        penerbit = sc.nextLine();
        System.out.println("Masukan Penulis Buku: ");
        penulisBuku = sc.nextLine();
        System.out.println("Masukan Jumlah Hal: ");
        jumlahHal = sc.nextInt();
        System.out.println("Masukan Tahun Terbit: ");
        tahunTerbit = sc.nextInt();

        // Memasukan hasil inputan pada Array of Record
        arrPerpus[0] = new Perpustakaan();
        arrPerpus[0].setsKodeBuku(kodeBuku);
        arrPerpus[0].setsJudulBuku(judulBuku);
        arrPerpus[0].setsPenulisBuku(penulisBuku);
        arrPerpus[0].setsPenerbit(penerbit);
        arrPerpus[0].setiJumlahHalaman(jumlahHal);
        arrPerpus[0].setiTahunTerbit(tahunTerbit);

        // Menampilkan isi dari Array of Record
        System.out.println("= Isi dari Array of Record Perpustakaan =");
        System.out.println("Kode Buku: "+ arrPerpus[0].getsKodeBuku());
        System.out.println("Judul Buku: "+ arrPerpus[0].getsJudulBuku());
        System.out.println("Penulis: "+ arrPerpus[0].getsPenulisBuku());
        System.out.println("Penerbit: "+ arrPerpus[0].getsPenerbit());
        System.out.println("Jumlah Halaman: "+ arrPerpus[0].getiJumlahHalaman());
        System.out.println("Tahun Terbit: "+ arrPerpus[0].getiTahunTerbit());
    }
}
