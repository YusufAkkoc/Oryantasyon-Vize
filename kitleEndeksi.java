import java.util.Scanner;
public class kitleEndeksi {
    public static void main(String [] args ){
        Scanner giriş =new Scanner(System.in);
        System.out.println("lütfen kilonuzu giriniz ");
        double kilo = giriş.nextDouble();
        System.out.println("lütfen boyunuzu metre cinsinden giriniz ");
        double boy = giriş.nextDouble();
        double vke = kilo / (boy*boy);
        if (vke<18.5) {
            System.out.println("vucut kitle endeksiniz : " + vke + "zayıfsınız");
        }
        else if (vke<24.9) {
            System.out.println("vucut kitle endeksiniz : " + vke + "ideal kilodasınız");
        }
        else if (vke<29.9) {
            System.out.println("vucut kitle endeksiniz : " + vke + "şişmansınız");
        }
        else if (vke<35) {
            System.out.println("vucut kitle endeksiniz : " + vke + "obezsiniz");
        }
        else {
            System.out.println("vucut kitle endeksiniz : " + vke + "Aşırı obezsiniz");
        }
    }
}