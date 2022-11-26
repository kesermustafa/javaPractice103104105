package Advance.Practice04;

import java.util.ArrayList;
import java.util.List;

public class Q04_OrtakEleman {
    /*
     * İki Array'de ortak bulunan elementleri yazdırınız.
     * (case sensitivity olmadan)

     * Input1 : {John,Brad,Angel,Sofia,Emily}
     * Input2 : {sofia,brad,grace,emily,hazel}

     * Output : [brad,sofia,emily]
     */

    public static void main(String[] args) {


        String[] str1 = {"John","Brad","Angel","Sofia","Emily"};
        String[] str2 = {"sofia","brad","grace","emily","hazel"};
        List <String>list = new ArrayList<>();

        for(String w : str1){
            for(String k : str2){
                 if(w.equalsIgnoreCase(k)){
                     list.add(w);
                 }
            }
        }
        System.out.println(list);




    }
}
