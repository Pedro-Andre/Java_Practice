package listacinco;

import java.util.Scanner;
import java.util.Random;

public class Ex_10 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        int vet[] = new int[5];
        int i, j, temp;

        System.out.println("Preechendo Vetor com 5 numeros:");

        for (i = 0; i < 5; i++) vet[i] = rand.nextInt(100);
        
        System.out.print("\nVetor Original: ");

        System.out.print("[ ");
        for (i = 0; i < 5; i++) System.out.print(vet[i] + ", ");
        System.out.print("]");

        
        System.out.print("\nVetor em Ordem Decrescente: ");
        
        System.out.print("[ ");
        for (i = 0; i < 5; i++) {
            for (j = 0; j < 4 - i; j++) {
                if (vet[j] < vet[j + 1]) {
                    temp = vet[j];
                    vet[j] = vet[j + 1];
                    vet[j + 1] = temp;
                }
            }
        }

        for (i = 0; i < 5; i++) System.out.print(vet[i] + ", ");
        
        System.out.print("]");
        
        
    }
}
