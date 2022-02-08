import java.util.Scanner;

public class C22_StringEsitligi {
    public static void main(String[] args) {

        // kullanicidan gun ismini isteyin
        // ve girilen degere gore hafta ici veya hafta sonu yazdirin

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen gun ismini giriniz");

        String gunIsmi=scan.next();

        System.out.println("girdiginiz gun : " + gunIsmi);

        if (gunIsmi.equalsIgnoreCase("pazartesi") || gunIsmi.equalsIgnoreCase("sali") ||
        gunIsmi.equalsIgnoreCase("carsamba") || gunIsmi.equalsIgnoreCase("persembe")
        || gunIsmi.equalsIgnoreCase("cuma")){
            System.out.println("Girdiniz gun haftaici" );
        }

        if (gunIsmi.equalsIgnoreCase("Cumartesi") || gunIsmi.equalsIgnoreCase("pazar")){
            System.out.println("Girdiniz gun haftasonu" );
        }
    }
}
