import java.util.Scanner;

public class C11_Scanner {
    public static void main(String[] args) {

        // kullanicinin ismini, soyismini ve yasini alip
        // asagida belirtilen bicimde bu bilgileri yazdirimn
        //  isminiz : Mehmet
        //  soyisminiz: Bulut
        //  yasiniz :50

        Scanner scan= new Scanner(System.in);

        System.out.println("Lutfen isminizi yaziniz");

        String isim=scan.nextLine();

        System.out.println("Lutfen soyisminizi yaziniz");

        String soyisim=scan.nextLine();

        System.out.println("Lutfen yasinizi giriniz");

        int yas=scan.nextInt();

        System.out.println("Isminiz : "+isim);
        System.out.println("Soyisminiz : " + soyisim);
        System.out.println("Yasiniz : " + yas);


        }
}
