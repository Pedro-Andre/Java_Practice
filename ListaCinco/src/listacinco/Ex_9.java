package listacinco;

import java.util.Scanner;
import java.util.Random;

public class Ex_9 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        int vet[] = new int[10];
        int i, j, temp;

        System.out.println("Preechendo Vetor com 10 numeros:");

        for (i = 0; i < vet.length; i++) vet[i] = rand.nextInt(100);
        
        System.out.print("\nVetor Original: ");

        System.out.print("[ ");
        for (i = 0; i < vet.length; i++) System.out.print(vet[i] + ", ");
        System.out.print("]");

        
        System.out.print("\nVetor em Ordem Crescente: ");
        
        System.out.print("[ ");
        for (i = 0; i < 9; i++) {
            for (j = 0; j < 9 - i; j++) {
                if (vet[j] > vet[j + 1]) {
                    temp = vet[j];
                    vet[j] = vet[j + 1];
                    vet[j + 1] = temp;
                }
            }
        }

        for (i = 0; i < 10; i++) System.out.print(vet[i] + ", ");
        
        System.out.print("]");
        
        
    }
}
