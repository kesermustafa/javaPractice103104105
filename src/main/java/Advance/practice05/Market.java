package Advance.practice05;

import java.time.LocalDate;

public class Market {

    String urunAdi;
    double urunFiyati;
    String sonKullanmaTarihi;


    Market(String urunIsmi, double fiyati, int aySonra){
       urunAdi = urunIsmi;
       urunFiyati = fiyati;
       sonKullanmaTarihi = LocalDate.now().plusMonths(aySonra).toString();
    }


    Market(String urunIsmi, double fiyati){
        urunAdi = urunIsmi;
        urunFiyati = fiyati;
        sonKullanmaTarihi = "Bu urunun son kullanma tarihi yoktur";
    }






}
