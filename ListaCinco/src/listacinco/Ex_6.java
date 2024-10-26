package listacinco;

import java.util.Scanner;
import java.util.Random;

public class Ex_6 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        int vet[] = new int[5];
        int i, num;

        System.out.println("Preechendo Vetor com 5 numeros:");

        for (i = 0; i < vet.length; i++) {

            vet[i] = rand.nextInt(100);
        }

        System.out.print("[ ");
        for (i = 0; i < vet.length; i++) {
            System.out.print(vet[i] + ", ");
        }
        System.out.print("]");

        System.out.printf("\n\nAgora digite um numero: ");
        num = scan.nextInt();

        boolean taNoVetor = false;
        for (i = 0; i < vet.length; i++) {
            if (num == vet[i]) {
                System.out.printf("\nEste numero %d existe no Vetor! Posicao: %d", num, i);
                taNoVetor = true;
                break;
            }
        }
        
        if (!taNoVetor) System.out.printf("\nEste numero %d nao existe no Vetor!", num);
        
    }
}
