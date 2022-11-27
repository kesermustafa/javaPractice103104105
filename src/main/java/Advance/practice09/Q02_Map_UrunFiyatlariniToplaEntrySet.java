package Advance.practice09;

import java.util.HashMap;
import java.util.Map;

public class Q02_Map_UrunFiyatlariniToplaEntrySet {

    /*
    Bir map içerisinde verilen fiyatların toplamını bulan bir kod yazınız.(for each loop kullanınız)
    Örn: {Kemer=19.99, Gömlek=29.99, Ayakkabı=89.99, Kazak=24.99, Kravat=19.99} ==> Toplam: 184.95
     */

    public static void main(String[] args) {

        HashMap<String, Double> urun = new HashMap<>();
        urun.put("Kemer", 19.99);
        urun.put("Gomlek", 29.99);
        urun.put("Ayakkabi", 89.99);
        urun.put("Kazak", 24.99);
        urun.put("Kravat", 19.99);

        System.out.println(fiyatToplami(urun));

    }


    public static double fiyatToplami(Map<String, Double> map ){

        System.out.println("urunler ve fiyatlar : " + map);

        double toplam = 0;
        for( Map.Entry<String, Double> w : map.entrySet()){
            toplam +=w.getValue();
        }
        return toplam;
    }






}
