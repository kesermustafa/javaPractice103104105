package depoProje;

import java.util.ArrayList;
import java.util.Scanner;

public class Methods {

    static Scanner input = new Scanner(System.in);
    public static void menu(){
        System.out.println("\n1=Urun tanimla\n2=Urunleri listele\n3=Urun girisi\n4=Urun cikis\n5=Cikis");
        int sec = input.nextInt();

        switch (sec){
            case 1 :
                UrunTanimla.urunTanimla();
                break;
            case 2 :
                urunListele();
                break;
            case 3 :
                urunGiris();
                break;
            case 4 :
                urunCikis();
                break;
            case 5 :
                break;
            default:
                System.out.println("Hatali secim yaptiniz...");
                menu();
        }
    }

    public static void urunListele(){
        for(ArrayList<Urunler> w : UrunTanimla.urunlerList){
            System.out.println(w);
        }
        menu();
    }

   // urunGirisi        ==> giris yapmak istedigimiz urnunun id numarasi ile girecegiz.
    public static void urunGiris(){
        System.out.println("Giris yapmak istediginiz urun ID girininiz..");
        String idNo = input.next();

        for(ArrayList<Urunler> w : UrunTanimla.urunlerList){
            for(Urunler k : w){
                if(k.urunId.equals(idNo)){
                    System.out.println("Mevcut miktar = " + k.miktar);
                    System.out.println("Eklenecek Urun miktarini giriniz.");
                    String ekMiktar = input.next();
                    if(Integer.parseInt(ekMiktar)>0){
                        int yeni = Integer.parseInt(k.miktar) + Integer.parseInt(ekMiktar);
                        String str = String.valueOf(yeni);
                        k.setMiktar(str);
                    }else{
                        System.out.println("Negatif urun girilemez...");
                    }
                }
            }
        }

        menu();
    }

    public static void urunCikis() {
        System.out.println("Cikis yapmak istediginiz urun ID girininiz..");
        String idNo = input.next();

        for(ArrayList<Urunler> w : UrunTanimla.urunlerList){
            for(Urunler k : w){
                if(k.urunId.equals(idNo)){
                    System.out.println("Mevcut miktar = " + k.miktar);
                    System.out.println("Cikis miktarini giriniz.");
                    String ekMiktar = input.next();
                    if(Integer.parseInt(ekMiktar)>0){
                        if( Integer.parseInt(ekMiktar)<= Integer.parseInt(k.miktar) ){
                            int yeni = Integer.parseInt(k.miktar) - Integer.parseInt(ekMiktar);
                            String str = String.valueOf(yeni);
                            k.setMiktar(str);
                        }else{
                            System.out.println("Yeterli miktarda urun bulunmamaktadir.");
                        }
                    }else{
                        System.out.println("Negatif urun girilemez...");
                    }
                }
            }
        }
            menu();
        }




}
