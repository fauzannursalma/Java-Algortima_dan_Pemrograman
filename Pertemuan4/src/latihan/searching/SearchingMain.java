package latihan.searching;

public class SearchingMain {
    public static void main(String[] args) {
        Searching searching = new Searching();
        searching.isiHImpunan();
        searching.tampilHimpunan();

        searching.pencarianSequential(1);
        searching.pencarianSequential(5);
        searching.pencarianSequential(9);

        searching.pencarianBinary(1);
        searching.pencarianBinary(5);
        searching.pencarianBinary(9);
    }
}
