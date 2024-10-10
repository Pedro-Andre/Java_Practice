import java.util.Scanner;

public class Ex_7 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num, maior, menor;

        System.out.println("Digite varios numeros (Numero < 0  = Finaliza): ");
        num = scan.nextInt();

        maior = num;
        menor = num;

        while (num != 0) {
            
            if (num > maior) maior = num;
            if (num < menor) menor = num;
         
            num = scan.nextInt();

        }

        System.out.print("Maior numero: " + maior + "\n");
        System.out.print("Menor numero: " + menor + "\n");

    }
}