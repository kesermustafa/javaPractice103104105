package Advance.Practice03;

import java.util.Arrays;

public class Q03_MinMaxSecondMaxDeerAlma {
    /*
   Bir Array içerisindeki 'minimum', 'maksimum'  ve 'ikinci maksimum' değerleri
   bulan bir kod yazınız.

   input: int[] arr = { 100, 10001, -90, 845, 8787, 898, 0, 1};
   output: min:-90, max:10001, secMax: 8787

  */
    public static void main(String[] args) {

        int[] arr = { 100, 10001, -90, 845, 8787, 898, 0, 1};

        //1.Yol
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println(arr[0]);
        System.out.println(arr[arr.length-2]);
        System.out.println(arr[arr.length-1]);


        //2.YOL
        int min = arr[0];
        int ikinciMax = arr[0];
        int max = arr[0];

        for(int w : arr){

            if(w<min){
                min=w;

            }else if(w>max){
                ikinciMax = max;
                max = w;

            }else if(w>ikinciMax) {
                ikinciMax =w;
            }

        }
        System.out.println(min);
        System.out.println(ikinciMax);
        System.out.println(max);





    }




}
