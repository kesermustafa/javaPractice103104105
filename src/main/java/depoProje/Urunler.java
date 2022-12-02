package depoProje;

import java.util.ArrayList;
import java.util.Random;

public class Urunler extends ArrayList<Urunler> {

    String urunId;
    String urunAdi;
    String uretici;
    String miktar;
    String birim;
    String rafNo;
    static int counter=1000;

    Random rd = new Random();
    int sayi = rd.nextInt(65, 90);
    int rafSira = rd.nextInt(100);

    public Urunler(String urunAdi, String uretici, String miktar, String birim) {
        this.urunAdi = urunAdi;
        this.uretici = uretici;
        this.miktar = miktar;
        this.birim = birim;
        urunId = urunAdi.substring(0,1)+uretici.substring(0,1) + counter;
        counter++;
        rafNo = (char)sayi+"-"+rafSira;
    }

    public String getUrunId() {
        return urunId;
    }

    public void setUrunId(String urunId) {
        this.urunId = urunId;
    }

    public String getUrunAdi() {
        return urunAdi;
    }

    public void setUrunAdi(String urunAdi) {
        this.urunAdi = urunAdi;
    }

    public String getUretici() {
        return uretici;
    }

    public void setUretici(String uretici) {
        this.uretici = uretici;
    }

    public String getMiktar() {
        return miktar;
    }

    public void setMiktar(String miktar) {
        this.miktar = miktar;
    }

    public String getBirim() {
        return birim;
    }

    public void setBirim(String birim) {
        this.birim = birim;
    }

    public String getRafNo() {
        return rafNo;
    }

    public void setRafNo(String rafNo) {
        this.rafNo = rafNo;
    }

    @Override
    public String toString() {
        return String.format(" %-8s %-9s %-12s %-7s %-5s %-5s ", urunId, urunAdi, uretici, miktar, birim, rafNo, "%n");



    }
}
