package day03_Ifstatement;

import java.util.Scanner;

public class C03_Ortalama {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double nuum1 = 23.4;
        double nuum2 = 24.0;
        double nuum3 = 12;
        double nuum4 = 450.3;
        double nuum5 = 23000;

        double ortalama = (nuum1+nuum2+nuum3+nuum4+nuum5)/5;
        System.out.println(ortalama);

    }
}
