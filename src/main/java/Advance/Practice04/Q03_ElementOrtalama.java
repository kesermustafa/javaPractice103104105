package Advance.Practice04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q03_ElementOrtalama {
    //Elemetlerin ortalamasından büyük elementleri yazdıran bir kod yazınız.


    public static void main(String[] args) {

        int list[] = { 5, 9, 15, 1, 0, 11, 3, 7, 12};

        System.out.println(Arrays.toString(list));

        int toplam = 0;


        for (int w : list ) {

            toplam += w;
        }
        double ortalama = toplam/list.length;
        System.out.println(ortalama);
        for (int w : list ){

            if(w>ortalama){
                System.out.print(w + ", ");
            }

        }





    }
}
