package atmproject;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {

    private int accoutNumber;  // hesap  numarasi
    private int pinNumber;

    private double checkingBalance; // vadesiz hesap bakiyesi
    private double savingBalance; // vadeli hesap bakiyesi

    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");

    Scanner input = new Scanner(System.in);

    public int getAccoutNumber() {
        return accoutNumber;
    }

    public void setAccoutNumber(int accoutNumber) {
        this.accoutNumber = accoutNumber;
    }

    public int getPinNumber() {
        return pinNumber;
    }

    public void setPinNumber(int pinNumber) {
        this.pinNumber = pinNumber;
    }

    public double getCheckingBalance() {
        return checkingBalance;
    }

    public void setCheckingBalance(double checkingBalance) {
        this.checkingBalance = checkingBalance;
    }

    public double getSavingBalance() {
        return savingBalance;
    }

    public void setSavingBalance(double savingBalance) {
        this.savingBalance = savingBalance;
    }

    public Scanner getInput() {
        return input;
    }

    public void setInput(Scanner input) {
        this.input = input;
    }

    //  para cekme  paraCekmeIslemindenSonraKalanMiktar  --  amount = miktar
    private double calculateCheckingBalanceAfterWithdraw(double amount){
        checkingBalance = checkingBalance - amount;
        return checkingBalance;
    }

    // para yatirma isleminden sonr kalan bakiyeyi hesapla
    private double calculateCheckingBalanceAfterDeposit(double amount){
        checkingBalance = checkingBalance + amount;
        return checkingBalance;
    }

    // para cekme saving hesabindan para cekildikten sot=ra kalan bakiye
    private double calculateSavingBalanceAfterWithdraw(double amount){
        savingBalance = savingBalance - amount;
        return savingBalance;
    }

    //para yatirma : saving hesabina para yatirdiktan sonra geri kalan bakiyeyi hesaplayiniz.
    private double calculateSavingBalanceAfterDeposit(double amount){
        savingBalance = savingBalance + amount;
        return savingBalance;
    }

    // musteri ile para cekmek icin etkilesime gecelim : checking hesap

    public void getCheckingWithdraw(){
        displayCurrentAmount(checkingBalance);
        System.out.println("Cekmek istediginiz miktari giriniz: ");
        double amount = input.nextDouble();

        if(amount <= 0){
            System.out.println("Sifir veya eksi rakamlar gecersizdir!");
            getCheckingWithdraw();  // recursive method call
        }else if(amount<=checkingBalance){
            calculateCheckingBalanceAfterWithdraw(amount);
            displayCurrentAmount(checkingBalance);
        }else{
            System.out.println("Yetersiz bakiye!");
        }
    }

    // Musteri ile para yatirma icin etkilesime gecelim: checking hesap
    public void getCheckingDeposit(){
        displayCurrentAmount(checkingBalance);
        System.out.println("Yatirmak istediginiz miktari giriniz: ");
        double amount = input.nextDouble();

        if(amount <= 0){
            System.out.println("Sifir veya eksi rakamlar gecersizdir!");
            getCheckingDeposit();  // recursive method call
        }else{
            calculateCheckingBalanceAfterDeposit(amount);
            displayCurrentAmount(checkingBalance);
        }
    }


    // musteri ile para cekmek icin etkilesime gecelim : Saving hesap

    public void getSavingWithdraw(){
        displayCurrentAmount(savingBalance);
        System.out.println("Cekmek istediginiz miktari giriniz: ");
        double amount = input.nextDouble();

        if(amount <= 0){
            System.out.println("Sifir veya eksi rakamlar gecersizdir!");
            getSavingWithdraw();  // recursive method call
        }else if(amount<=savingBalance){
            calculateSavingBalanceAfterWithdraw(amount);
            displayCurrentAmount(savingBalance);
        }else{
            System.out.println("Yetersiz bakiye!");
        }
    }


    // Musteri ile para yatirma icin etkilesime gecelim: Saving hesap
    public void getSavingDeposit(){
        displayCurrentAmount(savingBalance);
        System.out.println("Yatirmak istediginiz miktari giriniz: ");
        double amount = input.nextDouble();

        if(amount <= 0){
            System.out.println("Sifir veya eksi rakamlar gecersizdir!");
            getSavingDeposit();  // recursive method call
        }else{
            calculateSavingBalanceAfterDeposit(amount);
            displayCurrentAmount(savingBalance);
        }
    }

        // son bakiyeyi goster
    public void displayCurrentAmount(double balance){
        System.out.println("Hesabinizin guncel bakiyesi : " + moneyFormat.format(balance));
    }










}
