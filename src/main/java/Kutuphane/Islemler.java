package Kutuphane;

import java.util.*;

import static Kutuphane.KitapEkle.kitap;

public class Islemler {

    /*
     * * 1-kitap ekle		 * 2-numara ile kitap goruntule		 * 3-bilgi ile kitap goruntule
     * * 4-numara ile kitap sil	* 5-tum kitaplari listele		 * 6-cikis
     *
     */

    public static final String R = "\u001B[31m";
    public static final String G = "\u001B[32m";
    public static final String Y = "\u001B[33m";
    public static final String B = "\u001B[34m";

    static Scanner input = new Scanner(System.in);

    public static void menu() {
        System.out.println("Lutfen yapmak istediginiz islemi seciniz.\n1= Kitap ekle\n2= Numara ile kitap goruntule\n3= bilgi ile kitap goruntule\n" +
                "4= Numara ile kitap sil\n5= Tum kitaplari listele\n6= Cikis");

        int secim = input.nextInt();

        switch (secim) {
            case 1:
                KitapEkle.kitapEkle();
                break;
            case 2:
                noIleGoruntule();
                menu();
                break;
            case 3:
                bilgiIleBul();
                menu();
                break;
            case 4:
                kitapSil();
                menu();
                break;
            case 5:
                for (Map.Entry<Integer, Kitap> w : kitap.entrySet()) {
                    System.out.println(B+w);
                }
                menu();
                break;
            case 6:
                System.out.println("Tesekkur ederiz...");
                break;

            default:
                System.out.println("Gecersiz secim yaptiniz..");
        }
    }


    public static void bilgiIleBul() {
        input.nextLine();
        System.out.println("Kitab ismini veya yazar adini giriniz...");
        String name = input.nextLine();

             for(Map.Entry<Integer, Kitap> w : KitapEkle.kitap.entrySet()){

                 if (w.getValue().yazarAdi.equalsIgnoreCase(name)) {
                     System.out.println(w);

                 }else if(w.getValue().kitapAdi.equalsIgnoreCase(name)){
                     System.out.println(R+"-----------* Aradiginiz kitaba ait bilgiler * -------------");
                     System.out.println(w);
                 }else{

                 }
             }
    }

    public static void noIleGoruntule() {
        System.out.println("Kitap no giriniz...");
        int num = input.nextInt();

        if (kitap.containsKey(num)) {
            System.out.println(num + " " + kitap.get(num));

        } else {
            System.out.println(num + " nolu kitap bulunmamaktadir.");
        }
    }

    public static void kitapSil() {

        System.out.println("Silmek istediginiz kitap no giriniz...");
        int num = input.nextInt();

        if (kitap.containsKey(num)) {
            kitap.remove(num);
        } else {
            System.out.println(num + "nolu kitap bulunmamaktadir.");
        }

    }








}

