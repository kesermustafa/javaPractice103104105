package Advance.practice06;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Q05_Inheritance_HacimHesaplama {

        //Kare prizma, silindir ve koninin hacmini hesaplayan bir kod yazınız. (Inheritance kullanınız)

    public static void main(String[] args) {

        KarePrizma karePrizma = new KarePrizma();
        double karePirizmaHacmi = karePrizma.hacimHesapla(5,6);

        System.out.println("karePirizmaHacmi = " + karePirizmaHacmi);

        Koni koniHacim =new Koni();

        double koniHacimi = koniHacim.hacimHesapla(3,5);
        NumberFormat obj = new DecimalFormat(".00");
        System.out.println("koniHacimi = " + obj.format(koniHacimi) );

        Silindir silindir = new Silindir();
        double silindirHacmi = silindir.hacimHesapla(1,5);
        System.out.println("silindirHacmi = " +  obj.format(silindirHacmi));







    }

}
