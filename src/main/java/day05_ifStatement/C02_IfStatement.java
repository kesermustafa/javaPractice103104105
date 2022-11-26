package day05_ifStatement;

import java.util.Scanner;

public class C02_IfStatement {
    public static void main(String[] args) {

// Kullanicidan yasini isteyin
// 65 veya daha buyukse emekli olabilirsin
// 65'den kucukse emekli olamazsin "? sene daha calisman lazim" yazdirin

        Scanner input = new Scanner(System.in);
        System.out.println("yasinizi girirniz....");
        byte yas = input.nextByte();

        if(yas>=65){
            System.out.println("Emekli olabilirsin");
        }else {
            System.out.println("emekli olamazsin");
            System.out.println( (65-yas) + " sene daha calisman lazim");
        }

        //Nested If-Else
        if(yas>0){
            if(yas>=65){
                System.out.println("Emekli olabilirsin");
            }else {
                System.out.println("emekli olamazsin");
                System.out.println( (65-yas) + " sene daha calisman lazim");
            }
        }else{
            System.out.println("Lutfen sifirdan buyuk bir sayi giriniz...");
        }




    }
}
