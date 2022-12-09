import java.util.Scanner;
public class sayılar {
    public static void main (String [] args ){
        Scanner giriş = new Scanner(System.in);
        System.out.println("Bir tam sayı giriniz");
        int sayı = giriş.nextInt();
        if ( sayı > 0 ){
            System.out.println("Girilen sayı pozitiftir ");
        }
        else if (sayı<0){
            System.out.println("girilen sayı negatiftir ");
        }
        else{
            System.out.println("Girilen sayı 0 eşittir");
        }
    }
}
