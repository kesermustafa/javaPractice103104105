package Advance.practice05;

import java.util.Scanner;

public class Q02_NestedFor_Ucgen {
    /*
Kullanıcıdan aldığınız satır sayısına göre aşağıdaki şekli yazdıran bir kod yazınız.

               *
              * *
             * * *
            * * * *
           * * * * *
 */

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Satir sayisini giriniz");
        int satir = input.nextInt();


        for(int i = 0; i<satir; i++) {

            for (int bosluk = satir - i; bosluk > 1; bosluk--) {
                System.out.print(" ");
            }
            for (int yildiz = 0; yildiz <= i; yildiz++) {

                System.out.print("* ");
            }
            System.out.println();

            }

        System.out.println("--------------");

        for (int i = 1; i <= satir; i++) {         // satirlar icin loop

            for (int k = satir; k > i; k--) {      // Spaceler icin loop
                System.out.print(" ");
            }

            for (int m = 0; m < i; m++) {      // * lar icin loop
                System.out.print("# ");
            }
            System.out.println();
        }




    }

}
