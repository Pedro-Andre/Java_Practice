import java.util.Scanner;

public class Ex_8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int idade = 1, soma = 0, cont = 0;
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        double media;

        while (idade != 0) {
            
            System.out.print("Digite uma idade (0 = Finaliza): ");
            idade = scan.nextInt();

            if (idade == 0) break;
                
            soma += idade;
            cont++;

            if (idade > maior) maior = idade;
            if (idade < menor) menor = idade;
            
        }

        if (cont > 0) {
            media = (double) soma / cont;
            System.out.printf("\nMedia das idades: %.2f%n", media);
            System.out.println("Maior idade: " + maior);
            System.out.println("Menor idade: " + menor);
        }
    }
}
    
