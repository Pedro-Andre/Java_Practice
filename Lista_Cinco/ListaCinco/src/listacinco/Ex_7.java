package listacinco;

import java.util.Scanner;
import java.util.Random;

public class Ex_7 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        int vet[] = new int[5];
        int i, pares = 0, impares = 0;

        System.out.println("Preechendo Vetor com 5 numeros:");

        for (i = 0; i < vet.length; i++) {
            vet[i] = rand.nextInt(100);
        }

        System.out.print("[ ");

        for (i = 0; i < vet.length; i++) {
            System.out.print(vet[i] + ", ");
        }

        System.out.print("]");


        for (i = 0; i < vet.length; i++) {
            if (vet[i] % 2 == 0) {
                pares++;
            }
            else {
                impares++;
            }
        }
        
        System.out.printf("\n\nPares: %d", pares);
        System.out.printf("\nImpares: %d\n", impares);
    }
}
