package Advance.practice01;

import java.util.Scanner;

public class Q04_IfStatement_DikUcgen {
    public static void main(String[] args) {

       /* Kullanıcıdan üç adet sayı alarak bu sayıların
        bir dik üçgenin kenar uzunlukları olup olmadığını hesaplayan bir kod yazınız.
        (Yardım: Bir üçgenin dik olduğunu anlamak için a2+b2=c2 pisagor
        bağlantısından yararlanabilirsiniz)

        Örnek Ekran Çıktısı:
        birinci kenarı giriniz: 3
        ikinci kenarı giriniz 4
        üçüncü kenarı giriniz: 5
        Bu bir dik üçgendir

        birinci kenarı giriniz: 2
        ikinci kenarı giriniz 15
        üçüncü kenarı giriniz: 7
        Bu bir dik üçgen değildir.
        */

        Scanner input = new Scanner(System.in);
        System.out.println("Ucginin 1.kenar uzunlugunu giriniz.");
        int k1 = input.nextInt();
        System.out.println("Ucginin 2.kenar uzunlugunu giriniz.");
        int k2 = input.nextInt();
        System.out.println("Ucginin 3.kenar uzunlugunu giriniz.");
        int k3 = input.nextInt();

        if(k1*k1+k2*k2==k3*k3){
            System.out.println("Bu bir dik ucgendir");
        }else if(k1*k1+k3*k3==k2*k2){
            System.out.println("Bu bir dik ucgendir");
        }else if (k3*k3+k2*k2==k1*k1){
            System.out.println("Bu bir dik ucgendir");
        }else {
            System.out.println("Bu bir dik ucgen degildir");
        }








    }
}
