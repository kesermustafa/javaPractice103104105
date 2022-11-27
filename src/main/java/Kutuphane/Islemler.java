package Kutuphane;

import java.util.*;

public class Islemler {

    /*
     * * 1-kitap ekle		 * 2-numara ile kitap goruntule		 * 3-bilgi ile kitap goruntule
     * * 4-numara ile kitap sil	* 5-tum kitaplari listele		 * 6-cikis
     *
     */

    static Scanner input = new Scanner(System.in);

    public static void menu() {
        System.out.println("Lutfen yapmak istediginiz islemi secinz.\n1= Kitap ekle\n2= Numara ile kitap goruntule\n3= bilgi ile kitap goruntule\n" +
                "4= Numara ile kitap sil\n5= Tum kitaplari listele\n6= Cikis");

        int secim = input.nextInt();

        switch (secim) {
            case 1:
                KitapEkle.kitapEkle();
                menu();
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
                for (Map.Entry<Integer, Kitap> w : KitapEkle.kitap.entrySet()) {
                    System.out.println(w);
                }
                menu();
            case 6:
                System.out.println("Tesekkur ederiz...");
                break;
            default:
                System.out.println("Gecersz secim yaptiniz..");
        }
    }


    public static void bilgiIleBul() {
        input.nextLine();
        System.out.println("Kitab ismini veya yazar adini giriniz...");
        String name = input.nextLine();

        Collection<Kitap> bilgi = KitapEkle.kitap.values();

             for (Kitap w : bilgi) {
                if (w.yazarAdi.equalsIgnoreCase(name) || w.kitapAdi.equalsIgnoreCase(name)) {
                    System.out.println(w);
                }
            }
        }

    public static void noIleGoruntule() {
        System.out.println("Kitap no giriniz...");
        int num = input.nextInt();

        if (KitapEkle.kitap.containsKey(num)) {
            System.out.println(num + " nolu " + KitapEkle.kitap.get(num));

        } else {
            System.out.println(num + " nolu kitap bulunmamaktadir.");
        }
    }

    public static void kitapSil() {

        System.out.println("Silmek istediginiz kitap no giriniz...");
        int num = input.nextInt();

        if (KitapEkle.kitap.containsKey(num)) {
            KitapEkle.kitap.remove(num);
        } else {
            System.out.println(num + "nolu kitap bulunmamaktadir.");
        }

    }








}

