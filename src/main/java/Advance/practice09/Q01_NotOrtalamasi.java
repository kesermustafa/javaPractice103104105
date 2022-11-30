package Advance.practice09;

public class Q01_NotOrtalamasi {

//	4 öğrencinin not ortalamasını sırasıyla 6, 4, 3 ve 5 sınav olacak şekilde hesaplayan
//	bir method yazınız.

    public static void main(String[] args) {



        ortalamaHesapla("Beyza", 96,94,83,95,93.4, 97.8);
        ortalamaHesapla("Ayse", 89,99,87,97,93,96);



    }

    public static void ortalamaHesapla(String isim, double... not){

        double toplam = 0;
        for(double w : not){
            toplam+=w;
        }
        System.out.println(isim + "'nin not ortalamasi : " + String.format("%.2f",toplam/not.length));

    }





}
