package listacinco;
import java.util.Scanner;

public class Ex_5 {

    public static void main(String[] args) {
           Scanner scan = new Scanner(System.in);
           
           int vet[] = new int [5];
           double media = 0;

           System.out.println("Digite 5 numeros Inteiros");
           
           for (int i = 0; i < vet.length; i++) {
               System.out.printf("N %d: ", i+1);
               vet[i] = scan.nextInt();   
           }
           
           System.out.print("[ ");           
           for (int i = 0; i < vet.length; i++) {
               System.out.print(vet[i] + ", ");
               media += vet[i]; 
           }           
           System.out.print("]");
           
           media /= vet.length;
           System.out.printf("\nMedia do Vetor: %.2f", media);
    }
}
