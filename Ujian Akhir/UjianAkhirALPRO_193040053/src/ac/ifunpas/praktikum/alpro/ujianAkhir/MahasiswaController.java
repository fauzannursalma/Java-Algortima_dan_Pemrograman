package ac.ifunpas.praktikum.alpro.ujianAkhir;
import java.io.*;
import java.util.Scanner;
public class MahasiswaController {
    // Fauzan Nursalma Mawardi - 193040053
    Mahasiswa[] mahasiswas;
    StringBuilder stringBuilder = new StringBuilder();
    String[] dump;
    Scanner scanner = new Scanner(System.in);
    BufferedReader brInput = new BufferedReader(new InputStreamReader(System.in));
    FileReader fr = null;
    char eof = '|';
    int maxIndex = 0;

    // Method Hitung Jumlah Record
    public void hitungJmlRecord() {
        int data = -1;
        char ch;
        maxIndex = 0;
        try {
            fr = new FileReader("mahasiswa.txt");
            data = fr.read();
            ch = (char) data;
            while (ch != eof && data != -1) {
                if (ch == '#' && data != 13 && data != 10) {
                    maxIndex++;
                }
                ch = (char) fr.read();
            }
            dump = new String[maxIndex];
            mahasiswas = new Mahasiswa[maxIndex];
            fr.close();
        } catch (IOException e) {
            System.out.println("Error I/O");
        }
    }

    // Method Membaca File
    public void bacaFile() {
        int data = -1;
        char ch;
        int index = 0;
        try {
            fr = new FileReader("mahasiswa.txt");
            data = fr.read();
            ch = (char) data;
            while (ch != eof && data != -1) {
                if (ch != '#') {
                    stringBuilder.append(ch);
                } else {
                    dump[index] = stringBuilder.toString();
                    index++;
                    stringBuilder = new StringBuilder();
                }
                ch = (char) fr.read();
            }
            fr.close();
        } catch (IOException e) {
            System.out.println("Error I/O");
        }
    }

    // Method Mengambil Data
    public void ambilData() {
        hitungJmlRecord();
        bacaFile();
        String[] temp;
        for (int i = 0; i < dump.length; i++) {
            temp = dump[i].split("%");

            mahasiswas[i] = new Mahasiswa();
            mahasiswas[i].setiNRP(Integer.parseInt(temp[0]));
            mahasiswas[i].setsNama(temp[1]);
            mahasiswas[i].setdIPK(Double.parseDouble(temp[2]));
        }
    }

    // Method Menyimpan Data ke File
    public void simpanKeFile() {
        try {
            FileWriter fw = new FileWriter("mahasiswa.txt", false);
            for (int i = 0; i < mahasiswas.length; i++) {
                fw.write(mahasiswas[i].getiNRP() + "%" + mahasiswas[i].getsNama() + "%"
                        + mahasiswas[i].getdIPK() + "#");
                fw.flush();
            }
            fw.write(eof);
            fw.flush();
            fw.close();
        }
        catch (IOException e) {
            System.out.println("Error I/O");
        }
    }

    // Method Menampilka Data
    public void tampilData() {
        System.out.println();
        int urut = 1;
        boolean empty = true;
        for (int i = 0; i < mahasiswas.length; i++) {
            if (mahasiswas[i] != null) {
                System.out.println("Data Mahasiswa Ke-" + urut);
                System.out.println(mahasiswas[i].tulisMahasiswa());
                System.out.println("=========================================");
                urut++;
                empty = false;
            }
        }
        if (empty) {
            System.out.println("Tidak ada data yang dapat ditampilkan\n");
        }
    }






}
