import java.util.Scanner;
public class günler {
    public static void main ( String[] args){
        Scanner giriş = new Scanner(System.in);
        System.out.println(" lütfen durumlar için 1-7 arasında bir sayı giriniz ");
        int gün = giriş.nextInt();
        switch (gün) {
            case 1 : System.out.println("Bugün günlerden pazartesi ");
            break;
            case 2 : System.out.println("Bugün günlerden salı ");
                break;
            case 3 : System.out.println("Bugün günlerden çarşamba ");
                break;
            case 4 : System.out.println("Bugün günlerden perşembe ");
                break;
            case 5 : System.out.println("Bugün günlerden cuma ");
                break;
            case 6 : System.out.println("Bugün günlerden cumartesi ");
                break;
            case 7 : System.out.println("Bugün günlerden pazar ");
                break;
            default: System.out.println(" lütfen geçerli bir sayı giriniz");
            System.exit(1);
        }
    }
}
