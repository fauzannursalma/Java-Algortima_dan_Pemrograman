package ac.ifunpas.praktikum.alpro.ujianAkhir;

public class Mahasiswa {
    // Fauzan Nursalma Mawardi - 193040053
    // Deklarasi Atribut
    private int iNRP;
    private String sNama;
    private double dIPK;

    public String tulisMahasiswa(){
        return  "NRP  : " + iNRP + "\nNama : " + sNama + "\nIPK  : " + dIPK;
    }


    // Method Setter dan Getter

    public int getiNRP(){
        return iNRP;
    }
    public void setiNRP(int iNRP){
        this.iNRP = iNRP;
    }

    public String getsNama(){
        return sNama;
    }
    public void setsNama(String sNama){
        this.sNama = sNama;
    }

    public double getdIPK(){
        return dIPK;
    }
    public void setdIPK(double dIPK){
        this.dIPK = dIPK;
    }
}
