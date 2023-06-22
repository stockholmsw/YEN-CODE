package questionsCodes;
import java.util.Scanner;

public class CarpimTablosu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for(int i = 2;i<=70;i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }

    }
    public static boolean isPrime(int num){
        for(int i = 2;i<num;i++){
            if(i==1){
                return  false;
            }
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}
