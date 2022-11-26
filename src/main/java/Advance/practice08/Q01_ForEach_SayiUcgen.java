package Advance.practice08;

import java.util.Scanner;

public class Q01_ForEach_SayiUcgen {

    public static void main(String[] args) {


/*
             Alttaki şekli veren bir kod yazınız:
                  1 2 3 4 5 6
                   2 3 4 5 6
                    3 4 5 6
                     4 5 6
                      5 6
                       6
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen satir sayisini giriniz..");
        int satir = input.nextInt();

        for(int i=1; i<=satir; i++){

            for(int bosluk=1; bosluk<i; bosluk++){
                System.out.print(" ");
            }
            for(int sayi = i; sayi<=satir; sayi++ ){
                System.out.print(sayi + " ");
            }
            System.out.println();
        }



//       for (int i = 0; i < satir; i++){
//         int c = 1;
//
//         for (int e = 0; e < satir - i; e++) {
//              System.out.print("   ");
//         }
//         for (int x = 0; x <= i; x++)  {
//
//
//              System.out.print("    {0} ", c);
//             c = c * (i - x) / (x + 1);
//         }
//          System.out.println();
//     }










    }
}
