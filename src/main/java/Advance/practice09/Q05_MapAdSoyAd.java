package Advance.practice09;

import java.util.HashMap;
import java.util.Map;

public class Q05_MapAdSoyAd {


    /*
      İki farklı Array'de aynı indekste barındırırılan ad ve soyadları örnekteki gibi yazdıran bir kod yazınız.
          input : {"John", "Mark", "Ali"}; {"Doe", "Twain", "Can"};
          output : {John=Doe, Mark=Twain, Ali=Can};
       */

    public static void main(String[] args) {

        String[] ad = {"John", "Mark", "Ali"};
        String[] soyad = {"Doe", "Twain", "Can"};

        Map<String, String> adsoyad = new HashMap<>();

        for(int i=0; i< ad.length; i++){
            adsoyad.put(ad[i], soyad[i]);
        }

        System.out.println(adsoyad);




    }
}
