package studiKasus;

public class studiKasus1 {
    String [] lemari = new String[4];

    void isiLemari() {
        lemari[0] = "merah";
        lemari[1] = "kuning";
        lemari[2] = "biru";
        lemari[3] = "orange";
    }

    public void pencarianSequential(){
        String hasil = " ";
        boolean ketemu = false;
        String x = "kuning";            // x = elemen/nilai yang di cari

        for (int i = 0; i < lemari.length; i++){
            if (lemari[i].equals(x)){
                ketemu = true;
                hasil = hasil + i;
            }
        }
        if (ketemu == true){
            System.out.println("Bola warna " + x + " berada pada lemari nomor" + hasil);
        } else{
            System.out.println("Bola warna " + x + " tidak ditemukan");
        }
    }
}
