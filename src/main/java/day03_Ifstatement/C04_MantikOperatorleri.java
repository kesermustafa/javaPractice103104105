package day03_Ifstatement;

public class C04_MantikOperatorleri {
    public static void main(String[] args) {

        // && ile || arasindaki fark
        // &&


        System.out.println(5+2==8); // false

        boolean sonuc1 = 5>4 && 7<9 && 6+3==9 && 5+2!=8; //true
        System.out.println("sonuc1 = " + sonuc1);

        boolean sonuc2 = 5>4 && 7>9 && 6+3==9 && 5+2!=8; //false : birtane false'i gorunce direkt false yazar
                                                            //digerlerini kontrol etmez...
        System.out.println("sonuc2 = " + sonuc2);

        int sayi1 = 15;

        System.out.println(sayi1>10 || sayi1<20);
        System.out.println(10<sayi1 && sayi1<20);


        //Sayi2 nin 10 ve 20 arasinda olmadigini true donduren kod yazin...
        int sayi2 = 15;

        System.out.println("Sayi2  10 ve 20 arasinda degil = "+ (sayi2<10 || sayi2>20));



    }
}
