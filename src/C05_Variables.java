public class C05_Variables {
    public static void main(String[] args) {


        // variable : icine belirli bir data turunde deger atayabildigimiz bir konteynir gibidir
        // konteynir'in adi degismez ama icindeki degerler kod ilerledikce degisebilir
        // ornegin oyunda level bilgisini tutan level isminde bir variable olsun
        // oyun ilerledikce level ismni ayni kalir ama degeri 1,2,3,4... ilerler
        // bir satirdda variable kullanildiginda yukari dogru bakariz bize en yakin atama gecerlidir
        // (java da son atanan deger gecerlidir)

        int not=87;

        String okulIsmi= "Yildiz Koleji";


        System.out.println(okulIsmi); // Yildiz Koleji
        System.out.println("okulumuz : " + okulIsmi); // okulumuz : Yildiz Koleji

        System.out.println(not*2); // 174

        System.out.println("Notunuz : " + 87); // Notunuz : 87
    }
}
