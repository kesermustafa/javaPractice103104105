package day07stringmanipulations;

public class C02_StringManipulationsReplace {
    public static void main(String[] args) {

         /*replace()
  Metin icerisindeki karakter ya da karakterlerin, istenilen karakter ya da metinle degistirilmesini saglar.
  Sonuc String'dir..
      */

       /* Regular Expression(regex) : Belli turdeki characterleri secebilmemize yarar.
        1)  \\d     ==> tum rakamlar
            \\D     ==> tum rakam disi character ler
        2)  \\w     ==> A->Z     a->z         0->9    _tum buyuk, kucuk harf ve rakamlar
            \\W     ==> A->Z    a->z         0->9    _ disindaki hersey
        3)  \\s     ==> space tum bosluklar
            \\S     ==> space disindaki hersey  */



            //rakam haricindekileri silin


            // Verilen cumleyi  * ile gizleyin, 10 karakterden sonrasini yazdirin



            //a harfini @ isareti ile degistir
            String ders="olaganustu";
        System.out.println();




            /** ReplaceFirst
             * Replace ile aynı sadece ilk bulunan karakteri değiştirir
             */
            String txt = "Merhaba Dunya";

            //txt'deki butun 'a' lari 'e' ile degistirin
        System.out.println(txt.replace("a", "e" ));


            //txt'deki ilk bulunan 'a' yi 'e' ile degistirin
        System.out.println(txt.replaceFirst("a", "e"));


     /* replaceAll()
       Metin icerisindeki bir dizi kumesini degistirme .Sonuc String'dir..

      */
            //bir dizi kumesini degistirme>>>> Kalem yerine biber yazdirin
            String str="Dolma Kalem";

        System.out.println(str.replaceAll("Kalem", "Biber"));


          /*
       contains()
       Metin icerisinde arama yapmamizi saglar.
       bir stringin içerisinde karakter(ler)in var olup olmadığını kontrol eder.
       Sonuc boolean dir.

       equals()
       2 String metnin birbirine esit olup olmadigina bakar. büyük küçük harf farkı vardır. Sonuc boolean dir.

       equalsIgnorecase()
       equals() ile ayni islevi gorur, tek farki buyuk kucuk harfe duyarliligi yoktur. Sonuc boolean dir.
      */

            String str3 = "Merhaba";
            String st = "Merhaba";

        boolean birebieesitMi = str3.equals("Merhaba");
        System.out.println("birebieesitMi = " + birebieesitMi);
        System.out.println(str3.equals(st));
        System.out.println(str3.equals("merhaba"));
        System.out.println(str3.equalsIgnoreCase("mErHAba"));



    }
}
