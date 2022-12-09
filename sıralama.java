import java.util.Scanner;
public class sıralama {
    public static void main ( String [] args ){
        Scanner giriş = new Scanner(System.in);
        System.out.println(" lütfen iki sayı giriniz");
        double sayı1 = giriş.nextDouble();
        double sayı2 = giriş.nextDouble();
        if ( sayı1>sayı2){
            System.out.println(sayı1+ "sayısı" + sayı2 + " sayısından büyüktür ");
        }
        else if ( sayı2 > sayı1){
            System.out.println(sayı2+ "sayısı" + sayı1 + " sayısından büyüktür ");
        }
        else{
            System.out.println("iki sayı birbirine eşittir");
        }
    }
}
