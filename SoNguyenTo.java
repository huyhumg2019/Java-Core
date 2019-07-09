import java.util.Scanner;

public class SoNguyenTo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Nhap Day So Can Kiem Tra");
        int n = s.nextInt();
        if(isPrime(n)){
            System.out.println(n+" la so nguyen to");


        }else{
            System.out.println(n+"ko phai la so nguyen to");
        }
    }
    public static boolean isPrime(int n){
        if(n<2){
            return false;
        }
        for(int i = 2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }

        return true;

    }
}