import java.util.Scanner;

public class Ex_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int num, pares = 0, impares = 0, primos = 0, cont = 0;
        
        System.out.println("Digite 10 numeros inteiros: ");
        
        do {
            num = scan.nextInt();
            
            int divisor = 0;
            int i = 1;
            
        do {
			if (num % i == 0) divisor++;
               
			i++;	
		} while (i <= num);
            if (divisor  == 2) primos++;
            if (num % 2 == 0) pares++;
            else impares++;
           
           cont++;
        } while(cont < 10);
         
        
        System.out.println("Numeros pares: " + pares);
        System.out.println("Numeros impares: " + impares);
        System.out.println("Numeros primos: " + primos);
    }
    
}
     