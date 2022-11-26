package Advance.practice05;

import java.text.DecimalFormat;

public class HesapMakinesi {


    public void  toplama(int ...a){
        int toplam = 0;
        for (int w : a ) {
            toplam = toplam+w;
        }
        System.out.println("Toplam = " + toplam);
    }

    public void carpma(int ...a){
        int carpma = 1;
        for (int w : a ) {
            carpma = carpma*w;
        }
        System.out.println("Carpim = " +carpma);
    }

    public void cikartma(int a, int b){
        System.out.println("Fark = "+ (a-b));
    }

    public void bolme(double a, double b){

        if(b==0){
            System.out.println("Bolen sayi 0 olamaz");
        }else{
            System.out.println("Bölüm = "+new DecimalFormat("##.##").format(a/b));
        }


    }



}
