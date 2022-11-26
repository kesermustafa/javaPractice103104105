package day04_ifStatement;

import java.util.Scanner;

public class C03_IfStatement {

    public static void main(String[] args) {

        //Kullanicidan bir gun alin
        // eger gun “Cuma” ise ekrana “Muslumanlar icin kutsal  gun” yazdirin.
        // “Cumartesi” ise ekrana “Yahudiler icin kutsal gun” yazdirin.
        // “Pazar”  ise ekrana “Hiristiyanlar icin kutsal gun” yazdirin.

        // Stringlerde == neden kullanilmaz ... Cunku Java da iki taane memory var  Stack ve Heap
        // Stringlerde referans dgerin bakildigi icin == yerini equals kulanilir..

        Scanner scan = new Scanner(System.in);
        System.out.println("Haftanin bir gun ismi giriniz");

//        String day = scan.nextLine().toLowerCase();
//
//        if (day.equals("cuma")) {
//            System.out.println("Muslumanlar icin kutsal gun");
//        }
//        if (day.equals("cumartesi")) {
//            System.out.println("Yahudiler icin kutsal gun");
//        }
//        if (day.equals("pazar")) {
//            System.out.println("Hristiyanlar icin kutsal gun");
//        }
//        if (!day.equals("cuma") && !day.equals("cumartesi") && !day.equals("pazar")) {
//            System.out.println("Kutsal gun degil");
//        }

        //2.YOL ....

//        String gun = scan.next();
//        if (gun.equalsIgnoreCase("cuma")) {
//            System.out.println("Muslumanlar icin kutsal gun");
//        }
//        if (gun.equalsIgnoreCase("cumartesi")) {
//            System.out.println("Yahudiler icin kutsal gun");
//        }
//        if (gun.equalsIgnoreCase("pazar")) {
//            System.out.println("Hristiyanlar icin kutsal gun");
//        }
//        if (!gun.equalsIgnoreCase("cuma") &&
//            !gun.equalsIgnoreCase("cumartesi") &&
//            !gun.equalsIgnoreCase("pazar")) {
//            System.out.println("Kutsal gun degil");
//        }

        //3.YOL

        String gun = scan.next().toLowerCase();
        if (gun.equals("cuma")) {
            System.out.println("Muslumanlar icin kutsal gun");
        } else if (gun.equals("cumartesi")) {
            System.out.println("Yahudiler icin kutsal gun");
        } else if (gun.equals("pazar")) {
            System.out.println("Hristiyanlar icin kutsal gun");
        } else
            System.out.println("Kutsal gun degil");



    }
}
