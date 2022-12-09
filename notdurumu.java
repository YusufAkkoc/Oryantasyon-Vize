import java.util.Scanner;
public class notdurumu {
    public static void main ( String [] args ){
        Scanner giriş = new Scanner(System.in);
        System.out.println("Sırasıyla 5 dersin notunu giriniz");
        int not1 = giriş.nextInt();
        int not2 = giriş.nextInt();
        int not3 = giriş.nextInt();
        int not4 = giriş.nextInt();
        int not5 = giriş.nextInt();
        double ortalama = (not1+not2+not3+not4+not5)/5d;
        if ( ortalama >= 50) {
            System.out.println("GEÇTİNİZ");
        }
        else {
            System.out.println("KALDINIZ");
        }
    }
}
