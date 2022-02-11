import java.util.Scanner;

public class C30_Ternary {

    public static void main(String[] args) {

    // kullanicidan iki sayi alin
    // bu sayilardan buyuk olmayani yazdirin


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen iki sayi giriniz");
        double sayi1= scan.nextDouble();
        double sayi2= scan.nextDouble();

        System.out.println(sayi1>sayi2 ? sayi2 : sayi1);

    }
}