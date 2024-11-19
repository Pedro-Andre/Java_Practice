package lista.jva.basico;

public class MaiorNum {
    public void printNum(int n1, int n2) {
        if (n1 > n2) System.out.println("O maior numero e: " + n1);
        else if (n2 > n1) System.out.println("O maior numero e: " + n2);
        else System.out.println("Os numermos sao iguais: " + n1 + "," + n2);
    }
    
    public static void main(String[] args ){
        MaiorNum maior = new MaiorNum();
        
        maior.printNum(2,33);
        maior.printNum(22,3);
        maior.printNum(3,3);
    }
    
}
