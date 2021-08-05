package latihan.matrix;

public class Latihan6 {
    void run(){
        // Deklarasi array 2 dimensi / matrix
        int [][] matriks = new int[4][4];
        // brs = baris
        // kol = kolom
        int brs = 0;
        while (brs < matriks.length){
            for(int kol = 0; kol < matriks.length; kol++){
                if(brs == kol){
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println("");
            brs++;
        }
    }
    public static void main(String[] args) {
        Latihan6 program = new Latihan6();
        program.run();
    }
}
