package listacinco;
import java.util.Scanner;

public class Ex_2 {

    public static void main(String[] args) {
           Scanner scan = new Scanner(System.in);
           
           int vet[] = new int [10];
           int i;
           

            System.out.println("Digite 10 numeros Inteiros");
           
           
           for (i = 0; i < vet.length; i++) {
            System.out.printf("N %d: ", i+1);
            vet[i] = scan.nextInt();   
           }
 
           
           for (i = 9; i>=0; i--) {
            System.out.printf("Posicao de %d e %d \n" , vet[i] , i);
            
           }
           
    }
    
}
