package test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Controller {
	Angka [] angkas;
	StringBuilder stringBuilder = new StringBuilder();
	String[] dump;
	Scanner scanner = new Scanner(System.in);
	BufferedReader brInput = new BufferedReader(new InputStreamReader(System.in));
	FileReader fr = null;
	char eof = '.';
	int maxIndex = 0;
	
	public void hitungJmlRecord()
	{
		int data = -1;
		char ch;
		maxIndex = 0;
		try
		{
			fr = new FileReader("DataAngka.txt");
			data = fr.read();
			ch = (char)data;
			while(ch != eof && data != -1)
			{
				if(ch == '|' && data != 13 && data != 10)
				{
					maxIndex++;
				}
				ch = (char) fr.read();
			}
			dump = new String[maxIndex];
			angkas = new Angka[maxIndex];
			
			fr.close();
		}
		catch (IOException e)
		{
			System.out.println("Error I/O");
		}
	}
	
	public void bacaFile()
	{
		int data = -1;
		char ch;
		int index = 0;
		try {
			fr = new FileReader("DataAngka.txt");
			data = fr.read();
			ch = (char) data;
			while(ch != eof && data != -1)
			{
				if(ch != '|')
				{
					stringBuilder.append(ch);
				}
				else
				{
					dump[index] = stringBuilder.toString();
					index++;
					stringBuilder = new StringBuilder();
				}
				ch = (char) fr.read();
			}
			fr.close();
		}
		catch (IOException e)
		{
			System.out.println("Error I/O");
		}
	}
	
	public void ambilData() {
		hitungJmlRecord();
		bacaFile();
		String[] temp;
		for(int i = 0; i < dump.length; i++)
		{
			temp = dump[i].split("~");
			
			angkas[i] = new Angka();
			angkas[i].setiAngka(Integer.parseInt(temp[0]));
		}
	}
	
	public void simpanKeFile()
	{
		try
		{
			FileWriter fw = new FileWriter("DataAngka.txt", false);
			for(int i = 0; i < angkas.length; i++)
			{
				fw.write(angkas[i].getiAngka() + "|");
				fw.flush();
			}
			fw.write(eof);
			fw.flush();
			fw.close();
		}
		catch (IOException e)
		{
			System.out.println("Error I/O");
		}
	}
	
	public void tampilData()
	{
		System.out.println();
		int urut = 1;
		boolean empty = true;
		for(int i = 0; i < angkas.length; i++)
		{
			if(angkas[i] != null)
			{
				System.out.println("Data Angka Ke-" + urut);
				System.out.println(angkas[i].tulisAngka());
				System.out.println("==========================================");
				urut++;
				empty = false;
			}
		}
		if(empty)
		{
			System.out.println("Tidak ada data yang dapat ditampilkan\n");
		}
	}
	
	public void tambahData()
	{
		int yAngka;
		
		Angka[] perpustakaansTemp = angkas;
		int index = angkas.length + 1;
		angkas = new Angka[index];
		System.out.println("==========================================");
		System.out.print("Masukkan Angka: ");
		yAngka = scanner.nextInt();

		for(int i = 0; i < angkas.length; i++)
		{
			if(i < perpustakaansTemp.length)
			{
				angkas[i] = new Angka();
				angkas[i].setiAngka(perpustakaansTemp[i].getiAngka());
			}
			else
			{
				angkas[i] = new Angka();
				angkas[i].setiAngka(yAngka);
			}
		}
		simpanKeFile();
		System.out.println("Data berhasil ditambahkan");
		System.out.println("=========================================");
	}
	
	public void ubahData() throws IOException {
		int AngkaBaru;
		
		boolean ketemu = false;
		System.out.println("===========================================");
		System.out.println("Masukkan Angka yang ingin diubah : ");
		int Angkayow = scanner.nextInt();
		
		for(int i = 0; i < angkas.length; i++)
		{
			if(angkas[i].getiAngka() == Angkayow)
			{
				System.out.print("Angka Baru : ");
				AngkaBaru = scanner.nextInt();
				
				angkas[i].setiAngka(AngkaBaru);
				
				ketemu = true;
			}
		}
		simpanKeFile();
		System.out.println("Data berhasil dirubah");
		
		if(!ketemu)
		{
			System.out.println("Data tidak ditemukan");
		}
	}
}
