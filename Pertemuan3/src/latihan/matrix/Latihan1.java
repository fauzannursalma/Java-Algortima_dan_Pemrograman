package latihan.matrix;

public class Latihan1 {
    public static void main(String[] args) {
        int matrix[][] = new int[2][2];

        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[1][0] = 3;
        matrix[1][1] = 4;

        System.out.print("|" + matrix[0][0] + " ");
        System.out.println(" " + matrix[0][1] + "|");
        System.out.print("|" + matrix[1][0] + " ");
        System.out.println(" " + matrix[1][1] + "|");
    }
}
