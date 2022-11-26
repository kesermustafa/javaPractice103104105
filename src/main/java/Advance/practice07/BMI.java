package Advance.practice07;

public class BMI {

    /*
    BMI hesaplama kodu yazınız. (Güvenliği göz ardı etmeyin).
    BMI(Vücut Kitle Endeksi):
    BMI, vücut kütlesinin vücut boyunun karesine bölünmesi olarak tanımlanır.
    Başlıca yetişkin BMI sınıflandırmaları,
    zayıf (18,5 kg/m2'nin altında),
    normal ağırlık (18,5 ila 25),
    fazla kilolu (25 ila 30) ve obez (30 veya daha fazla) şeklindedir.
   */

    private double kilo;
    private double boy;


    public BMI() {


    }

    public BMI(double kilo, double boy) {
        this.kilo = kilo;
        this.boy = boy;
    }



    public double getKilo() {
        return kilo;
    }

    public void setKilo(double kilo) {
        this.kilo = kilo;
    }

    public double getBoy() {
        return boy;
    }

    public void setBoy(double boy) {
        this.boy = boy;
    }

    public void bMIHesapla(){

        double bmi = kilo/(boy*boy);

        if(bmi>0 && bmi<18.5){
            System.out.println("Zayifsiniz.");
        }else if(bmi>=18.5 && bmi<25){
            System.out.println("Normal.");
        }else if(bmi>=25 && bmi<30){
            System.out.println("Kilolu.");
        }else if(bmi>=30 ){
            System.out.println("Obez.");
        }else {
            System.out.println("Gecersiz deger");
        }
    }


    @Override
    public String toString() {
        return "BMI{" +
                "kilo=" + kilo +
                ", boy=" + boy +
                '}';
    }


}
