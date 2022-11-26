package day06_nestedifstatement;

import java.util.Scanner;

public class C01_Ternary {
    public static void main(String[] args) {

            /*
            TASK :
             Kullanıcıdan sifirdan buyuk pozitif bir tamsayı girmesini isteyin.
             Girilen pozitif tamsayı 3 basamaklı ise ekrana "3 Basamaklı" yazdırın.
             3 basamaklı degilse çift olup olmadigini kontrol edin.
             Çift ise "3 basamaklı olmayan çift sayı" yazdırın.
             Çift sayı degilse "3 basamaklı olmayan tek sayı yazdırın."
             */

        Scanner input = new Scanner(System.in);
        System.out.println("Bir sifirdan buyuk tam sayi girirniz...");
        int sayi = input.nextInt();

        String sonuc = sayi>99 && sayi<1000 ? "Ucbasamakli" : (sayi%2==0 ? ("3 basamaklı olmayan çift sayı") : ("3 basamaklı olmayan tek sayı "));

        System.out.println(sonuc);


        if (sayi>0) {

            if(sayi>99 && sayi<1000 ){
                System.out.println("Ucbasamakli");
            }else if(sayi%2==0){
                System.out.println("3 basamaklı olmayan çift sayı");
            }else
                System.out.println("3 basamaklı olmayan tek sayı");

        }else {
            System.out.println("0 dan buyuk tam sayi giriniz...");
        }

    }
}
