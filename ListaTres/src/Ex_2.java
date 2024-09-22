import java.util.Scanner;

public class Ex_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int x = 0;
        
        do {
            if (x % 2 == 0) System.out.println("X:" + x);
            
            x++;
        } while(x <= 100);
         
    }
    
}
