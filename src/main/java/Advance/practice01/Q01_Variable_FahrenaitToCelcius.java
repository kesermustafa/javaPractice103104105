package Advance.practice01;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Q01_Variable_FahrenaitToCelcius {
    public static void main(String[] args) {

        //Fahrenheit degeri Celsius degere ceviren odu yazin
        //  formul c = (f-32)*5/9

        Scanner input = new Scanner(System.in);
        System.out.println("Fahrenheit degeri girirniz..");

        double fahrenheit = input.nextDouble();

        double sonuc =  (fahrenheit-32)*5/9;

        System.out.println(sonuc);

        NumberFormat numberFormat = new DecimalFormat(".##");

        String decimalSonuc = numberFormat.format(sonuc);  // String deger olarak alir..

        double doubleSonuc = Double.valueOf(decimalSonuc);  // double degere tekrar donusturduk..
                                                            // Matematik islemi yapabilmek icin donusturduk.
        System.out.println(decimalSonuc);
        System.out.println(doubleSonuc);






    }
}
