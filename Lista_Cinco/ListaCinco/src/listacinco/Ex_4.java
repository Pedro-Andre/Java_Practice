package listacinco;
import java.util.Scanner;

public class Ex_4 {

    public static void main(String[] args) {
           Scanner scan = new Scanner(System.in);
           
           int vet[] = new int [10];
           int i;

           System.out.println("Digite 10 numeros Inteiros");
           
           for (i = 0; i < vet.length; i++) {
            System.out.printf("N %d: ", i+1);
            vet[i] = scan.nextInt();   
            
            if (vet[i] % 2 == 0) vet[i] = 1;           
            else vet[i] = 0;
           }
           
           System.out.print("[ ");           
           for (i = 0; i< vet.length; i++) System.out.print(vet[i] + ", ");           
           System.out.print("]");           
    }
    
}
