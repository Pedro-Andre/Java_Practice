import java.util.Scanner;

public class Ex_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int x = 0;
        
        while(x <= 100) {
            if (x % 2 == 0) System.out.println("X:" + x);
            
            x++;
        } 
    }
}