package lista.cinco.e.seis;

import java.util.Scanner;
import java.util.Random;

public class Ex_9 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        int maior = 0, menor = 210, pares = 0, impares = 0;
        int vet[][] = new int[5][5];

        System.out.println("\t\t\t MATRIZ 5x5");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                vet[i][j] = rand.nextInt(50);
            }
        }

        System.out.print("\tMATRIZ");

        for (int i = 0; i < 5; i++) {
            System.out.printf("\n| ");
            for (int j = 0; j < 5; j++) {
                System.out.printf("%d ", vet[i][j]);
                
                if (vet[i][j] > maior) maior = vet[i][j];
                if (vet[i][j] < menor) menor = vet[i][j];
                if (vet[i][j] % 2 == 0) pares++;
                if (vet[i][j] % 2 != 0) impares++;
            }
            System.out.printf("|");
        }        
                
        System.out.printf("\n\nMaior numero: %d", maior);
        System.out.printf("\nMenor numero: %d", menor);
        System.out.printf("\nQtd. Pares: %d", pares);
        System.out.printf("\nQtd. Impares: %d\n", impares);
        
        
    }
}

   