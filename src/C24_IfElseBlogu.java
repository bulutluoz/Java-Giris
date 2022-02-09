import java.util.Scanner;

public class C24_IfElseBlogu {
    public static void main(String[] args) {

        // Soru 4) Kullanicidan bir ucgenin uc kenar uzunlugunu alin
        //         eger uc kenar uzunlugu birbirine esit ise ekrana “Eskenar ucgen” yazdirin.
        //         Diger durumlarda ekrana  “Eskenar degil” yazdirin.


        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen ucgenin 3 kenar uzunlugunu giriniz");
        double kenar1=scan.nextDouble();
        double kenar2=scan.nextDouble();
        double kenar3=scan.nextDouble();

        if (kenar1==kenar2 && kenar1==kenar3){
            System.out.println("girilen ucgen eskenar bir ucgen");
        } else {
            System.out.println("girilen ucgen eskenar degil");
        }
    }
}
