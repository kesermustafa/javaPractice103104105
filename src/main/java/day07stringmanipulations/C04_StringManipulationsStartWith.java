package day07stringmanipulations;

public class C04_StringManipulationsStartWith {
    public static void main(String[] args) {

/*
 * startsWith()
 *  Metnin bas kisminin istenilen dizi ile eslesip eslesmedigini kontrol eder. Sonucu boolean dir.
 *
 * endsWith()
 * Metnin son kisminin istenilen dizi ile eslesip eslesmedigini kontrol eder. Sonucu boolean dir.
 */

        String cumle = "Kazananlar ve hic hata yapmayanlar degil, vazgecmeyenlerdir.";

        boolean kIle = cumle.startsWith("Ka");
        System.out.println("kIle = " + kIle);

        boolean bitiyorMu= cumle.endsWith("dir");
        System.out.println("bitiyorMu = " + bitiyorMu);







    }
}
