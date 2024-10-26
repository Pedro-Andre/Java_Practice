
import java.util.Scanner;

public class Ex_6 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n1, n2, i, soma = 0, mult = 1;

        System.out.println("Digite o primeiro numero: ");
        n1 = scan.nextInt();

        System.out.println("Digite o segundo numero: ");
        n2 = scan.nextInt();

        if (n1 > n2) {
            int temp = n1;
            n1 = n2;
            n2 = temp;
        }

        i = n1;

        while (i < n2) {
            if (i % 2 == 0) {
                soma += i;
            } else {
                mult *= i;
            }
            i++;
        } 

        System.out.printf("Soma dos numeros pares do intervalo: %d ~ %d = %d\n", n1, n2, soma);
        System.out.printf("Multiplicaçao dos numeros impares do intervalo: %d ~ %d = %d\n", n1, n2, mult);
    }
}