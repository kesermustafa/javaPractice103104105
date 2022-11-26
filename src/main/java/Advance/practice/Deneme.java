package Advance.practice;

public class Deneme {
    public static void main(String[] args) {

        String tamAd = " Ali Kas   ";
        String tamIsim = tamAd.trim();
        System.out.println(tamIsim);


        boolean ismimYok = tamIsim.isBlank();
        boolean bos = tamIsim.isEmpty();




        if (!ismimYok && !bos) {

            int boslukIndex = tamIsim.indexOf(" ");
            boolean adIlkHarfBuyuk = tamIsim.substring(0, 1).replaceAll("[^A-Z]", "").length()>0;
            boolean adDigerHarfler = tamIsim.substring(1, boslukIndex).equals(tamIsim.substring(1, boslukIndex).toLowerCase());
            boolean soyAdIlkHarf = tamIsim.substring(boslukIndex+1, boslukIndex+2).replaceAll("[^A-Z]", "").length()>0;
            boolean soyAdDigerHarfler = tamIsim.substring(boslukIndex+2).equals(tamIsim.substring(boslukIndex+2).toLowerCase());
            boolean hepBuyukHarfler = tamIsim.equals(tamIsim.toUpperCase());
            boolean hepKucukHarf = tamIsim.equals(tamIsim.toLowerCase());
            boolean harfVeBosHariciKrk = tamIsim.replaceAll("[A-Za-z ]", "").length()>0;

            if (boslukIndex == -1) {
                System.out.println("Ad veya soyadi eksik ");
            } else if (!adIlkHarfBuyuk && !soyAdIlkHarf) {
                System.out.println("Bas Harflerinde hata..");
            } else if (!adDigerHarfler || !soyAdDigerHarfler || hepBuyukHarfler || hepKucukHarf) {
                System.out.println("Format Hatasi");
            } else if (harfVeBosHariciKrk) {
                System.out.println("Gecersiz Ad");
            } else {
                System.out.println("Ad ve Soyad kaydedildi");
            }
        }else {
            System.out.println("Isim girilmedi");
        }



    }
}
