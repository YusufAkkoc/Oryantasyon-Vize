import java.util.Scanner;
public class toplam {
    public static void main ( String [] args ){
        Scanner giriş = new Scanner(System.in);
        System.out.println("1.  tamsayıyı giriniz");
        int sayı1 = giriş.nextInt();
        System.out.println(" 2. tamsayıyı giriniz");
        int sayı2 = giriş.nextInt();

        int toplam = sayı1+sayı2 ;
        System.out.println("girilen iki sayının toplamı: " + toplam );
    }
}
