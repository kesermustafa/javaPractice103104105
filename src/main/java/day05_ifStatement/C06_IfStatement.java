package day05_ifStatement;

import java.util.Scanner;

public class C06_IfStatement {
    public static void main(String[] args) {

        //Kullanıcıdan 4 basamakli bir sayi girmesini isteyin.
        // Girdiği sayi 5’e  bölünüyorsa son rakamını kontrol edin.
        // Son rakamı 0 ise ekrana "5’e bölünen çift sayı" yazdırın.
        // Son rakamı 0 değil ise "5’e bölünen tek sayı" yazdırın.
        // Girdiği password 5’e bölünmüyorsa ekrana "Tekrar deneyin" yazdırın.

        Scanner input = new Scanner(System.in);
        System.out.println("4 basamakli pozitif tam sayi giriniz...");
        int sayi = input.nextInt();

        if (sayi > 999 && sayi < 10000) {
            if (sayi % 5 == 0) {
                if (sayi % 2 == 0) {
                    System.out.println("5'e bolunuen cift sayi...");
                } else {
                    System.out.println("5'e bolunen tek sayi...");
                }
            } else {
                System.out.println("Tekrar deneyin...");
            }
        } else {
            System.out.println("Lutfen dort basamakli sayi giriniz...");
        }





    }




}
