import java.util.Scanner;

public class Ex_11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int pares[] = new int[20];
        int impares[] = new int[20];
        int somaP = 0, somaI = 0, i = 0;
        
        // incrementando Array dos pares e somando eles
         while (i < 20) {
            pares[i] = (i + 1) * 2;
            somaP += pares[i];
            i++;
        }
        
        i = 0;
        
        // incrementando Array dos impares e somando eles
         while (i < 20) {
            impares[i] = (i * 2) + 1;
            somaI += impares[i];
            i++;
        }
        
        System.out.print("Pares: ");
        i = 0;
        
         while (i < 20) {
            System.out.print(" " + pares[i]);
            i++;
        }
        
        System.out.println("\nSoma dos pares: " + somaP);
        
        System.out.print("\nImpares: ");
        i = 0;
        
         while (i < 20) {
            System.out.print(" " + impares[i]);
            i++;
        }
        
        System.out.println("\nSoma dos impares: " + somaI);
    }
}