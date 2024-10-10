import java.util.Scanner;

public class Ex_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int x = 0, num, maior = 0, cont = 0;
        
            System.out.print("Digite a quantidade de numeros que deseja inserir: " );
            num = scan.nextInt();
        
        do {
            System.out.print("Num: ");
            num = scan.nextInt();
           
            if (num > maior) {
                maior = num;
                cont++;
            }
            
            x++;
        } while(x <= num);
         
    System.out.println("Maior mumero: " + maior);
    System.out.println("Numero de vezes que o maior foi digitado: " + cont);
    }

    
}
