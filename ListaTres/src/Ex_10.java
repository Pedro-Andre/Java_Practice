
import java.util.Scanner;

public class Ex_10 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int check, senha = 4321;

        System.out.print("Digite a senha de 4 numeros: ");
        check = scan.nextInt();
        
        do {
      
            if (check != senha){
                System.out.println("Senha Incorreta! Tente Novamente!");
                System.out.print("Senha: ");
                check = scan.nextInt();
            }
            
            if (check == senha) System.out.print("Senha Correta!\n");
            
        } while (check != senha);
           
           
    }
}
