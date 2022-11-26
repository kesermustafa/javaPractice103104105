package Advance.practice07;

import java.util.Scanner;

public class Q03_AtbashCode {
    /*
      Kullanıcıdan aldığınız bir metni 'Atbash Code' yöntemi ile şifreleyen bir kod yazınız.
      Ortadoğuda kullanılan en eski şifreleme biçimlerinden biridir.
      Arami alfabesinin tersten yazılması ile oluşturulan bir kodlayıcıya sahiptir.
      Örn: A-->Z, B-->Y ...
      "abcdefghijklmnopqrstuvwxyz";
      "zyxwvutsrqponmlkjihgfedcba";
     */



    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Bir kelime giriniz...");
        String str3 = input.nextLine().toLowerCase();

        String str1 = "abcdefghijklmnopqrstuvwxyz ";
        String str2 = "zyxwvutsrqponmlkjihgfedcba.";

        // 1.YOL
        for(int i =0; i<str3.length(); i++){
            for(int j = 0; j<str1.length(); j++){
                if(str3.charAt(i)==str1.charAt(j)){
                    System.out.print(str2.charAt(j));
                }
            }
        }
        System.out.println();


        // 2.yol

        for(int i = 0; i<str3.length(); i++){

            System.out.print((char) ('a'+('z'-str3.charAt(i))));

        }









    }

}
