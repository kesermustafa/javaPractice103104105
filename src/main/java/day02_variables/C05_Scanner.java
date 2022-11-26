package day02_variables;

import java.util.Scanner;

public class C05_Scanner {

    public static void main(String[] args) {

        //  Soru 3) Kullanicidan alacaginiz 5 basamakli sayinin
        //  ilk 2 ve son 2 basamagindaki rakamlarin toplamini bulunuz

        //         *   input  : 12345==>1+2+4+5=12
        //         *   output : 12


        Scanner scan = new Scanner(System.in);
        System.out.println("5 basamakli sayi girirniz");
        int s = scan.nextInt();

        int s1 = s%10;
        int s2 = (s/10)%10;
        int s3 = (s/100)%10;
        int s4 = (s/1000)%10;
        int s5 = (s/10000);

        int toplam = s1+s2+s4+s5;

        System.out.println("Girilen sayinin ilk 2 rakamlari ile som 2 rakamlari toplami ; " + toplam);



//        System.out.println("Birler basamagi = " + s1);
//        System.out.println("Onlar basamagi = " + s2);
//        System.out.println("yuzler basamagi = " + s3);
//        System.out.println("Binler basamagi = " + s4);
//        System.out.println("Onbinler basamagi = " + s5);






    }
}
