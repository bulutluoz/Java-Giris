import java.util.Scanner;

public class C12_KullanicininGirdigiDegerleriSwap {
    public static void main(String[] args) {

        // kullanicidan 2 sayi alin
        // aldiginiz sayilari ekranda su sekilde yazdirin
        // "iki sayi girdiniz ilki : 25 , ikincisi : 30"
        // sonra sayilari swap yapip
        // su sekilde yazdirin
        // verdiginiz sayilarin yerlerini degistirdim. Artik ilk sayi : 30 , ikinci : 25

        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen ilk sayiyi giriniz");

        double sayi1=scan.nextDouble();

        System.out.println("Lutfen ikinci sayiyi giriniz");

        double sayi2=scan.nextDouble();

        // "iki sayi girdiniz ilki : 25 , ikincisi : 30"

        System.out.println("iki sayi girdiniz ilki : "+sayi1 + " , ikincisi : "+sayi2);

        // sonra sayilari swap yapip
        double gecisiSayi=0;

        gecisiSayi=sayi1;
        sayi1=sayi2;
        sayi2=gecisiSayi;
        // verdiginiz sayilarin yerlerini degistirdim. Artik ilk sayi : 30 , ikinci : 25

        System.out.println("verdiginiz sayilarin yerlerini degistirdim. Artik ilk sayi : "+
                sayi1+" , ikinci : "+ sayi2);

    }
}
