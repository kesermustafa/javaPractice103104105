package Advance.practice05;

public class Q03_HacimHesaplama {

    public static void main(String[] args) {

    //Küp, kare prizma ve dikdörtgen prizmanın hacmini hesaplayan bir method oluşturunuz.
        // (Method overloading kullanınız)

        Methodlar hesapla = new Methodlar();

        int karePrizma = hesapla.hacimHesapla(5, 6);
        int dikdortgenPrizma = hesapla.hacimHesapla(5, 6, 1);

        System.out.println("dikdortgenPrizma = " + dikdortgenPrizma);
        System.out.println("karaPrizma = " + karePrizma);


    }
}
