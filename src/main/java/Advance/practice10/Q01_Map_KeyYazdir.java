package Advance.practice10;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Q01_Map_KeyYazdir {


    //Aşağıda verilen fiyat listesinden fiyatı 29.99 olan ürünlerin adlarını yazdırınız.

    public static void main(String[] args) {

        Map<String, Double> urunler = new HashMap<>();

        urunler.put("Kemer", 19.99);
        urunler.put("Gomlek", 29.99);
        urunler.put("Kazak", 24.99);
        urunler.put("Pijama", 29.99);
        urunler.put("Ayakkabi", 89.99);
        urunler.put("Kravat", 19.99);
        urunler.put("Terlik", 29.99);


        System.out.println("Fiyatlari 29.00 olan urunler");

        for(Map.Entry<String, Double> w : urunler.entrySet()){
            if(w.getValue()==29.99){
                System.out.println(w.getKey() + " " +  w.getValue());
            }
        }
        System.out.println("--------------");



        Map<String, Double> sepet = new HashMap<>();

        for(Map.Entry<String, Double> w : urunler.entrySet()){
            if(w.getKey().equals("Kazak")||w.getKey().equals("Terlik")){
                sepet.put(w.getKey(), w.getValue());
            }
            System.out.print(w);
            System.out.println();
        }

        double toplam = 0;
        for(Map.Entry<String, Double> w : sepet.entrySet()) {
            toplam += w.getValue();
        }
        System.out.println("sepetinizdeki urunler"+ sepet);
        System.out.println(toplam);


    }

}
