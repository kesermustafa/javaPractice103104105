package depoProje;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UrunTanimla {

   static List<Urunler> urun = new ArrayList<>();
   static List<ArrayList<Urunler>> urunlerList = new ArrayList<>();

          public static void urunTanimla(){

            Scanner input = new Scanner(System.in);
            System.out.println("Urun cinsini giriniz..");

            String cins = input.nextLine();
            System.out.println("Uretici firma bilgisini giriniz..");
            String uretici = input.nextLine();
            System.out.println("Urun miktarini giriniz..");
            String miktar = input.nextLine();
            System.out.println("Urun birimini giriniz..");
            String birim = input.nextLine();

            Urunler urunBilgi = new Urunler(cins, uretici, miktar, birim);

            urunlerList.add(new ArrayList<>());
            urunlerList.get(urunlerList.size()-1).add(urunBilgi);


            System.out.println("1= Devam \t2= Ana Sayfa");
                int sec = input.nextInt();
            if(sec==1){
                urunTanimla();
            }else{
                Methods.menu();
            }
        }





}
