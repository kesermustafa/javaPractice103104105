package Advance.Practice04;

import java.util.Scanner;

public class Q01_Swich_Aygunleri {
    public static void main(String[] args) {

         /*

        Girilen yil ve ay numarasına göre ayin kaç gün olduğunu yazdiran bir kod yazınız.
            Girdi yıl: 2000 ay: 2
            Çıktı: 29

        */
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir yil  giriniz..");
        int yil = input.nextInt();
        System.out.println("Lutfen bir ay numarasi giriniz..");
        int ay = input.nextInt();

        int gun = 0;

        switch (ay){

            case 1: case 3: case 5: case 7: case 8: case 10 : case 12:
                gun = 31;
                System.out.println(ay + ". ay =  " + gun  );
                break;
            case  2 :
                String artikMi = yil%100==0 ? (yil%400==0 ? "Artik yil" : "Artik Yil Degil") : yil%4==0 ? "Artik yil" : "Artik Yil Degil";
                if(artikMi.equals("Artik yil")){
                    gun = 29;
                    System.out.println(ay + ".ay  "+ gun );
                }else{
                    gun = 28;
                    System.out.println(ay + ".ay  "+ gun );
                }
                break;

            case 4: case 6: case 9: case 11:
                gun = 30;
                System.out.println(ay + ". ay =  " + gun  );
                break;

            default:
                System.out.println("Gecerli yil giriniz...");

        }










    }
}
