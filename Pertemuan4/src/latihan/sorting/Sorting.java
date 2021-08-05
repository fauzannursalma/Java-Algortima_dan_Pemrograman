package latihan.sorting;

public class Sorting {
    int [] himpunan = new int[7];

    void isiHImpunan() {
        himpunan[0]= 15;
        himpunan[1]= 7;
        himpunan[2]= 3;
        himpunan[3]= 21;
        himpunan[4]= 5;
        himpunan[5]= 1;
        himpunan[6]= 18;
    }
    void tampilHimpunan() {
        System.out.println("ISI ARRAY HIMPUNAN");
        System.out.printf("Isi himpunan: ");
        for (int i = 0; i < himpunan.length; i++) {
            System.out.print(himpunan[i] + " ");
        }
        System.out.println("\n");
    }
    // Sequential Search
    public void pencarianSequential(int x){
        String hasil = " ";
        boolean ketemu = false;
        System.out.println("HASIL PENCARIAN SEQUENTIAL SEARCH");
        for (int i = 0; i < himpunan.length; i ++){
            if (himpunan[i] == x){
                ketemu = true;
                hasil = hasil + " " + i;
            }
        }
        if (ketemu == true){
            System.out.println("Data ada di Index ke-" + hasil);
        } else {
            System.out.println("Data tidak ditemukan");
        }
    }
    // Sorting Selection
    void selectionSort(){
        int i, j, pos, temp;
        for (i = 0; i < himpunan.length - 1; i++){
            pos = i;

            for (j = i; j < himpunan.length; j++){
                if (himpunan[j] < himpunan[pos]){
                    pos = j;
                }
            }

            temp = himpunan[i];
            himpunan[i] = himpunan[pos];
            himpunan[pos] = temp;
        }
        System.out.println("\nSORTING MENGGUNAKAN SELECTION SORT");
        System.out.printf("Isi himpunan: ");
        for (i = 0; i < himpunan.length; i++) {
            System.out.print(himpunan[i] + " ");
        }
        System.out.println("\n");
    }
    void bubbleSort(){
        int i, j, temp;
        for (i = 0; i < himpunan.length; i++){
            for (j = 0; j < himpunan.length - 1; j++){
                if (himpunan[j] > himpunan[j+1]){
                    temp = himpunan[j];
                    himpunan[j] = himpunan[j + 1];
                    himpunan[j + 1] = temp;
                }
            }
        }
        System.out.println("SORTING MENGGUNAKAN BUBBLE SORT");
        System.out.printf("Isi himpunan: ");
        for (i = 0; i < himpunan.length; i++) {
            System.out.print(himpunan[i] + " ");
        }
        System.out.println("\n");
    }

    void bubbleSortDes(){
        int i, j, temp;
        for (i = 0; i < himpunan.length; i++){
            for (j = 1; j < himpunan.length - i; j++){
                if (himpunan[j -1] < himpunan[j]){
                    temp = himpunan[j-1];
                    himpunan[j - 1] = himpunan[j];
                    himpunan[j] = temp;
                }
            }
        }
        System.out.println("SORTING MENGGUNAKAN BUBBLE SORT DESC");
        System.out.printf("Isi himpunan: ");
        for (i = 0; i < himpunan.length; i++) {
            System.out.print(himpunan[i] + " ");
        }
        System.out.println("\n");
    }
    
    public void insertionSort(){
        int i, j, temp;
        for (i = 0; i < himpunan.length; i++){
            temp = himpunan[i];
            j = i;
            while ((j > 0) && (himpunan[j - 1] > temp)){
                himpunan[j] = himpunan[j-1];
                j--;
            }
            himpunan[j] = temp;
        }
        System.out.println("SORTING MENGGUNAKAN INSERTION SORT");
        System.out.printf("Isi himpunan: ");
        for (i = 0; i < himpunan.length; i++) {
            System.out.print(himpunan[i] + " ");
        }
        System.out.println("\n");
    }
    
     public void insertionSortDes(){
        int i, j, temp;
        for (i = 0; i < himpunan.length; i++){
            temp = himpunan[i];
            j = i;
            while ((j > 0) && (himpunan[j - 1] < temp)){
                himpunan[j] = himpunan[j-1];
                j--;
            }
            himpunan[j] = temp;
        }
         System.out.println("SORTING MENGGUNAKAN INSERTION SORT DESC");
         System.out.printf("Isi himpunan: ");
        for (i = 0; i < himpunan.length; i++) {
             System.out.print(himpunan[i] + " ");
         }
         System.out.println("\n");
     }
}
