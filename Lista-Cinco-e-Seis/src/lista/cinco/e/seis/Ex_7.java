package lista.cinco.e.seis;

import java.util.Random;

public class Ex_7 {

    public static void main(String[] args) {
        Random rand = new Random();

        int maior = 0, menor = 210;
        int vet[][] = new int[3][3];

        System.out.println("MATRIZ 3x3");

        for (int i = 0; i < 3; i++) {
            System.out.printf("\n| ");
            for (int j = 0; j < 3; j++) {
                vet[i][j] = rand.nextInt(200);
                System.out.printf("%d ", vet[i][j]);
                
                if (vet[i][j] > maior) maior = vet[i][j];
                else if (vet[i][j] < menor) menor = vet[i][j];
            }
            System.out.printf("|");
        }
        
        System.out.print("\n\nMaior numero: ");
        System.out.printf("%d", maior);
        System.out.print("\nMenor numero: ");
        System.out.printf("%d\n", menor);
    }
}
