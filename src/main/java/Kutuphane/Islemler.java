package Kutuphane;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Islemler {

   /*
    * * 1-kitap ekle		 * 2-numara ile kitap goruntule		 * 3-bilgi ile kitap goruntule
    * * 4-numara ile kitap sil	* 5-tum kitaplari listele		 * 6-cikis
*
    */

    static Scanner input = new Scanner(System.in);
    public static void menu (){
        System.out.println("Lutfen yapmak istediginiz islemi secinz.\n1= Kitap ekle\n2= Numara ile kitap goruntule\n3= bilgi ile kitap goruntule\n" +
                "4= Numara ile kitap sil\n5= Tum kitaplari listele\n6= Cikis");

        int secim = input.nextInt();

        switch (secim){

            case 1 :
                KitapEkle.kitapEkle();
                menu();
                break;
            case 2 :


            case 3 :

            case 4:

            case 5 :

            case 6 :

                for (Map.Entry<Integer, Kitap> w : KitapEkle.kitap.entrySet()){
                        System.out.println(w);
                 }
                break;

            default:
                System.out.println("Gecersz secim yaptiniz..");

        }





        }











}
