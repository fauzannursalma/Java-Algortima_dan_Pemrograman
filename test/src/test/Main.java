package test;


import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Controller ck  = new Controller();
		Scanner sc = new Scanner(System.in);
		ck.ambilData();
		int menu = 0;
		int iAngka;
		
		while(menu != 99)
		{
			System.out.println("Menu:");
			System.out.println("1. Tambah Data");
			System.out.println("2. Tampil Data");
			System.out.println("3. Ubah Data");
			System.out.println("99. Keluar");
			System.out.print("Masukan menu yang diinginkan: ");
			menu = sc.nextInt();
			switch(menu)
			{
			case 1: ck.tambahData();break;
			case 2: ck.tampilData();break;
			case 3: ck.ubahData();break;
			case 99:
				System.out.println("Selamat Tinggal");break;
			}
		}
	}
}