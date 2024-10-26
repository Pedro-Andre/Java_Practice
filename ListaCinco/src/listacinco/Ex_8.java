package listacinco;

import java.util.Scanner;
import java.util.Random;

public class Ex_8 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        int vet[] = new int[5];
        int i, maior = 0, menor = 999; 
        double media = 0;

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
            
            if (vet[i] > maior) maior = vet[i];
            if  (vet[i] < menor) menor = vet[i];
   
            media += vet[i];
        }
        
        media /= vet.length;
        
        System.out.printf("\n\nMaior: %d", maior);
        System.out.printf("\nMenor: %d\n", menor);
        System.out.printf("\nMedia: %.2f\n", media);
    }
}
