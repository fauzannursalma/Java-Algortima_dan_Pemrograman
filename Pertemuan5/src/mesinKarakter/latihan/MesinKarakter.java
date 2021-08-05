package mesinKarakter.latihan;

import java.io.FileReader;
import java.io.IOException;

public class MesinKarakter {
    private FileReader fileReader = null;
    private int data = -1;

    public void bukaFile(String file){
        try {
            fileReader = new FileReader(file);
        } catch (IOException e){
            System.out.println("File Not Found");
        }
    }

    public void bacaFile(){
        char ch;
        try{
            if (fileReader != null){
                data = fileReader.read();
                ch = (char) data;
                while (ch != '#' && data != -1){
                    System.out.print(ch);
                    ch = (char) fileReader.read();
                }
                System.out.println("");
            }
        } catch (IOException e){
            System.out.println("File Not FOund");
        }
    }

    public int hitungJumlahKata(){
        int jum = 0;
        char ch;
        try{
            if (fileReader != null){
                data = fileReader.read();
                ch = (char) data;
                while (ch != '#' && data != -1){
                    if (ch == ' ' || ch == '\n'){
                        jum++;
                    }
                    ch = (char) fileReader.read();
                }
            }
        } catch (IOException e){
            System.out.println("File Not Found");
        }
        return jum;
    }

    public int hitungJumlahKarakter(){
        int jum = 0;
        char ch;
        try {
            if (fileReader != null){
                data = fileReader.read();
                ch = (char) data;
                while (ch != '#' && data != -1){
                    if (ch != ' ' && ch != '\r' && ch != '\n'){
                        jum++;
                    }
                    ch = (char) fileReader.read();
                }
            }
        } catch (IOException e){
            System.out.println("File Not Found");
        }
        return jum;
    }

    public int hitungKarakterSpesifik(char karakter){
        int jum = 0;
        char ch;
        try {
            if (fileReader != null) {
                data = fileReader.read();
                ch = (char) data;
                while (ch != '#' && data != -1){
                    if (ch == karakter){
                        jum++;
                    }
                    ch = (char) fileReader.read();
                }
            }
        }catch (IOException e){
            System.out.println("File Not FOund");
        }
        return jum;
    }

    public void ambilHurufAwal(){
        try{
            char [] arrayChar = new char[37];
            fileReader.read(arrayChar);
            String str = new String(arrayChar);
            String [] spilted = new String[arrayChar.length];
            spilted = str.split(" ");

            char [] container = new char[arrayChar.length];

            for (int i = 0; i < spilted.length; i++){
                if (!spilted[i].equalsIgnoreCase("#")){
                    container[i] = spilted[i].charAt(0);
                    System.out.print(container[i]);
                }
            }
        } catch (IOException e){
            System.out.println("File Not Found");
        }
    }

    public void closeFile(){
        try {
            fileReader.close();
        } catch (IOException e) {
            System.out.println("File Not Found");
        }
    }
}
