package day06_nestedifstatement;

import java.util.Scanner;

public class C04_SwitchCase {
    public static void main(String[] args) {

        // Kullanıcının yasadıgı güne  göre;
        // Kullanicinin verecegi gun kadar sonraki günun  hangi gün olduğunu yazdırınız.
        // pazartesi hafta başlangıcı
        // BulunanGun = (kacGunSonrasi + kacıncıGun) % 7;

        Scanner input = new Scanner(System.in);
        System.out.println("Bir gun numarasi girirniz... Pazartesi=1, Sali=2, Carsamba=3, Persembe=4, Cuma=5, Cumartesi=6, Pazar=7");
        int gunNo = input.nextInt();

        if (gunNo<1 || gunNo>7){
            System.out.println("Gecerli gun sayisi girin");
        }else {
            System.out.println("Hesaplamak istediginiz gun sayisini giriniz..");
            int sayi = input.nextInt();
            int s = (gunNo + sayi)%7;

            switch (s) {
                case 1:
                    System.out.println("Pazartesi");
                    break;
                case 2:
                    System.out.println("Sali");
                    break;
                case 3:
                    System.out.println("Carsamba");
                    break;
                case 4:
                    System.out.println("Persembe");
                    break;
                case 5:
                    System.out.println("Cuma");
                    break;
                case 6:
                    System.out.println("Cumartesi");
                    break;
                case 0:
                    System.out.println("Pazar");
                    break;
                default:

            }
        }




    }
}
