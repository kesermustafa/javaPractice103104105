package day07stringmanipulations;

import java.util.Scanner;

public class C01_StringManipulationsConcat {
    public static void main(String[] args) {

 /*    ONEMLI NOT=JAVA YUKARIDAN ASAGI ; SOLDAN SAGA CALISIR.
     */
            System.out.println(15 + 20 + "Merhaba");  /// 35Merhaba
            System.out.println("Merhaba" + 15 + 20);  //Merhaba1520
            System.out.println("Merhaba" + (15 + 20)); //Merhaba35
            System.out.println("Merhaba" + 15 * 20);  // Merhaba300

            //Kullanicidan ismini ve soyisimi girmesini isteyin, sonrasinda konsola kullanici nasil girerse girsin
            //tam isminin buyuk harfle yazilmasini saglayin.

        Scanner input = new Scanner(System.in);
        System.out.println("isminizi girin");
        String ad = input.next().toUpperCase();
        System.out.println("Soyadinizi giriniz..");
        String Soyadi = input.next().toUpperCase();

        System.out.println(ad.concat(" " + Soyadi));

    }
}
