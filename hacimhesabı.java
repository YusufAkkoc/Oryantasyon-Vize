import java.util.Scanner;
public class hacimhesabı {
    public static void main (String[] args){
        Scanner giriş = new Scanner(System.in);
        System.out.println("lütfen cm cinsinden yarıçap giriniz");
        double yarıçap = giriş.nextDouble();
        System.out.println(" lütfen cm cinsinden yükseklik giriniz ");
        double yükseklik = giriş.nextDouble();

        final double pi = 3.14 ;
        double hacim = pi*yarıçap*yarıçap*yükseklik;
        System.out.println(yarıçap + "yarıçaplı ve " + yükseklik + " yüksekliğindeki silindirin hacmi: " + hacim );
    }
}
