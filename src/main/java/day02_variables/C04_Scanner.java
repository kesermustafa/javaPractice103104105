package day02_variables;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {

//        Scanner scan = new Scanner(System.in);
//        System.out.println("4 basamakli sayi girirniz");
//        int s = scan.nextInt();
//
//        int s1 = ((s%10) +  (s/1000));
//        System.out.println("Ilk rakam ile son rakam toplami = " + s1);



        Scanner scan = new Scanner(System.in);
        System.out.println("3 basamakli sayi girirniz");
        int s = scan.nextInt();

        int s1 = s%10;
        int s2 = (s/10)%10;
        int s3 = (s/100);


        System.out.println("Birler basamagi = " + s1);
        System.out.println("Onlar basamagi = " + s2);
        System.out.println("yuzler basamagi = " + s3);








    }
}
