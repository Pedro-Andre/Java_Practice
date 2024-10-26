package lista.cinco.e.seis;

import java.util.Random;

public class Ex_3 {

    public static void main(String[] args) {
        Random rand = new Random();

        int vet[][] = new int[3][3];

        System.out.println("\t\t\t MATRIZ 3x3");

  
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) vet[i][j] = rand.nextInt(20);
        }

        System.out.print("\tMATRIZ");
        
        for (int i = 0; i < 3; i++) {
            System.out.printf("\n| ");
            for (int j = 0; j < 3; j++) {
                System.out.printf("%d ", vet[i][j]);
            }
            System.out.printf("|");
        }
            System.out.println();
            System.out.print("Diagonal Principal: ");
            System.out.printf("| %d, %d, %d |\n", vet[0][0], vet[1][1],vet[2][2]);
            
    }
}
