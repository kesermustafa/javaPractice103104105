package day07stringmanipulations;

import java.util.Scanner;

public class C05_StringManipulationsIsEmpty {
    public static void main(String[] args) {

        String str1 = "Hi";

        System.out.println(str1.isEmpty());

        String str2 = "";
        System.out.println(str2.isEmpty());


        Scanner input = new Scanner(System.in);
        System.out.println("Luten bir cumle giriniz...");
        String str3 = input.nextLine();

        boolean spaceVarMi = str3.replaceAll("[^ ]", "").length()>0;
        System.out.println(spaceVarMi);


    }
}
