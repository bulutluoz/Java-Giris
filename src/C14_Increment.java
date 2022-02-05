import java.util.Scanner;

public class C14_Increment {
    public static void main(String[] args) {
        // kullanicidan bir sayi alip sayiyi 5 artiralim

        Scanner scan=new Scanner(System.in);

        System.out.println("lutfen bir tamsayi giriniz");

        int sayi=scan.nextInt();

        sayi = sayi+5;  // bu kod acisindan dogrudur ama tercih edilmez

        System.out.println("sayinin yeni degeri : " + sayi);

        // sayiyi 2 artiralim

        sayi += 2; // sayinin degerini 2 artirip sayi varible'na assign

        System.out.println("sayinin son degeri : " + sayi);

        // sayinin son degerini 2 katina cikaralim

        sayi     *=       2;

        System.out.println("sayinin carpilmis hali : " + sayi);




    }
}
