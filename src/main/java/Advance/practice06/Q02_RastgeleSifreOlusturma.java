package Advance.practice06;

import java.util.Scanner;

public class Q02_RastgeleSifreOlusturma {

    //Kullanıcıdan aldığınız sayi kadar karakter uzunluğuna sahip rastgele şifre üreten bir kod yazınız.

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen karakter sayisini giriniz..");
        int karakterSayi = input.nextInt();

        String karakterler = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!#$%&*/:;?=+";
        String sifre = "";
        int maxIndeks = karakterler.length();
        int sayac = 0;

        while (sayac < karakterSayi){

            int rastgeleIndeks = (int)(Math.random()*maxIndeks);

            sifre += karakterler.charAt(rastgeleIndeks);

            sayac++;
        }

        System.out.println("Sifre "+ sifre);











    }
}
