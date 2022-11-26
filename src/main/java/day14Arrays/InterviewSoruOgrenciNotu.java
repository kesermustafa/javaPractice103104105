package day14Arrays;

public class InterviewSoruOgrenciNotu {

     /*
    Interwiew Sorusu
    Ogrencilerin test sonuclarini degerlendiren Java kodunu method kullanarak yaziniz
    //10 sorumuz var
    //ogrencilerin cevaplari
    char[][] answers = {
    {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
    {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
    {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
    {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
    {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
    {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
    {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
    {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};
    *
    * // cevap anahtari
    char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};

    output:
    1 nolu ogrencinin dogru cevap sayisi :7
    2 nolu ogrencinin dogru cevap sayisi :6
    3 nolu ogrencinin dogru cevap sayisi :5
    4 nolu ogrencinin dogru cevap sayisi :4
    5 nolu ogrencinin dogru cevap sayisi :8
    6 nolu ogrencinin dogru cevap sayisi :7
    7 nolu ogrencinin dogru cevap sayisi :7
    8 nolu ogrencinin dogru cevap sayisi :7
*/
     public static void main(String[] args) {

         char[][] answers = {
                 {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                 {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                 {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                 {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                 {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                 {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                 {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                 {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};

         // cevap anahtari
         char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};


         int counter = 0;


         for(int i = 0; i< answers.length; i++){

             for(int n = 0; n<keys.length; n++){

                 if(keys[n]==answers[i][n]){
                     counter++;
                 }
             }
             System.out.println(i+1 + "  nolu ogrencinin dogru cevap sayisi :"+counter );
             counter=0;

         }
         System.out.println("*******------********");

        //2.yol
         int idx = 1;
         int sayac = 0;
         for(char[] w : answers){

                 for(int n = 0; n<keys.length; n++){

                     if(keys[n]==w[n]){
                         sayac++;
                     }
                }

             System.out.println(idx + "  nolu ogrencinin dogru cevap sayisi :"+sayac );
             sayac=0;
             idx ++;

         }
         System.out.println("*******------********");

         // 3.YOL

         int say = 0;
         int sira = 1;

         for(char[] w : answers){

             int ix = 0;

             for(char k : keys){

                 if(k == w[ix]){
                     say++;
                 }
                 ix++;
             }

             System.out.println(sira + "  nolu ogrencinin dogru cevap sayisi :"+say );
             say=0;
             sira++;

         }




     }
}
