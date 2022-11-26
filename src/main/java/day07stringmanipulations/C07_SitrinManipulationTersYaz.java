package day07stringmanipulations;

import java.util.Scanner;

public class C07_SitrinManipulationTersYaz {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 4 karakterli kelime giriniz ");
        String kelime = scan.nextLine();

                if(kelime.length()==4){

                    char bir = kelime.charAt(0);
                    char iki = kelime.charAt(1);
                    char uc = kelime.charAt(2);
                    char dort = kelime.charAt(3);

                    System.out.println("Ters hali : " + dort+uc+iki+bir);

                }else{
                    System.out.println("4 karakterli kelime gimediniz...");

                }





    }
}
