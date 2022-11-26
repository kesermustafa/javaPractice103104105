package Advance.Practice04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q02_EkleCikar {

            /*
        Kullanıcdan aldığınız bir sayıyı bir list'e ekleyen,
        list'ten çıkaran yada mevcut bir elementi o sayı ile güncelleyen bir kod yazınız.
         */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        List<Integer> list = new ArrayList<>();


        while (true){
            System.out.println("Ekleme yapmak icin 'add'\nGuncelleme icin 'update'\nSilmek icin 'delete'\n" +
                    "Cikmak icin 'quit' komutu yazin");

            System.out.println(list);
            String option = input.next();

            if(option.equalsIgnoreCase("add")){
                System.out.println("Eklemek istediginiz sayi giriniz..");
                int eklenecekSayi = input.nextInt();
                list.add(eklenecekSayi);
            }else if (option.equalsIgnoreCase("update")){
                System.out.println("Update etmek istediginiz elementi giriniz..");
                int updateSayi = input.nextInt();
                System.out.println("Girmek istediginiz yeni sayiyi giriniz..");
                int yeniSayi = input.nextInt();
                list.set(list.indexOf(updateSayi), yeniSayi);
            }else if(option.equalsIgnoreCase("delete")){
                System.out.println("Silmek istediginiz elementi giriniz.");
                int silinecekSayi = input.nextInt();
                list.remove((Integer) silinecekSayi);
            }else if(option.equalsIgnoreCase("quit")){
                break;
            }else {
                System.out.println("Gcerli bir komut giriniz...");
            }
        }

        System.out.println("Gule gule");





    }
}
