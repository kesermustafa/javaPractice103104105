package Advance.practice08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Q05_HarfKullanimSayisi {

        /*
    Girilen String'de hangi harfin kaç kere kullanıldığını yazan bir kod yazınız.
    Input: String str = "Java is so Good";
    Output: String strOutput = "J1 a2 v1 i1 s2 o3 G1 d1";
     */

    public static void main(String[] args) {

        String str = "Java is so Good";
        String [] arr = str.split("");
        String cikti = "";

        System.out.println(Arrays.toString(arr));



        for(String w : arr){
            int counter = 0;

            for (String u : arr){
                if(w.equals(u)){
                    counter++;
                }
            }
            if(!cikti.contains(w)){
                cikti+=w+counter+" ";
            }

        }
        System.out.println(cikti);




    }
}
