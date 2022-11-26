package Advance.practice08;

import java.util.ArrayList;
import java.util.List;

public class SansliKullanici extends Kayit{

    static List<String> sansliKullanici = new ArrayList<>();

    public static void sansliKullanici(){

        for(int j = 0; j<kullanici.size(); j++){

            String[] str = kayitZamani.get(j).split(":");
            int i = Integer.parseInt(str[2]);

            if(i<10){
                sansliKullanici.add(kullanici.get(j));
            }
        }

        if(sansliKullanici.isEmpty()){
            System.out.println("Maalesef sansli kullanici yok!");
        }else{
            System.out.println( "Sansli Kullanicilar : " + sansliKullanici);
        }

    }

}
