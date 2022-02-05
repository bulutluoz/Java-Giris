import java.util.Scanner;

public class C13_Increment {
    public static void main(String[] args) {

        // kullanicidan bir tamsayi alip sayinin 2 katini konsolda yazdiran bir program yazalim

        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen bir tamsayi giriniz");

        int sayi= scan.nextInt();


        sayi = sayi*2;
       // variable  = deger


        System.out.println("sayinin yeni degeri : " + sayi);
    }


}
