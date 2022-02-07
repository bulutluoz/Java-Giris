import java.util.Scanner;

public class C17_SayininRakamlarToplaminiBulma {

    public static void main(String[] args) {
        // kullanicidan 3 basamakli bir sayi alip
        // sayinin basamaklar toplamini bulun


        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen rakamlari toplacak 3 basamakli bir tamsayi girin");

        int sayi= scan.nextInt();  // 654

        int rakam=0;
        int basamaklarToplami=0;

        rakam = sayi%10; //4

        // birler basamagini bulmak icin modulos kullaniriz
        basamaklarToplami += rakam; // 4

        sayi/=10 ; // 65.4 ==> 65

        rakam=sayi%10; // 5
        basamaklarToplami+=rakam; // 9
        sayi/=10; // 6.5==> 6

        basamaklarToplami+=sayi;

        System.out.println("Girdiginiz sayinin basamaklari toplami "  + basamaklarToplami);




    }
}
