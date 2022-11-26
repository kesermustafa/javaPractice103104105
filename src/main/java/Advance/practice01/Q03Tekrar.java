package Advance.practice01;

public class Q03Tekrar {
    public static void main(String[] args) {

        //Bir String değerin belirli bir sayıda belirli karakterleri içerdiğini kontrol eden bir kod yazınız.
        System.out.println("abcde".matches("[a-zA-Z]{5}")); // true 5 karakterli hepsi harf
        System.out.println("abcdef".matches("[a-zA-Z]{5}")); // false 5'den fazla karakter iceriyor..
        System.out.println("1dfgh".matches("[a-zA-Z0-9]{5}")); // false harf disi karakter iceriyor.

        System.out.println("ab23+-7!".matches("[.*.\\p{Punct}[a-zA-Z0-9]*]{8,}")); // eslestirme yapar * tum karakterleri alir
    }
}
