package Advance.practice07;

public class Q01_ArrayToStringNegativee {
    /*
      Array olarak verilen bir cümleyi String olarak negatif anlamıyla yazdıran bir kod yazınız.
      Input:
      String[] arr={"J","a","v","a","I","s","D","i","f","f","i","c","u","l","t"};
      Output:
      String output ="JavaIsNOTDifficult";
       */

    public static void main(String[] args) {

        String[] arr={"J","a","v","a","I","s","D","i","f","f","i","c","u","l","t"};

        String str = "";
        for(String w : arr){
            str+=w;
        }
        String strNegative = str.replace("Is", "IsNOT");
        System.out.println(strNegative);



    }
}
