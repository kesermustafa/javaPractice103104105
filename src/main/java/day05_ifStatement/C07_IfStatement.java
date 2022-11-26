package day05_ifStatement;

import java.util.Scanner;

public class C07_IfStatement {
    public static void main(String[] args) {

        //Kullanicidan dortgenin kenar uzunluklarini isteyin
        //ve dortgenin kare olup  olmadigini yazdirin

        Scanner input = new Scanner(System.in);
        System.out.println("1.Kenar uzulugunu giriniz...");
        double sayi1 = input.nextDouble();
        System.out.println("2.Kenar uzulugunu giriniz...");
        double sayi2 = input.nextDouble();
        System.out.println("3.Kenar uzulugunu giriniz...");
        double sayi3 = input.nextDouble();
        System.out.println("4.Kenar uzulugunu giriniz...");
        double sayi4 = input.nextDouble();

        if(sayi1==sayi2 && sayi2==sayi3 && sayi3==sayi4 && sayi1==sayi4){
            System.out.println("Kare");
        }else{
            System.out.println("Kare degildir");
        }






    }

}
