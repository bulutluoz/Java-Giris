import java.util.Scanner;

public class C26_IfElseIfStament {
    public static void main(String[] args) {

        // Kullanicidan maas icin bir teklif isteyin ve asagidaki degerlere gore cevap azdirin.
        //     Teklif sifin altindaysa "Sanirim yanlis rakam yazdiniz,
        //      Teklif 80.000’in uzerinde ise “Kabul ediyorum” ,
        //		60 – 80.000 arasinda ise “Konusabiliriz”,
        //		60.000’nin altinda ise “Maalesef Kabul edemem” yazdirin


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen teklifinizi giriniz");

        double teklif=scan.nextDouble();

        if (teklif<=0){
            System.out.println("Sanirim yanlis rakam yazdiniz");
        } else if( teklif>80000){
            System.out.println("kabul ediyorum");
        } else if(teklif>60000 ){
            System.out.println("Konusabiliriz");
        } else{
            System.out.println("Maalesef Kabul edemem");
        }
    }
}
