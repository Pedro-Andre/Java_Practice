package lista.cinco.e.seis;

import java.util.Random;

public class Ex_5 {

    public static void main(String[] args) {
        Random rand = new Random();

        int soma;
        int vet[][] = new int[4][4];

        System.out.println(" MATRIZ 4x4 ");

        for (int i = 0; i < 4; i++) {
            System.out.printf("\n| ");
            for (int j = 0; j < 4; j++) {
                vet[i][j] = rand.nextInt(50);
                    System.out.printf("%d ", vet[i][j]);
            }
            System.out.printf("|");
        }

        System.out.println();
        System.out.print("\nSomente os Valores Impares: ");
        
        for (int i = 0; i < 4; i++) {
            System.out.printf("\n| ");
            for (int j = 0; j < 4; j++) {    
                if (vet[i][j] % 2 == 0){
                    vet[i][j] = 0;
                    System.out.printf("%d ", vet[i][j]);
                } else System.out.printf("%d ", vet[i][j]);          
            }
            System.out.printf("|");
        }
            System.out.println();
    }
}
