package Advance.practice;

public class Regex {
    public static void main(String[] args) {

        String str = "MkWe3AE199*";

        System.out.println(str.matches(".*.\\p{Punct}[\\w]*"));




    }
}
