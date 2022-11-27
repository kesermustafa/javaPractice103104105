package Kutuphane ;

import java.util.HashMap;
import java.util.Scanner;

public class KitapEkle {


    /*
    3-kitap ekle diye bir method olusturmliyim, bu method farkli bir classda
    4-kullanicidn kitap adi yazar adi ve fiyat bilgileri istenmeli
    */


    static HashMap<Integer, Kitap> kitap = new HashMap<>();
    static Scanner input = new Scanner(System.in);

    public static void kitapEkle(){

        boolean sec = true;

        do {

            System.out.println("Eklemek istedginiz kitap ismini giriniz...");
            String kitapAd = input.nextLine();
            System.out.println("Yazar adi giriniz..");
            String yazarAd = input.nextLine();
            System.out.println("Kitap fiyatini giriniz..");
            double fiyat = input.nextDouble();
            input.nextLine();
            Kitap kitapEkle = new Kitap(kitapAd, yazarAd, fiyat);

            kitap.put(Kitap.kitapNo, kitapEkle);


            System.out.println("Ana menu icin 0 \tEkleme yapmak icin 1 girin");

            int sayi = input.nextInt();
            input.nextLine();
            if(sayi == 1){
                kitapEkle();
            }else if(sayi == 0){
                Islemler.menu();
                sec=false;
            }


        }while (sec);

    }







}
