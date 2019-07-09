import java.util.Scanner;

public class Caculator {
    private static int soa,sob;
    static int result = 0;
    
    static String pheptinh;

    public static void main(String[]args){
        System.out.println("Nhập số a:");
        Scanner s = new Scanner(System.in);
          soa = s.nextInt();
          s.nextLine();
        System.out.println("Nhập Số b :");
        sob = s.nextInt();
         s.nextLine();
        System.out.println("Nhập phép tính :");
         pheptinh = s.nextLine();
       
        switch(pheptinh){
            case "+": 
            result = soa+sob;
            break;
            case "-": 
            result = soa-sob;
            break;
            case "*": 
            result = soa*sob;
            break;
            case ":": 
            result = soa/sob;
            break;
            case "%": 
            result = soa%sob;
            break;
        }
        System.out.println("result="+result);
        
       

    }
}