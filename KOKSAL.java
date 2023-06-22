package questionsCodes;
import java.util.Scanner;

public class KOKSAL {
    public static void main(String[] args) {
        Scanner koksal = new Scanner(System.in);
        // Trust yourself motherfucker;
        // 1 - Faktöriyel Kodu;

        System.out.println("Bir sayi giriniz....");
        int birSayi;
        int faktoriel = 1;
        birSayi = koksal.nextInt();
        for(int i = 1;i<=birSayi;i++){
            faktoriel = faktoriel*i;
            System.out.println( i  + " Faktöriyeli : " + faktoriel);
        }




        /*
        // 2- Vize final;
        int vizeNotu,finalNotu;
        double ortalama;
        System.out.println("Vize notonuz : ");
        vizeNotu = koksal.nextInt();
        System.out.println("final notunuzu giriniz : " );
        finalNotu = koksal.nextInt();
        ortalama = (vizeNotu*0.3 + finalNotu*0.7)/2.0;
        System.out.println("Ortalamaniz : " + ortalama);

        if(ortalama<50){
            System.out.println("Çalışıp da girin sınava!!!");
        }
        else{
            System.out.println("Başarıyla geçtiniz");
        }

         */


        // Isteğe bağli girilen sayilarin toplami





    }
}
