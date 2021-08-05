package ac.ifunpas.praktikum.alpro.modul2.latihan;

public class Perpustakaan {
    // Deklarasi Atribut
    private String sKodeBuku;
    private String sJudulBuku;
    private String sPenulisBuku;
    private String sPenerbit;
    private int iJumlahHalaman;
    private int iTahunTerbit;

    // Method Setter dan Getter
    public void setsKodeBuku(String sKodeBuku){
        this.sKodeBuku = sKodeBuku;
    }
    public String getsKodeBuku(){
        return sKodeBuku;
    }

    public String getsJudulBuku() {
        return sJudulBuku;
    }
    public void setsJudulBuku(String sJudulBuku) {
        this.sJudulBuku = sJudulBuku;
    }

    public String getsPenulisBuku() {
        return sPenulisBuku;
    }
    public void setsPenulisBuku(String sPenulisBuku) {
        this.sPenulisBuku = sPenulisBuku;
    }

    public String getsPenerbit() {
        return sPenerbit;
    }
    public void setsPenerbit(String sPenerbit) {
        this.sPenerbit = sPenerbit;
    }

    public int getiJumlahHalaman() {
        return iJumlahHalaman;
    }
    public void setiJumlahHalaman(int iJumlahHalaman) {
        this.iJumlahHalaman = iJumlahHalaman;
    }

    public int getiTahunTerbit() {
        return iTahunTerbit;
    }
    public void setiTahunTerbit(int iTahunTerbit) {
        this.iTahunTerbit = iTahunTerbit;
    }
}