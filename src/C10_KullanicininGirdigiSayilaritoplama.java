import java.util.Scanner;

public class C10_KullanicininGirdigiSayilaritoplama {
    public static void main(String[] args) {


        // kullanicidan 2 sayi alip bunlarin toplamini yazdiran bir program yaziniz

        // 1.adim
        Scanner scan = new Scanner(System.in);

        // 2. adim : mesaj
        System.out.println("Lutfen toplanacak sayilardan ilkini yazin");

        // 3. adim variable olusturup scan'den o degeri almak

        double sayi1= scan.nextDouble();



        // 2.sayi icin ayni islemleri yenileyecegiz
        // Sadece Scanner scan'e gerek yoktur

        // kullaniciya mesaj
        System.out.println("Lutfen toplanacak sayilardan ikincisini yazin");
        // degeri scan'den alma

        double sayi2=scan.nextDouble();
        System.out.println("verilen iki sayinin toplami : " + (sayi1+sayi2));

    }
}
