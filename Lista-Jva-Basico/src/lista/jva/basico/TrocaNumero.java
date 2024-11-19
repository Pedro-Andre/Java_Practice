package lista.jva.basico;

public class TrocaNumero {
    
    public void replaceNums(int numA, int numB) {
        System.out.println("Antes da Troca\nNumA: " + numA + "\nNumB: " + numB);
        int temp = numA;
        numA = numB;
        numB = temp;
        
        System.out.println("Depois da Troca\nNumA: " + numA + "\nNumB: " + numB);
    }
    
    public static void main(String[] atgs) {
        TrocaNumero troca = new TrocaNumero();
           troca.replaceNums(5,9);
    }
}
