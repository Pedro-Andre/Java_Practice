package lista.cinco.e.seis;

import java.util.Random;

public class Ex_10 {
    public static void main(String[] args) {
        Random random = new Random();
        
        int[][] vet = new int[3][4];
        int vendidas = 0, valorTotal = 0;

        int[][] valores = {
            {20, 20, 20, 20},
            {10, 10, 10, 10},
            {20, 20, 20, 20}
        };

        System.out.println("Passagem de Onibus");

        for (int i = 0; i < 3; i++) {
            System.out.print("\n| ");
            for (int j = 0; j < 4; j++) {
                vet[i][j] = random.nextInt(2);
                if (vet[i][j] == 0) {
                    System.out.print("0 ");
                } else if (vet[i][j] == 1) {
                    System.out.print("1 ");
                    vendidas++;
                    valorTotal += valores[i][j];
                }
            } 
            System.out.print("|");
        }

        System.out.println("\n---=| MENU DE VENDAS |=---\n");
        System.out.println("Poltronas disponiveis = 0 | Poltronas Vendidas = 1");
        System.out.println("Poltronas Janela = R$20 | Poltronas Corredors= R$10");

        System.out.printf("\nPoltronas vendidas: %d \nValor Total: %d\n", vendidas, valorTotal);
    }
}
