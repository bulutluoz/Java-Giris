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

        rakam = sayi%10;

        // birler basamagini bulmak icin modulos kullaniriz
        basamaklarToplami += rakam;

        System.out.println(sayi/10);
    }
}
