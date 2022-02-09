import java.util.Scanner;

public class C23_IfElseBloklari {
    public static void main(String[] args) {

        //Soru 1) Kullanicidan dikdortgenin kenar uzunluklarini isteyin
        //        ve dikdortgenin kare olup olmadigini yazdirin


        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen dikdortgenin kenar uzunluklarini giriniz");
        double kenar1=scan.nextDouble();
        double kenar2=scan.nextDouble();


        if (kenar1==kenar2){
            System.out.println("girdiginiz dikdortgen bir kare");
        } else{
            System.out.println("girdiginiz dikdortgen kare degil");
        }

    }


}
