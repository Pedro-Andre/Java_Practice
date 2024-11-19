package lista.jva.basico;

public class MultiplicaeSoma {
    
    public void SomaImpar(int limit) {
        int result = 0;
        for(int i = 1; i <= limit; i++) {
            if (i % 2 != 0) {
                result += i;
            }   
        }
            System.out.println("Resultado Soma Impares: " + result);
    }
    
    public void MultPar(int limit) {
        long result = 1;
        for(int i = 1; i <= limit; i++) {
            if (i % 2 == 0) {
                result *= i;
            }   
        }
            System.out.println("Resultado Mult Pares: " + result);
    }
    
    public static void main(String[] args) {
        MultiplicaeSoma calc = new MultiplicaeSoma();
        calc.SomaImpar(30);
        calc.MultPar(30);
    }
}
