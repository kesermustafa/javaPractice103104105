package day07stringmanipulations;

public class C09_StringManipulations {
    public static void main(String[] args) {

        /*
       Bir password'un gecerli olup olmadigini asagidaki kurallara gore kontrol eden kodu yaziniz.
                   i)En az 8 character icermeli
                   ii)Space characteri icermemeli
                   iii)Buyuk harf icermemeli
                   iv)Son characteri "." olmali

        */

        String psw = "apbASscd1234.";

        boolean space = psw.contains(" ");
        boolean krkUzunlugu = psw.length()>7;
        boolean bykHarf = psw.replaceAll("[^A-Z]", "").length()>0;
        boolean sonKrk = psw.endsWith(".");

        boolean sonuc = krkUzunlugu && sonKrk && !bykHarf && !space;

        if(sonuc){
            System.out.println("Gecerli parola");
        }else
            System.out.println("Gecersiz parola");






    }
}
