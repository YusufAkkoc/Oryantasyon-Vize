import java.util.Scanner;
public class hesap {
    public static void main (String[]args){
        Scanner giriş = new Scanner(System.in);
        System.out.println("3 kardeşin yaşını giriniz");
        int yaş1 = giriş.nextInt();
        int yaş2 = giriş.nextInt();
        int yaş3 = giriş.nextInt();

        int toplam = yaş1+yaş2+yaş3 ;
        double ortalama = ( yaş1+yaş2+yaş3) / 3d ;
        System.out.println("3 kardeşin yaşları toplamı " + " " + toplam  );
        System.out.println("3 kardeşin yaşları ortalaması" + " " + ortalama );

    }
}
