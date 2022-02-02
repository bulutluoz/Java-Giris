public class C03_Variables {

    public static void main(String[] args) {

        String str1= "Ali";
        String str2= "Can";

        System.out.println(str1 + str2); //AliCan

        System.out.println(str2+str1); // CanAli

        System.out.println(    str1       +           str2    ); // AliCan

        // araya bosluk birakmak veya baska kelimeleri eklemek istersek

        System.out.println(str1+ " " + str2); // Ali Can

        System.out.println("Benim ismim : " + str1 + " " + str2); // Benim ismim : Ali Can
    }
}
