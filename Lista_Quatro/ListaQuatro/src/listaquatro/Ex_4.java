import java.util.Scanner;

public class Ex_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int num, pares = 0, impares = 0, primos = 0, cont = 0;
        
        System.out.println("Digite 10 numeros inteiros: ");
        
        while(cont < 10) {
            num = scan.nextInt();
            
            int divisor = 0;
            int i = 1;
            cont++;
            
        while (i <= num) {
			if (num % i == 0) divisor++;
               
			i++;	
		} 
        if (divisor  == 2) primos++;
            if (num % 2 == 0) pares++;
            else impares++;
        } 
         
        
        System.out.println("Numeros pares: " + pares);
        System.out.println("Numeros impares: " + impares);
        System.out.println("Numeros primos: " + primos);
    }
    
}
     