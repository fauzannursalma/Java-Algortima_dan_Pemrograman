package ac.ifunpas.praktikum.alpro.modul2.studikasus;
import java.util.Scanner;
public class PerpustakaanMain {
	 public void run(){
		    Scanner sc = new Scanner(System.in);
	        // deklarasi tipe array
	        Perpustakaan[] arrPerpus;
	        System.out.print("Masukkan Jumlah Buku: ");
	        int panjangArray = sc.nextInt(); 
	        arrPerpus = new Perpustakaan[panjangArray];
	        input (arrPerpus);
	        output (arrPerpus);
	    }

	 public void input(Perpustakaan[] arrPerpus){	
		 Scanner sc = new Scanner(System.in);
		 System.out.println("=== Masukan Data Buku ===");
	     int i = 0;
	     while (i < arrPerpus.length){
	        // Menerima inputan dari keyboard 
	    	// Terdapat Atribut untuk menampung inputan dari keyboard,
	    	// seperti : String kodeBuku, int tahunTerbit, dan sebagainya
	            
	       	arrPerpus[i] = new Perpustakaan();
	        System.out.printf("- Buku ke-%d\n", i+1);
	        System.out.print("Masukan Kode Buku: ");
	        	String kodeBuku = sc.nextLine();

	        System.out.print("Masukan Judul Buku: ");
	            String judulBuku = sc.nextLine();

	        System.out.print("Masukan Penerbit Buku: ");
                String penerbit = sc.nextLine();

            System.out.print("Masukan Penulis Buku: ");
                String penulisBuku = sc.nextLine();

            System.out.print("Masukan Jumlah Hal: ");
                int jumlahHal = Integer.parseInt(sc.nextLine()); 
                // ParseInt digunakan untuk menerima nilai hasil konversi 
                // dari String numerik ke numerik integer

            System.out.print("Masukan Tahun Terbit: ");
	            int tahunTerbit = Integer.parseInt(sc.nextLine());
	            // ParseInt digunakan untuk menerima nilai hasil konversi 
	            // dari string numerik ke numerik integer
	            
	        // Memasukan hasil inputan pada Array of Record   		
	        arrPerpus[i].setsKodeBuku(kodeBuku);
	        arrPerpus[i].setsJudulBuku(judulBuku);
            arrPerpus[i].setsPenerbit(penerbit);
            arrPerpus[i].setsPenulisBuku(penulisBuku);
            arrPerpus[i].setiJumlahHalaman(jumlahHal);
            arrPerpus[i].setiTahunTerbit(tahunTerbit);
            
            i++;
	        }
	    }
	 
	 public void output(Perpustakaan[] arrPerpus){
		 // output record
	     System.out.println("\n--------------------");
	     System.out.println("\n=== Data Buku ===");
	     int i = 0;
	     while (i < arrPerpus.length) {          
	            System.out.printf("- Buku ke-%d  \n", i+1);
	            System.out.println("Kode Buku: " + arrPerpus[i].getsKodeBuku());
	            System.out.println("Judul Buku: " + arrPerpus[i].getsJudulBuku());
	            System.out.println("Penulis: " + arrPerpus[i].getsPenulisBuku());
	            System.out.println("Penerbit: " + arrPerpus[i].getsPenerbit());
	            System.out.println("Jumlah Halaman: " + arrPerpus[i].getiJumlahHalaman());
	            System.out.println("Tahun Terbit: " + arrPerpus[i].getiTahunTerbit());
	            i++;
	        }
	    }

	 public static void main(String[] args)
	    {
	        PerpustakaanMain program = new PerpustakaanMain();
	        program.run();
	    }
}
