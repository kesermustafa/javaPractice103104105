package Advance.practice05;

public class Q05_Market_Constructor {

    //Ürün adı, ürün fiyatı ve (varsa) son kullanma tarihlerini yazdıran bir market programı yazınız..

    public static void main(String[] args) {

        Market ekmekObjesi = new Market("Ekmek", 5, 1);

        System.out.println(ekmekObjesi.urunAdi + " "+ ekmekObjesi.urunFiyati + " TL, " + "SKT " +  ekmekObjesi.sonKullanmaTarihi );


        Market nutellaObjesi = new Market("Nutella", 45, 20);
        System.out.println(nutellaObjesi.urunAdi + " "+ nutellaObjesi.urunFiyati + " TL, " + "SKT " +  nutellaObjesi.sonKullanmaTarihi );

        Market bardakObjesi = new Market("Bardak", 49.99);
        System.out.println(bardakObjesi.urunAdi + " "+ bardakObjesi.urunFiyati + " TL, " + "SKT " +  bardakObjesi.sonKullanmaTarihi );






    }


}
