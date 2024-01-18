import java.util.*;
public class asalSayi {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int sayi ;

        System.out.print("Sayı giriniz :");
        sayi = input.nextInt();

        boolean asalMi = true;

        for (int i = 2 ; i<sayi ; i++){

            if (sayi%i == 0) {

                asalMi = false ;
                break;
            }
        }

        if (asalMi){
            System.out.println("Girilen " + sayi + " sayısı asaldır.");
        }
        else {
            System.out.println("Girilen " + sayi + " sayısı asal değildir.");
        }
    }
}