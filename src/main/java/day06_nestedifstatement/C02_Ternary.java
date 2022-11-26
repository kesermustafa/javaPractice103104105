package day06_nestedifstatement;

import java.util.Scanner;

public class C02_Ternary {
    public static void main(String[] args) {

        /*
            Kullanicidan Final notunu 'A' ,'B' ,'C' seklinde  girmesini isteyiniz,
            'A'  ->  "Cok Basarili"
            'B'  ->  "Basarili"
            'C'  ->  "Orta"    bu notlar disindakilere de Digerleri..
                        yazdiriniz.Nested Ternary ile cozunuz
        */

        Scanner input = new Scanner(System.in);
        System.out.println("Final notunu 'A' ,'B' ,'C' seklinde  girirniz...");
        char ch = input.next().toUpperCase().charAt(0);

       String sonuc =  ch == 'A' ? "Cok Basarili" : ( ch == 'B' ?"Basarili" : ( ch == 'C' ? "Orta" : "Digerleri"));

       System.out.println(sonuc);

       if(ch == 'A' ){
           System.out.println("Cok Basarili");
       }else if(ch == 'B'){
           System.out.println("Basarili");
       }else if(ch == 'C'){
           System.out.println("Orta");
       }else {
           System.out.println("Digerleri");
       }





    }
}
