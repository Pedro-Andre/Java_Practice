package lista.cinco.e.seis;

import java.util.Random;

public class Ex_2 {

    public static void main(String[] args) {
        Random rand = new Random();

        int vet[][] = new int[2][2];

        System.out.println("\t\t\t MATRIZ 2x2");

  
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) vet[i][j] = rand.nextInt(20);
        }

        for (int i = 0; i < 2; i++) {
            System.out.printf("\n| ");
            for (int j = 0; j < 2; j++) {
                System.out.printf("%d ", vet[i][j]);
            }
            System.out.printf("|");
        }
            System.out.println();

    }
}
