package day05_ifStatement;

import java.util.Scanner;

public class C04_IfStatement {
    public static void main(String[] args) {

        //Kullanici 0'dan kucuk 120'den buyuk deger giremiyecek sekilde degerleri aldiktan sonra ;
        // Eger calisan kadinsa 60 yasindan buyuk oldugunda emekli olabilir,
        // calisan erkekse 65 yasindan buyukse emekli olabilir seklinde yazdiran bir kod yaziniz.

        Scanner input = new Scanner(System.in);
        System.out.println("Cinsiyetinizi yaziniz... \n Kadin = K \n Erkek = E");
        char cinsiyet = input.next().toUpperCase().charAt(0);

        if (cinsiyet=='K' || cinsiyet=='E') {
            System.out.println("yasinizi girirniz....");
            byte yas = input.nextByte();

            if (cinsiyet == 'K') {

                if (yas >= 60) {
                    System.out.println("Emekli olabilir...");
                } else {
                    System.out.println((60 - yas) + " sene daha calisman lazim");
                }
            }

            if (cinsiyet == 'E') {
                if (yas >= 65) {
                    System.out.println("Emekli olabilir...");
                } else {
                    System.out.println((65 - yas) + " sene daha calisman lazim");
                }
            }
        }else{
            System.out.println("Cinsiyet tanimli degil");
        }

    }
}
