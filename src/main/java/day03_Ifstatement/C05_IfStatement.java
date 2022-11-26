package day03_Ifstatement;

import java.util.Scanner;

public class C05_IfStatement {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen \n toplama islemi icin 1 \n cikarma islemi icin 2 \n bolme islemi icin 3 \n carpma islemi icin 4 \n girirniz");
        byte islem = input.nextByte();


        if (islem>0 && islem<5 ) {

            System.out.println("iki sayi giriniz");
            double s1 = input.nextDouble();
            double s2 = input.nextDouble();

            if (islem == 1) {
                System.out.println("Toplama sonucu ; " + (s1 + s2));
            }
            if (islem == 2) {
                System.out.println("Cikartma soucu : " + (s1 - s2));
            }
            if (islem == 3) {
                System.out.println("Bolme sonucu : " + (s1 / s2));
            }
            if (islem == 4) {
                System.out.println("Carpma sonucu : " + (s1 * s2));
            }
        } else {
            System.out.println("Gecerli iki sayi girirniz...");
        }

//
//        if (islem == 1) {
//            System.out.println("Sonuc : " + (s1 + s2));
//        } else if (islem == 2) {
//            System.out.println("Sonuc : " + (s1 - s2));
//        } else if (islem == 3) {
//            System.out.println("Sonuc : " + (s1 / s2));
//        } else if (islem == 4){
//            System.out.println("Sonuc : " + (s1 * s2));
//        }else
//            System.out.println("Gecerciz secim yaptiniz...");


    }
}
