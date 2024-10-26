package lista.cinco.e.seis;

import java.util.Random;

public class Ex_11 {
    public static void main(String[] args) {
        Random random = new Random();
        
        int[][] mat = new int[4][4];
        int soma, total;

        System.out.println("\t\t\t QUADRADO MAGICO");

        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) mat[i][j] = random.nextInt(10) + 1;
        }

        for (int i = 0; i < 4; i++) {
            System.out.print("\n| ");
            for (int j = 0; j < 4; j++) System.out.print(mat[i][j] + " ");
            System.out.print("|");
        }

        soma = 0;
        for (int i = 0; i < 4; i++) soma += mat[i][i];
        
        System.out.printf("\n\nSoma Diagonal principal: %d", soma);

        total = soma;
        soma = 0;

        for (int i = 0; i < 4; i++) soma += mat[i][4 - 1 - i];
        
        System.out.printf("\nSoma Diagonal secundaria: %d\n\n",soma);

        for (int i = 0; i < 4; i++) {
            soma = 0;
            for (int j = 0; j < 4; j++) soma += mat[i][j];
            System.out.printf("Soma da Linha %d: %d\n",i+1,soma);
        }

        System.out.println();

        for (int j = 0; j < 4; j++) {
            soma = 0;
            for (int i = 0; i < 4; i++) soma += mat[i][j];
            System.out.printf("Soma da Coluna %d: %d\n", j+1,soma);
        }

        if (total == soma) System.out.println("\nE um quadrado magico!\n");
            else System.out.println("\nNao e um quadrado magico.\n");
    
    }
}
