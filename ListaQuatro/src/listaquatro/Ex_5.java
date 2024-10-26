import java.util.Scanner;

public class Ex_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int x = 0, num, maior = 0, cont = 0, quantidade;

        System.out.print("Digite a quantidade de numeros que deseja inserir: " );
        quantidade = scan.nextInt(); 
        
        while(x < quantidade) {  
            System.out.print("Nummero: ");
            num = scan.nextInt();
           
            if (num > maior) {
                maior = num;
                cont = 1;  
            } else if (num == maior) {
                cont++;  
            }

            x++;
        }
         
        System.out.println("Maior numero: " + maior);
        System.out.println("Numero de vezes que o maior foi digitado: " + cont);
    }
}
