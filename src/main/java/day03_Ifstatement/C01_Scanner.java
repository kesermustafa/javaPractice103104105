package day03_Ifstatement;

import java.util.Scanner;

public class C01_Scanner {
    public static void main(String[] args) {

         /*  Problem Tanımı
       Bir işçinin işi bitirme süresini ve toplam işçi sayısını alarak, işin bitme süresini
       hesaplayan kodu yazınız.
       Örneğin, Bir işçi bir işi 10 günde yapabilmektedir.
       Buna göre 2 işçi aynı işi kaç günde yapar?
       Örnek Ekran Çıktısı
        Bir işçi işi kaç günde bitirmektedir? 10
        Toplam kaç işçi çalışacak? 2
       İşin bitme süresi 5 gündür.
   */
        Scanner input = new Scanner(System.in);
        System.out.println("Isin tolam bitirilme suresini giriniz....");
        System.out.println("Bir iscinin 1 gune bitircsgi sureyi giriniz....");
        System.out.println("Calisacak isci sayisini girin");

        int sure = input.nextInt();
        int isciGunlukIs = input.nextInt();
        int isciSayisi = input.nextInt();


        double bitisSuresi = (sure/(isciGunlukIs/isciSayisi));

        System.out.println("sure = " + bitisSuresi);











    }


}
