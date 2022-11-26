package stidentprictece;

import java.util.Scanner;

public class KaloriHesaplama {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lunfen cinsiyetinizi giriniz..\nErkek = E\nKadin = K");
        char cinsiyet = input.next().toUpperCase().charAt(0);
        System.out.println("Lutfen yasinizi giriniz");
        int yas = input.nextInt();
        System.out.println("Lutfen kilonuzu giriniz..");
        double kilo = input.nextDouble();
        System.out.println("Lutfen boyunuzu giriniz,Ornek 175 cm");
        double boyCm = input.nextDouble();
        double boyM = boyCm/100;


        double bBMISonuc = bMIHesap(kilo, boyM);

        if(bBMISonuc<18.5){
            System.out.println("Zyifsiniz.");
        }else if(bBMISonuc<25){
            System.out.println("Normalsiniz.");
        }else if(bBMISonuc<30) {
            System.out.println("kilolusunuz.");
        }else if(bBMISonuc<35) {
            System.out.println("Obez.");
        }else if(bBMISonuc<40) {
            System.out.println("Ileriderece Obez.");
        }else if(bBMISonuc>=40) {
            System.out.println("Hastalik derecede Obez.");
        }


        System.out.println("Lutfen hareket ve aktiviteseviyesini giriniz.\n 1 - Masa basa az/hareketsiz\n2 - Az aktf haftada bir iki egzersiz.\n" +
                "3- orta aktif haftada uc/bes egzersiz\n4- Cok aktf haftada yedisekiz egzersiz\n 5-Agur is / Agir egzersiz..");

        int hareket = input.nextInt();

        double hrkDeger = 0;
        switch (hareket){
            case 1 : hrkDeger =1.2;
            break;
            case 2 : hrkDeger =1.3;
                break;
            case 3 : hrkDeger =1.55;
                break;
            case 4 : hrkDeger =1.7;
                break;
            case 5 : hrkDeger =1.9;
                break;
            default:
                System.out.println("Gecerli bir veri giriniz.");
        }

        double bMHiziKadin = bMHiiKadin(kilo, boyCm, yas);
        double bMHiziErkek = bMHiiErkek(kilo, boyCm, yas);

        double erkekEnerji = bMHiziErkek * hrkDeger;  // BMI 25'den kucu olanlar icin
        double bMIErkA = bMHiziErkek * hrkDeger - 500;
        double bMIErkB = bMHiziErkek * hrkDeger - 750;

        double kadinEnerji = bMHiziKadin * hrkDeger; // BMI 25'den kucu olanlar icin
        double bMIKdnA = bMHiziKadin * hrkDeger -500;
        double bMIKdnB = bMHiziKadin * hrkDeger -750;

            if( cinsiyet == 'E'){
                System.out.println(" Baza etabolizma hizi = " + bMHiziErkek);

                if(bBMISonuc<25){
                    System.out.println( "Gunluk kalori miktari = " + erkekEnerji);
                }else {
                    if( (bMIErkA<bMHiziErkek) && (bMIErkB<bMHiziErkek) ){
                        System.out.println("Gunluk kalori miktari " + bMHiziErkek);
                    }else if((bMIErkA>bMHiziErkek)&&(bMIErkB>bMHiziErkek)  ){
                        System.out.println("Gunluk kalori miktari : " + bMIErkA + " ile " + bMIErkB);
                    }else if((bMIErkB<bMHiziErkek) && (bMIErkA>bMHiziErkek)){
                        System.out.println("Gunluk kalori miktari = " + bMHiziErkek + " ile " + bMIErkA);
                    }
                }
        }

    }





   public static double bMIHesap(double a, double b){
        return a/(b*b);
    }

   public static double bMHiiKadin( double kilo, double boyCm, int yas){
        return ((10*kilo)+(6.25*boyCm)-(5*yas))-161;

   }

    public static double bMHiiErkek( double kilo, double boyCm, int yas){
        return ((10*kilo)+(6.25*boyCm)-(5*yas))+5;

    }

}
