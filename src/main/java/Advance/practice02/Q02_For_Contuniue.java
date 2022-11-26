package Advance.practice02;

import java.util.Scanner;

public class Q02_For_Contuniue {

    /* TASK :
        Kullanıcıdan 5 adet sayı isteyiniz
        Bu sayılardan 5 ile 10 arasındakiler hariç, diğerlerinin toplamını bulunuz.
        */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int toplam = 0;
        for(int i =0; i<5; i++){
            System.out.println("Bir sayi giriniz...");
            int num = input.nextInt();

            if(num>5 && num<10){
                System.out.println("Girdiginiz sayi 5 ile 10 arasind oldugundan isleme alinmayacaktir.");
                continue;
            }

            toplam += num;

        }

        System.out.println(toplam);






    }
}
