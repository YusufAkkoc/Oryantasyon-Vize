import java.util.Scanner;
public class dönüşüm {
public static void main (String [] args ) {
    Scanner giriş = new Scanner(System.in);
    System.out.println("Hızınızı giriniz");
    double hız = giriş.nextDouble();
    double çeviri1 = hız * 3600/1000d ;
    double çeviri2 = hız * 1000/3600d ;
    System.out.println("girilen m/s hızı km/h çevirmek için 1'i , girilen km/h hızı m/s çevirmek için" +
            "2'yi tuşlayınız ");
    int durum = giriş.nextInt();
    switch (durum) {
        case 1 : System.out.println("cevap" + çeviri1 );
        break;
        case 2 : System.out.println( "cevap" + çeviri2 );
        break;
        default: System.out.println("lütfen geçerli birayı giriniz");
        System.exit(1);
    }
    }
}

