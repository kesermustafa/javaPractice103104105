package Advance.practice01;

import java.util.Scanner;

public class Q02_SubstringAdSoyad {
    public static void main(String[] args) {

        /*
       Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız,
       ad ayrı soyad ayrı sekilde ekrana yazdırınız.
       Örn:
       Ad: Ali
       Soyad: Can
       */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen ad ve soyadinizi giriniz..");
        String adSoyad = input.nextLine();

        int space = adSoyad.indexOf(" ");

        String ad = adSoyad.substring(0, space);
        String soyad = adSoyad.substring(space+1);
        System.out.println(ad);
        System.out.println(soyad);





    }
}
