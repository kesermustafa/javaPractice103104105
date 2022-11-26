package day04_ifStatement;

import java.util.EventListener;
import java.util.Scanner;

public class C01_IfStatement {
    public static void main(String[] args) {

        /*
         * Kullanicidan Y/N ikilisinden birisini girdiginde girdigi degeri
         * ekrana yazdiran java kodunu yaziniz.
         *
         * INPUT  ==>  OUTPUT
         *  Y     ==>   YES ;
         *  N     ==>   NO
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Y veya N harfi girin");
        char harf = input.next().charAt(0);

        if(harf == 'Y' || harf == 'y'){
            System.out.println("YES");
        }else if(harf == 'N' || harf == 'n'){
            System.out.println("NO");
        }else {
            System.out.println(" Lutfen Y/y veya N/n giriniz.");
        }











    }


}
