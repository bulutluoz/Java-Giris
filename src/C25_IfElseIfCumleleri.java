import java.util.Scanner;

public class C25_IfElseIfCumleleri {

    public static void main(String[] args) {
        //Soru 1) Kullanicidan dikdortgenin kenar uzunluklarini isteyin
        //        ve dikdortgenin kare olup olmadigini yazdirin
        //        eger kenarlardan biri 0 veya negatif sayiysa
        //     "girilen deger dikdortgenin kenar degeri olamaz" yazdirin

        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen dikdortgenin kenar uzunluklarini giriniz");
        double kenar1=scan.nextDouble();
        double kenar2=scan.nextDouble();


        if (kenar1<=0 || kenar2<=0){
            System.out.println("girilen deger dikdortgenin kenar degeri olamaz");
        } else if(kenar1==kenar2){
            System.out.println("girdiginiz dikdortgen bir kare");
        } else{
            System.out.println("girdiginiz dikdortgen kare degil");
        }
    }
}
