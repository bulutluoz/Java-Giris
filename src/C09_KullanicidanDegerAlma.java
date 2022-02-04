import java.util.Scanner;

public class C09_KullanicidanDegerAlma {

    public static void main(String[] args) {

        // 1.adim : Class'imiz icin bir Scanner olusturalim
        Scanner scan = new Scanner(System.in);

        // 2.adim : Kullanicidan hangi bilgiyi istedigimizi konsola yazdiralim
        //
        System.out.println("Lutfen isminizi giriniz");

        // 3.adim : Bir variable olusturup, uygun method yardimiyla kullanicinin girdigi degeri
        // kodlarimizin icine alalim
        String isim = scan.nextLine();

        System.out.println("Girdiginiz isim : " + isim);


    }
}
