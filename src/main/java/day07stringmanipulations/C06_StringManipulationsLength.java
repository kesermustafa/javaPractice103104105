package day07stringmanipulations;

import java.util.Scanner;

public class C06_StringManipulationsLength {
    public static void main(String[] args) {

         /*
        Kullanicidan ad ve soyadii isteyin hangisinin daha uzunoldugunu yazdirin...
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen adinizi ve soyadinizi ayri ayri giriniz... ");
        String ad = scan.next();
        String soyad = scan.next();

        int a = ad.length();
        int b = soyad.length();

        String sonuc = a==b ? ("Isim ve soyisim esit") : (a>b ? "Isminiz daha uzun" : "Soyisminiz daha uzun");
        System.out.println(sonuc);





    }
}
