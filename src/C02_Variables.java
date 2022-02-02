public class C02_Variables {
    public static void main(String[] args) {

        // sayisal bir degisken olusturup deger atayalim ve yazdiralim

        int sayi=7;


        System.out.println(sayi); // 7


        System.out.println(sayi); // 7

        sayi=12;

        System.out.println(sayi); // 12

        // 2 * elma = normal hayatta boyle bir islem olmaz
        // biz metin seklinde bir ifadeyi matematiksel islemde yazdigimizda
        // java kodu kontrol eder
        // eger yazdigimiz isimde sayisal bir variable varsa itiraz etmez, yoksa kirmizi yapar

        System.out.println(2 * sayi); // 24
       // System.out.println(2 * elma);

        int elma=10;
        System.out.println(elma + 5); // 15


    }
}
