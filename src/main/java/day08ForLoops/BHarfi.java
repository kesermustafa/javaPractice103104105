package day08ForLoops;

import java.util.Scanner;

public class BHarfi {
    public static void main(String[] args) {


        for(int i = 1 ; i <= 7 ; i++) {

            for (int m = 1; m <= 4; m++) {
                if (m == 1 || i == 1 || i == 7 || i==4 || m==4) {
                    System.out.print("* ");
                } else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }



        for (int i = 1; i <=7 ; i++) {//satir kontrolu
            for (int j = 1; j <=4 ; j++) {//sutun kontrolu
                if((i==1 ||(i==2 && (j==1 || j==4)) || i==4 )||
                        (i==3 && (j==1 || j==4))||(i==5 && (j==1 || j==4))||(i==6 && (j==1 || j==4))|| i==7 ){
                    System.out.print(" *");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }





    }
}
