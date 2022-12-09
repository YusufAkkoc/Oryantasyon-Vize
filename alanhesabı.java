import java.util.Scanner;
public class alanhesabı {
    public static void main ( String [] args){
        Scanner giriş = new Scanner(System.in);
        System.out.println(" lütfen bir yarıçap değeri giriniz ");
        double yarıçap = giriş.nextDouble();
        if ( yarıçap <= 0){
            System.out.println(" yanlış değer girdiniz");
        }
        else {
            final double pi = 3.14 ;
            double alan = pi*yarıçap*yarıçap;
            System.out.println(yarıçap + " yarıçaplı dairenin alanı "+ " " + alan);
        }
    }
}
