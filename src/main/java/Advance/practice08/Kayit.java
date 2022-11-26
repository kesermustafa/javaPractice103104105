package Advance.practice08;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kayit {
     /*
     Bu uygulama kulanıcıların bir ArrayListe kayıt zamanını da alarak ekleyen ve sonrasında her
     dakikanın ilk 10 saniyesinde kaydolanları şanslı kullanıcı olarak ekrana yazdıran bir uygulamadır.
     Bunun için;

     1- Bir Kayit class'i oluşturun fields:  kullaniciDate (LocalDateTime cinsinden)
     2- Kayit isminde olusturdugunuz class'da kayitol() isminde bir method ekleyerek Kullanıcıdan
     kullanici ismini alarak ArrayList'e ekleyin
     3- SansliKullanici class'i olusturun.Bu class'ta kendine verilen ArrayListteki kullanicilardan her
     dakikanın ilk 10  saniyesinde kaydolanları yazdıran sansliKullanici() isminde bir metod  ekleyiniz.
     */

    static List<String> kullanici = new ArrayList<>();
    static List<String> kayitZamani = new ArrayList<>();

    public static void kayitOl(){

        do {
            Scanner input = new Scanner(System.in);
            System.out.println("Kayit olmak icin lutfen isminizi giriniz\nCikmak icin Q girin");

            String name = input.nextLine();

            if(name.equalsIgnoreCase("Q") ){
                System.out.println("Kayitli  kuallanici  "+ kullanici);
                System.out.println("Kuallanici kayit zamani "+kayitZamani);
                break;
            }

            kullanici.add(name);

            LocalTime kayitDate = LocalTime.now();
            DateTimeFormatter dtf7 = DateTimeFormatter.ofPattern("hh:mm:ss");
            String formatedTime = dtf7.format(kayitDate);

            kayitZamani.add(formatedTime);

        }while (true);

    }

}
