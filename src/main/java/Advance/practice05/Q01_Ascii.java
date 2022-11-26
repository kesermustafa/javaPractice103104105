package Advance.practice05;

import java.util.Scanner;

public class Q01_Ascii {
    public static void main(String[] args) {


        //Kullanıcıdan aldığınız iki karakterin arasında bulunan tüm karakterleri yazdıran bir kod yazınız.

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen iki karakter giriniz..");
        char ch1 = input.next().charAt(0);
        char ch2 = input.next().charAt(0);

        int ilk = Math.min(ch1, ch2);
        int ikinci = Math.max(ch1, ch2);

        for (int i =ilk; i<=ikinci; i++){

            System.out.print((char) i);

        }




    }
}
