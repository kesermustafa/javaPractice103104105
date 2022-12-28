package Advance.practice07;

import java.util.Scanner;

public class Q06_Encapsulation_BMI {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen kilonuzu kg cinsinden giriniz...");
        double kilo = input.nextDouble();
        System.out.println("Lutfen boyunuzu metre cinsinden giriniz...");
        double boy = input.nextDouble();

        BMI kisi1 = new BMI(kilo, boy);
        kisi1.bMIHesapla();







    }






}
