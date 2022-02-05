public class C15_Increment {
    public static void main(String[] args) {

        int sayi=20;


        // artirma yapmanin 3. bir yolu daha var
        // java'da en cok karsilasacagimiz artirma yontemidir

        // sayinin degerini bir artiralim

        // 1.yontem
        sayi=sayi+1;  // 21

        // 2.yontem
        sayi+=1;  // 22

        // 3.ve en cok kullanilan

        sayi++; // 23

        // bu yontem sadece 1 artirmak icin kullanilir

        System.out.println("sayinin son hali : " + sayi);
    }

}
