package Advance.Practice04;

public class Q05_Static_Butce_Runner {

    // Bsit bir ev butcesi yapiniz.

    public static void main(String[] args) {

        Butce baba = new Butce();
        System.out.println("Maas oncesi butce : " + Butce.butce);
        baba.maasAl(5000);
        System.out.println("Maas sonrasi butce : " + Butce.butce);

        baba.harclikAl(500);
        baba.harclikHarca(266);
        baba.butcedenHarca(1000);
        baba.butcedenHarca(5000);

        System.out.println("Baba harclik : " + baba.harclik);


        Butce anne = new Butce();

        anne.maasAl(2000);
        anne.maasAl(3000);
        anne.harclikAl(2000);
        anne.harclikHarca(300);



        System.out.println("anne harclik : " + anne.harclik);
        System.out.println("Butce : " + Butce.butce);






    }
}
