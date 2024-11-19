package calculadora;
import java.util.Scanner;


public class Calculadora {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Operacoes ops = new Operacoes();
        
        
        int opt = 0;
        double n1,n2;
        
        System.out.println("\t--== CALCULADORA ==--");
        System.out.println("\t\nSelecione uma opcao de operacao\n");
        System.out.println("1) Soma\t\t2) Subtracao\t3) Multiplicacao\n4) Divisao\t5) Potenciacao\t6) Raiz Quadrada\n7) Raiz Cubica");
        
        System.out.print("\nOpcao: ");
        opt = scan.nextInt();
        
        switch(opt) {
            case 1: 
                System.out.println("1) Soma\n");
                System.out.print("Digite o 1º Num: ");
                n1 = scan.nextDouble();
                System.out.print("Digite o 2º Num: ");
                n2 = scan.nextDouble();
                ops.soma(n1, n2);
                break;
            case 2: 
                System.out.println("2) Subtracao\n");
                System.out.print("Digite o 1º Num: ");
                n1 = scan.nextDouble();
                System.out.print("Digite o 2º Num: ");
                n2 = scan.nextDouble();
                ops.sub(n1, n2);
                break;
            case 3: 
                System.out.println("3) Multiplicacao\n");
                System.out.print("Digite o 1º Num: ");
                n1 = scan.nextDouble();
                System.out.print("Digite o 2º Num: ");
                n2 = scan.nextDouble();
                ops.mult(n1, n2);
                break;
            case 4: 
                System.out.println("4) Divisao\n");
                System.out.print("Digite o 1º Num: ");
                n1 = scan.nextDouble();
                System.out.print("Digite o 2º Num: ");
                n2 = scan.nextDouble();
                ops.div(n1, n2);
                break;
            case 5: 
                System.out.println("5) Potencia\n");
                System.out.print("Digite o 1º Num: ");
                n1 = scan.nextDouble();
                System.out.print("Digite o 2º Num: ");
                n2 = scan.nextDouble();
                ops.potencia(n1, n2);
                break;
            case 6: 
                System.out.println("6) Raiz Quadrada\n");
                System.out.print("Digite o 1º Num: ");
                n1 = scan.nextDouble();
                ops.raiz(n1);
                break;
            case 7: 
                System.out.println("7) Raiz Cubica\n"+ "");
                System.out.print("Digite o 1º Num: ");
                n1 = scan.nextDouble();
                ops.cubica(n1);
                break;
            default:
                System.out.println("\nOpcao Invalida\n");
                break;
        }
        
    }
    
}
