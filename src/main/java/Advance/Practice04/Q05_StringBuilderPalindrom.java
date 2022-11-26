package Advance.Practice04;

public class Q05_StringBuilderPalindrom {
    // Bir String degerin palidrom olup olmadigini kaonrol eden bir kod yaziniz..

    public static void main(String[] args) {

        String str = "ey edip adanada pide ye";
//    String strRevers = "";
//
//    for(int i = str.length()-1; i>-1 ; i--){
//        strRevers += str.charAt(i);
//    }
//        System.out.println(strRevers);
//
//    if(str.equalsIgnoreCase(strRevers)){
//        System.out.println("Palidrom");
//    }else {
//        System.out.println("Palidrom degil");
//    }

        String strq = "nazan";
        StringBuilder str1 = new StringBuilder(strq);
        String strRevers = String.valueOf(str1.reverse());  // str1.revers().toString(); de kullanilabilir.


        if(strq.equals(strRevers)){
            System.out.println("Palidrom");
        }else {
            System.out.println("Palidrom degil");
        }








    }
}
