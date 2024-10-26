package lista.cinco.e.seis;

import java.util.Scanner;
import java.util.Random;

public class Ex_8 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        int maior = 0, menor = 210, num;
        int vet[][] = new int[3][3];

        System.out.println("\t\t\t MATRIZ 3x3");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                vet[i][j] = rand.nextInt(1000);
            }
        }

        System.out.print("\tMATRIZ");

        for (int i = 0; i < 3; i++) {
            System.out.printf("\n| ");
            for (int j = 0; j < 3; j++) {
                System.out.printf("%d ", vet[i][j]);
            }
            System.out.printf("|");
        }

        System.out.print("\n\nAgora digite um numero: ");
        num = scan.nextInt();
                
        boolean found = false;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (num == vet[i][j]) {
                    found = true;
                    break; 
                }
            }
            if (found) break;
        }

        if (found) System.out.println("Pessoa de Sorte!");
        else System.out.println("Tu es azarado demais!");
        
    }
}

   