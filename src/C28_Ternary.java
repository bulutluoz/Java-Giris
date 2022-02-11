public class C28_Ternary {


    public static void main(String[] args) {

        int sayi=-16;

       String sonuc= sayi%2==0  ? "sayi cift" : "sayi tek" ;

        System.out.println(sonuc);


        // ternary if else ile yapabilecegimiz basit islemleri yapmak icin kullanilir
        // sartin dogru veya yanlis olmasina gore alinacak degeri atamak icin kullanilir
        // if else bloklarinin icerisinde uzun kodlar yazabiliriz
        // ancak ternary icerisinde sadece direk sonuc veya bizi sonuca goturecek basit islemler olabilir
    }
}
