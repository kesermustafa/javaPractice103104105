package Advance.Practice03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q06 {
        /*
        Bir Array'in Mountain Array olup olmadığını kontrol eden bir kod yazınız.
        Mountain Array: Element değerleri bir noktaya kadar sürekli artıp o noktadan
        sonra sürekli azalan Array.
         */

    public static void main(String[] args) {

    int[] arr = { -2000, -999,1, 2, 5, 7, 9, 22, 8, 3, 1, -100, -2000 };
        List<Integer>list = new ArrayList<>();

        for(int w: arr){
            list.add(w);
        }

        System.out.println(list);
        int max = arr[0];
        for(Integer w : arr){

           if(w>max){
               max = w;
           }
        }
        System.out.println(max);

        List<Integer> list1 = new ArrayList<>();
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == max){
                break;
            }
            list1.add(arr[i]);
        }
        System.out.println(list1);

        List<Integer> list2 = new ArrayList<>();

        for(int i = 0; i<list.size(); i++){

            if(i<list.indexOf(max)){
                continue;
            }
            list2.add(arr[i]);
        }
        System.out.println(list2);

        List<Integer> list1kopya = new ArrayList<>(list1);
        Collections.sort(list1kopya);
        List<Integer> list2kopya = new ArrayList<>(list2);
        Collections.sort(list2kopya);
        Collections.reverse(list2kopya);


        System.out.println(list1kopya);
        System.out.println(list2kopya);

        if(list1.equals(list1kopya)&&list2.equals(list2kopya)){
            System.out.println("Mountain Array");
        }else {
            System.out.println("Mountain Array degil");
        }

    }
}
