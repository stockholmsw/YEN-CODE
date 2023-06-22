package questionsCodes;
import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int  toplam = 0;
        System.out.println("Sayi giriniz : ");
        int sayi = scan.nextInt();
        for(int i = 0;i<=sayi;i++){
            toplam+=i;
        }
        System.out.println("Girilen sayiya kadar toplam : " + toplam);

        double ortalama = (double) toplam/sayi;
        System.out.println("Sayilarin ortalamasi : " + ortalama);
        for(int i = 0;i<=sayi;i++){
            if(ortalama>i){
                System.out.println("Ortalamadan kucuk olan sayı : " + i );
            }
        }




    }
}
