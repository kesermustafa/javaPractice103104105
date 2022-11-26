package Advance.Practice04;

public class Butce {

    public static int  butce;
    public int harclik;


    public void harclikAl(int alininHarcik){
        harclik += alininHarcik;
        butce -= alininHarcik;
    }

    public void butcedenHarca(int harcanacakPara){
        butce -= harcanacakPara;
    }

    public void harclikHarca(int harclikHarcamasi){
        harclik -= harclikHarcamasi;
    }

    public void maasAl(int alinanMaas){
        butce += alinanMaas;
    }




}
