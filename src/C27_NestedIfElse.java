import java.util.Locale;
import java.util.Scanner;

public class C27_NestedIfElse {

    public static void main(String[] args) {
        // kadinlar icin emeklilik yasi 60, erkekler icin ise 65
        // kullanicidan yasini ve cinsiyetini isteyip
        // emekli olup olamayacagini yazdiran
        // bir program yaziniz


        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen cinsiyetinizi giriniz \nErkek icin E \nKadin icin K tusuna basiniz");
        char cinsiyet = scan.next().toUpperCase().charAt(0);

        System.out.println("Lutfen yasinizi giriniz");

        double yas = scan.nextDouble();

/*
        if (cinsiyet=='K' && yas<60){
            System.out.println("Emekli olamazsiniz");
        } else if(cinsiyet=='K' && yas>=60){
            System.out.println("Emekli olabilirsiniz");
        } else if(cinsiyet=='E' && yas<65){
            System.out.println("Emekli olamazsiniz");
        } else if(cinsiyet=='E' && yas>=65){
            System.out.println("Emekli olabilirsiniz");
        } else {
            System.out.println("Yanlis giris yaptiniz");
        }
*/

        // Nested if ile yapalim
        // ic ice if else

        if (cinsiyet == 'E') {
            if (yas < 65) {
                System.out.println("Emekli olamazsiniz");
            }else {
                System.out.println("Emekli olabilirsiniz");
            }

        } else if (cinsiyet == 'K') {

            if (yas < 60) {
                System.out.println("Emekli olamazsiniz");
            } else {
                System.out.println("Emekli olabilirsiniz");
            }

        } else {
            System.out.println("Yanlis giris yaptiniz");
        }


    }
}