package latihan.matrix;

public class Latihan3 {
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
    public void penjumlahanMatriks() {
        c[0][0] = a[0][0] + b[0][0];
        c[0][1] = a[0][1] + b[0][1];
        c[1][0] = a[1][0] + b[1][0];
        c[1][1] = a[1][1] + b[1][1];
    }
    public void penguranganMatriks() {
        c[0][0] = a[0][0] - b[0][0];
        c[0][1] = a[0][1] - b[0][1];
        c[1][0] = a[1][0] - b[1][0];
        c[1][1] = a[1][1] - b[1][1];
    }
    public void tampilMatriks() {
        System.out.print("|" + c[0][0] + " ");
        System.out.println(" " + c[0][1] + "|");
        System.out.print("|" + c[1][0] + " ");
        System.out.println(" " + c[1][1] + "|");
    }
    public static void main(String[] args) {
        Latihan3 l3 = new Latihan3();
        l3.insert();
        l3.penguranganMatriks();
        l3.tampilMatriks();
    }
}
