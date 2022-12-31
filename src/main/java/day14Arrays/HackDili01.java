package day14Arrays;

import java.util.Scanner;

public class HackDili01 {

    public static void main(String[] args) {

/*
        Kullanıcının yazdığı metni, 'hacker'ların konuşma diline çeviren kodu yazınız.
        Hackerlar bazı harfleri sayılara çevirerek yazışabiliyorlar. Genellikle çevirdikleri harfler şu şekilde:
        s -> 5
        a -> 4
        e -> 3
        i -> 1
        o -> 0
        Test data
        hackerDili("java ile hersey guzel")
        j4v4 1l3 h3r53y guz3l
        İpucu harfleri değiştirin ve ekrana yazdırın.
        */
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");
        String cumle = input.nextLine().toLowerCase();

        String yeni = cumle.replaceAll("s", "5").replaceAll("a", "4").replaceAll("e", "3").replaceAll("i", "1").replaceAll("o", "0");
        System.out.println(yeni);


        String str = "";

        for (int i = 0; i < cumle.length(); i++) {

            if (cumle.substring(i, i+1).equals("s")) {
                str += "5";
            } else if (cumle.substring(i, i+1).equals("a")) {
                str += "4";
            } else if (cumle.substring(i, i+1).equals("e")) {
                str += "3";
            } else if (cumle.substring(i, i+1).equals("i")) {
                str += "1";
            } else if (cumle.substring(i, i+1).equals("s")) {
                str += "0";
            } else {
                str += cumle.substring(i, i+1);
            }
        }

        System.out.println(str);

    }



}
