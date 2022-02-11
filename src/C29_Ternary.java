import java.util.Scanner;

public class C29_Ternary {

    public static void main(String[] args) {

        // kullanicidan vize ve final notunu isteyin
        // vizenin %30 ve finalin %70 ini alarak yil sonu notunu hesaplayin
        // yilsonu notu 50 veya daha yuksekse "gectin"
        // 50'den kucukse "kaldin" yazdirin


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen vize notunuzu giriniz");
        double vizeNotu= scan.nextDouble();

        System.out.println("Lutfen final notunuzu giriniz");
        double finalNotu=scan.nextDouble();


        double yilSonuNotu= vizeNotu*0.3 + finalNotu*0.7;


        if (yilSonuNotu>=50){
            System.out.println("Gectin");
        } else {
            System.out.println("Kaldin");
        }


        System.out.println(yilSonuNotu>=50 ? "Gectin" : "Kaldin");

    }

}
