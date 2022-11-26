package Advance.practice;

import java.util.Scanner;

public class SayiTahminSorusu {
    public static void main(String[] args) {

        /*
        aklinizdan 0 dan 99 a kadar bir sayi tutun ama programa girmeyin
        program calistiginda sayiyi tahmin etsin
        program sayinizi bulana kadar
        sayiniz tahminden buyukse 1 e basin
        sayiniz tahminden kucukse 2 ye basin
        program sayinizi bilirse 3 e basin ve program "bildim di  mi" desin
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Aklinindan bir sayi tutun \nsayiniz tahminden buyukse 1'e \nsayiniz tahminden kucukse 2 \nprogram sayinizi bilirse 3 e basin");

        int sayi;


        int counter = 0;

        do {
            int rastgeleSayi= (int)(Math.random()*100)+1;
            System.out.println("Tahminim : " + rastgeleSayi);
            int num = input.nextInt();

            if(counter==5){
                System.out.println("Hakkiniz bitti");
                break;
            } else if(num==1){
                counter++;
            }else if(num==2){
                counter++;
            }else if(num==3){
                System.out.println("Bildim di mi!");
                break;
            }

        }while (true);






    }
}

