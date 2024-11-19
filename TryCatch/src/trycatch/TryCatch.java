package trycatch;
import java.util.Scanner;

public class TryCatch {

    public static void main(String[] args) {
        int n1, n2;
        double result;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite o 1 numero: ");
        n1 = scan.nextInt();
        
        System.out.print("Digite o 2 numero: ");
        n2 = scan.nextInt();
        
        try {
        result = (n1/n2);
        System.out.println("O resultado e: " + result);
    } catch (ArithmeticException  e) {
        System.out.println("Erro 4B4Z => " + e.getMessage());
    } finally {
            System.out.println("finalizando...");
        }
    }
    
}
