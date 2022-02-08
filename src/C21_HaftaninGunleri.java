import java.util.Scanner;

public class C21_HaftaninGunleri {

    public static void main(String[] args) {
        // Soru 2) Kullanicidan gun isimlerinden birinin ilk harfini isteyin
        // ve o harfle baslayan gun isimlerini yazdirin
        //	Ornek: 	ilkHarf=P output = “Pazar, Pazartesi veya Persembe”
        //	ilkHarf=S output = “Sali”
        //	*** Buyuk kucuk harf problem olmamasi icin toUpperCase methodunu kullanin

        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen istediginiz gunun bas harfini giriniz");

        char ilkHarf=scan.next().charAt(0);

        if (ilkHarf == 'P' ||  ilkHarf == 'p' ){
            System.out.println("Girdiginiz gun pazar, pazartesi veya persembe olabilir");
        }

        if(ilkHarf == 'S' ||  ilkHarf == 's' ){
            System.out.println("Girdiginiz gun sali");
        }

        if(ilkHarf == 'C' ||  ilkHarf == 'c' ){
            System.out.println("Girdiginiz gun carsamba, cuma veya cumartesi olabilir");
        }




    }
}
