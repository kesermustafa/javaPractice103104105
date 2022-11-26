package Advance.practice01;

public class Q03_RegexQuantifiers {
    public static void main(String[] args) {

        //Bir String değerin belirli
        //sayıda karakter içerip belirli bir karakter ile bitip bitmediğini kontrol eden bir kod yazınız.

        String str = "mmmmmas";
        System.out.println( str.matches(".*.s")); // true==> herhangi bir karakterle baslayip 's' ile bitiyor.

          // matches() methodu regex ile calisip String degerin regex ile karsilastirmasini yapar.
        System.out.println( str.matches("..s")); // false==> 3 karakterli olmadigi icin

        //Bir String değerin ikinci karakterinin belirli bir karakter olup olmadığını kontrol eden
        // bir kod yazınız.

        System.out.println("qsddffjds".matches(".s.*")); //.s ==> 2.karakter s mi, ==> true
                                                                // .*  's' den sonra kac karakter olursa olsun
        // .* ==> esnek sayida karakter (0 yada daha fazla)
        System.out.println("qsddffjds".matches(".r.*")); // false ==> 2.karakter uyusmuyor...

        //Bir String değerin sadece harf içerip içermediğini kontol eden bir kod yazınız.

        System.out.println("abc".matches("[a-zA-Z]*")); // eslestirme yapar * tum karakterleri alir
        System.out.println("abc".matches("\\w*")); // eslestirme yapar * tum karakterleri alir
        System.out.println("abc".matches("\\w{3}")); // eslestirme yapar {3} karakter icersin


        //Bir String değerin belirli bir sayıda belirli karakterleri içerdiğini kontrol eden bir kod yazınız.
        System.out.println("abcde".matches("[a-zA-Z]{5}")); // true 5 karakterli hepsi harf
        System.out.println("abcdef".matches("[a-zA-Z]{5}")); // false 5'den fazla karakter iceriyor..
        System.out.println("1dfgh".matches("[a-zA-Z]{5}")); // false harf disi karakter iceriyor.


        //Bir String değerin belirli karakterleri en az belirli sayıda içerip içermediğini
        // kontrol eden bir kod yazınız.

        System.out.println("123456".matches("[0-9]{6,}")); //true => {6,} en az 6 ve uzeri rakam icermesi gerekir.

        //Bir String değerin belirli karakterleri en az ve en çok belirli sayıda içerip içermediğini kontrol eden bir kod yazınız.

        System.out.println("abcd123".matches("\\w{7,10}")); // en az 7,en fazla 10 karakter olabilir..


        // ilk karakter 1, ikinci karekter noktalama işareti ve kalan 8 karakter rakam toplam 10 karakter olmali,

        System.out.println("1!12345678".matches("[1][\\p{Punct}][0-9]{8}"));
                                                     //ilk 1, ikinci noktalama, kalan 8 karakter rakam olmali demek...





    }
}
