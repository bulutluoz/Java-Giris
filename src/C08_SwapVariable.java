public class C08_SwapVariable {
    public static void main(String[] args) {

        /*
        1- Verilen sayi1 ve sayi2 variable’larinin degerlerini degistiren (SWAP)
           bir program yaziniz
	       Orn 	: sayi1=10 ve sayi2=20;
		   kod calistiktan sonra
		          sayi1=20 ve sayi2=10

        gitHub
         */

        int sayi1=15;
        int sayi2=25;

        System.out.println("swap isleminden once sayi1=" + sayi1 + ", sayi2=" + sayi2);

        int temp=0;

             temp              =    sayi1;
        //  variable           =    deger
        // deger atanacak   assignment

        sayi1=sayi2;


        sayi2=temp;

        System.out.println("swap isleminden sonra sayi1=" + sayi1 + ", sayi2=" + sayi2);
    }
}
