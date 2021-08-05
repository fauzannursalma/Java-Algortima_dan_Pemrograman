package latihan.matrix;

public class Latihan4 {
    int a[][] = new int[2][2];
    int b[][] = new int[2][2];
    int c[][] = new int[2][2];

    public void insert() {
        a[0][0] = 1; 
        a[0][1] = 2;   
        a[1][0] = 3; 
        a[1][1] = 4; 
        
        b[0][0] = 5; 
        b[0][1] = 6;
        b[1][0] = 7; 
        b[1][1] = 8;


    }

    public void perkalianMatriks() {
        c[0][0] = a[0][0] * b[0][0] + a[0][1] * b[1][0] ;
        c[0][1] = a[0][0] * b[0][1] + a[0][1] * b[1][1];
        c[1][0] = a[1][0] * b[0][0] + a[1][1] * b[1][0];
        c[1][1] = a[1][0] * b[0][1] + a[1][1] * b[1][1];
    }

    public void tampilMatriks() {
        System.out.println("Hasil Perkalian Matriks a dan b");
        System.out.print("|" + c[0][0] + " ");
        System.out.println(" " + c[0][1] + "|");
        System.out.print("|" + c[1][0] + " ");
        System.out.println(" " + c[1][1] + "|");
    }

    public static void main(String[] args) {
        Latihan4 l4 = new Latihan4();
        l4.insert();
        l4.perkalianMatriks();
        l4.tampilMatriks();
    }
}
