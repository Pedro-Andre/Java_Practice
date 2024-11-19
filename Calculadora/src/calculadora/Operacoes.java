package calculadora;

public class Operacoes {
    public Operacoes() {};
    
    public void soma(double n1, double n2) {
        System.out.printf("\nResultado: " + (n1+n2) + "\n");
    }
    public void sub(double n1, double n2) {
        System.out.printf("\nResultado: " + (n1-n2)+ "\n");
    }
    public void mult(double n1, double n2) {
        System.out.printf("\nResultado: " + (n1*n2)+ "\n");
    }
    public void div(double n1, double n2) {
        try {
        if (n2 == 0) throw new ArithmeticException("ERRO!! NAO E POSSIVEL DIVIDIR POR 0!!");
        System.out.printf("\nResultado: " + (n1/n2)+ "\n");
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
    }
    public void potencia(double n1, double n2) {
        System.out.printf("\nResultado: " + Math.pow(n1,n2)+ "\n");
    }
    public void raiz(double n1) {
        try {
            if (n1 <= 0) throw new ArithmeticException("ERRO!! VALOR MENOR OU IGUAL 0!!");
            System.out.printf("\nResultado: " + Math.sqrt(n1) + "\n");
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    public void cubica(double n1) {
        System.out.printf("\nResultado: " + Math.cbrt(n1) + "\n");
    }
}
