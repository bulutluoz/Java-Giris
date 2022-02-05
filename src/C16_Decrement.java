public class C16_Decrement {

    public static void main(String[] args) {

        int sayi = 40;

        // sayiyi 5 azaltin

        //1.yontem
        sayi = sayi - 5;  // 35
        // 2.yontem
        sayi -=5; // 30

        sayi /=10;  // 3

        System.out.println("sayinin son degeri : " + sayi);

        // 3.yontem sayi--

        sayi--;
        sayi--;

        // Bolme ve carpma icin 3. yontem kullanilamaz
        System.out.println("sayin en son degeri : " + sayi); // 1
    }
}
