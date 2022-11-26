package day06_nestedifstatement;

import java.util.Scanner;

public class C03_SwitchCase {
    public static void main(String[] args) {

        /*
         DERS PROGRAMI
        Hangi gun hangi dersin oldugunu gosteren bir program yaziniz
        Pazartesi ve Sali ise: Java
        Persembe ve Cuma ise: Selenyum
        Carsamba ve Cumartesi ise: SQL
        aksi halde: izin gunu=Day Off
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Bir gun ismi girirniz...");
        String gun = input.next().toLowerCase();
        switch (gun) {
            case "pazartesi":
            case "sali":
                System.out.println("Java");
                break;
            case "persembe":
            case "cuma":
                System.out.println("Selenyum");
                break;
            case "carsamba":
            case "cumartesi":
                System.out.println("SQL");
                break;
            default:
                System.out.println("Day Off");
        }




    }
}
