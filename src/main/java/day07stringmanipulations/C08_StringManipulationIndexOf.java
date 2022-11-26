package day07stringmanipulations;

public class C08_StringManipulationIndexOf {
    public static void main(String[] args) {
/*
           String str = "Kara kara dusunme Ankara";
        //indexOf() method'u verilen character veya caharacter'lerin "ilk gorunumunun" index'ini verir.
        int idxA1 = str.indexOf("kara");
        System.out.println(idxA1);//5


        //lastIndexOf() method'u verilen character veya caharacter'lerin "son gorunumunun" index'ini verir.
        int idxA2 = str.lastIndexOf("kara");//20 bastan Ankara'nin kara'si
        System.out.println(idxA2);
         */
        //Ex: Verilen bir String'deki bir character'in tekrarli veya
        // tekrarsiz olup olmadigini gosteren kodu yaziniz


        String str = "Javacancandir";

        char ch = 'J';

        if(str.toLowerCase().indexOf(ch) == str.toLowerCase().lastIndexOf(ch)){
            System.out.println("Tekrarsiz");
        }else{
            System.out.println("Tekrarli");
        }







    }
}
