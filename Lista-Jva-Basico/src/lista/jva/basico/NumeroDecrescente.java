package lista.jva.basico;

public class NumeroDecrescente {
    public void PrintOrdem(int num) {
            System.out.print("Ordem Decrescente: " );
        for (int i = num; i >= 0; i--) System.out.print(i + ", ");
    }
    
    public static void main(String[] args) {
        NumeroDecrescente ordem = new NumeroDecrescente();
        
        ordem.PrintOrdem(10);
    }
}
