package Advance.practice10;

public class Q07_ConvertTreeDigitNumberToWords {

    //Uc haneli bir sayıyı ingilizce okunuşuna çeviren bir kod yazınız.

    public static void main(String[] args) {
        int number = 156;

        int hundreds = number/100;
        int tens = (number/10)%10;
        int ones = number%10;

        if(hundreds==0){
            System.out.println("Enter a three digits number");

        }else {

            switch (hundreds){
                case 1  :{
                    System.out.println("one");
                    break;
                }
                case 2  :{
                    System.out.println("two");
                    break;
                }
                case 3  :{
                    System.out.println("three");
                    break;
                }
                case 4  :{
                    System.out.println("four");
                    break;
                }
                case 5  :{
                    System.out.println("five");
                    break;
                }
                case 6  :{
                    System.out.println("six");
                    break;
                }
                case 7  :{
                    System.out.println("seven");
                    break;
                }
                case 8  :{
                    System.out.println("eight");
                    break;
                }
                case 9  :{
                    System.out.println("nine");
                    break;
                }
            }
            System.out.println("hundred");

            if(tens==1){
                switch (ones){
                    case 0:{
                        System.out.println("ten");
                        break;
                    }
                    case 1:{
                        System.out.println("eleven");
                        break;
                    }
                    case 2:{
                        System.out.println("twelve");
                        break;
                    }
                    case 3:{
                        System.out.println("thirteen");
                        break;
                    }
                    case 4:{
                        System.out.println("fourteen");
                        break;
                    }
                    case 5:{
                        System.out.println("fifteen");
                        break;
                    }
                    case 6:{
                        System.out.println("sixteen");
                        break;
                    }
                    case 7:{
                        System.out.println("sevebteen");
                        break;
                    }
                    case 8:{
                        System.out.println("eighteen");
                        break;
                    }
                    case 9:{
                        System.out.println("ninteen");
                        break;
                    }
                }

            }else {
                switch (tens){
                    case 0:{
                        System.out.println("twenty ");
                        break;
                    }
                    case 1: {
                        System.out.println("twenty one");
                        break;
                    }
                    case 2: {
                        System.out.println("twenty two");
                        break;
                    }
                    case 3:{
                        System.out.println("twenty tree");
                        break;
                    }
                    case 4:{
                        System.out.println("twenty four");
                        break;
                    }
                    case 5:{
                        System.out.println("twenty five");
                        break;
                    }
                    case 6:{
                        System.out.println("twenty six");
                        break;
                    }
                    case 7:{
                        System.out.println("twenty seven");
                        break;
                    }
                    case 8:{
                        System.out.println("twenty eight");
                        break;
                    }
                    case 9:{
                        System.out.println("twenty nine");
                        break;
                    }

                }
            }




        }
    }
}
