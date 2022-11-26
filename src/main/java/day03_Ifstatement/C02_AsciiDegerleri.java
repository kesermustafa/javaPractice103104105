package day03_Ifstatement;

public class C02_AsciiDegerleri {
    public static void main(String[] args) {

        char harf = 'a';
        char harf2 = 'A';

        System.out.println("harf>harf2 ==>" +(harf>harf2));
        //Karsilastirma islemlerini sonucu true veya false doner.
        //Buyuk harfleri ASCII degeri  kucuk harflerin ASCII degerinden kucuktur..

        //1- Herhangi bir char variable'in ASCII degerini kod yazarak bulun
        System.out.println('a'+0);
        // toplama islemine etkisi olmayan 0 secsriz bylece yazdirdigimiz deger karakterin ASCII degerini verir.

        char m = 'm';
        System.out.println(m+0);


        // 2.YOL'........
        // Java'da int variable'a char karakter atayabiliriz...
           // Cunku char karakterin ASCII degerini atamis oluruz...
        int harf3 = 'm';

        System.out.println("harf3 = " + harf3);


        byte b1 = 12;
        byte b2 = 125;

        System.out.println(b1>b2);


        float f1 = 2.45645F;
        float f2 = 5.86786F;
        System.out.println("f1>f2 = "+(f1>f2));
        System.out.println("b1>f1 = "+(b1>f1));

        long l1 = 546578924L;
        System.out.println("b1<l1 = " + (b1<l1));

        char ch = 'h';
        System.out.println("b1>ch = " +(b1>ch));



    }
}
