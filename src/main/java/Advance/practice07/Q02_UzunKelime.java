package Advance.practice07;

import java.util.*;

public class Q02_UzunKelime {

    /*
    Kullanıcıdan alınan cümledeki en uzun kelimeyi(kelimeleri) return eden bir
     method oluşturunuz.
     */

    public static void main(String[] args) {

        System.out.println(enUzunKelimeler());

       // uzunKelime("Java cok kolaydir anlayana tabi!");

    }

    public static void uzunKelime(String str){

        String[] arr = str.split(" ");

        Arrays.sort(arr, Comparator.comparingInt(String::length));
        System.out.println(arr[arr.length-2] +" "+  arr[arr.length-1]);
    }

    public static List<String>enUzunKelimeler(){

        Scanner input = new Scanner(System.in);
        System.out.println("Bir cumle giriniz...");
        String cumle = input.nextLine();
        String[] arr = cumle.split(" ");

        int max = 0;

        for(String w: arr){
            if(  w.length()>max){
                max = w.length();
            }
        }
        List<String>enUzunKelimeler = new ArrayList<>();
        for(String w : arr){
            if(w.length() == max){
               enUzunKelimeler.add(w);
            }
        }

        return enUzunKelimeler;
    }

}
