package Advance.practice02;

public class Q06_Arrays_BelirliToplamiVerenIkiler {

        /*
     Toplamları, verilen bir sayıya eşit olan  Array element çiflerini yazdıran bir method oluşturunuz.
     {4,6,5,-10,8,5,20} ===> 10

     4 + 6 = 10
     5 + 5 = 10
    -10 + 20 = 10
     */

    public static void main(String[] args) {

        int[] arr = {4, 6, 5,-10, 8, 5, 12, -2,  20, 7 };

     ikilileriBul(arr, 10);

    }

    public static void ikilileriBul(int[] arr, int number){

        for(int i=0; i<arr.length; i++){
            for(int j = i+1; j<arr.length; j++){
                if(arr[i]+arr[j]==number){
                    System.out.println(arr[i] +" + "+ arr[j] +" = "+number);
                }
            }
        }

    }





}
