import java.util.Scanner;

public class Ex_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int x=0, num;
        
        System.out.println("Digite um numero de 1 a 10: ");
        num = scan.nextInt();
        
        do {
            System.out.println(num + " x " + x + " = " + (x * num));
           
            x++;
        } while(x <= 10);
         
    }
    
}
