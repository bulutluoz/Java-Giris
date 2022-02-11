import java.util.Scanner;

public class C32_NestedTernary {
    public static void main(String[] args) {





        // kullanicidan bir sayi alin
        // sayilardan buyuk olani yazdirin
        // esitlik varsa "verilen sayilar esit" yazdirsin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen iki sayi giriniz");
        double sayi1= scan.nextDouble();
        double sayi2= scan.nextDouble();


        System.out.println(sayi1>sayi2 ? sayi1 : (sayi2>sayi1 ? sayi2 : "verilen sayilar esit"));


        if (sayi1>sayi2){
            System.out.println(sayi1);
        }else if (sayi2 >sayi1){
            System.out.println(sayi2);
        } else {
            System.out.println("verilen sayilar esit");
        }


    }
}
