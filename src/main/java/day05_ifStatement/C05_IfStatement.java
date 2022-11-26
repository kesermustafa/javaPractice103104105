package day05_ifStatement;

import java.util.Scanner;

public class C05_IfStatement {
    public static <object> void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("iki sayi girirniz....");
        double sayi1 = input.nextDouble();
        double sayi2 = input.nextDouble();

        if(sayi1<sayi2){
            System.out.println("Kucuk olan sayi : " + sayi1);
        }else if(sayi1>sayi2){
            System.out.println("Kucuk olan sayi : " + sayi2);
        }else{
            System.out.println("Sayilar birbirine esit");
        }

        Object sonuc = sayi1==sayi2 ? "sayilar esit" : sayi1 > sayi2 ? sayi2 : sayi1;
        System.out.println("sonuc = " + sonuc);






    }
}
