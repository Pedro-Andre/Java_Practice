package lista.jva.basico;

public class ComparaNumero {
    public void getNumbers(int n1, int n2) {
        int maior =0, menor = 9999;
        
        //compara
        if(n1 == n2)  System.out.println("Os numeros: " + n1 + " e " + n2 + " Sao iguais.\n");
        if (n1 != n2) System.out.println("Os numeros: " + n1 + " e " + n2 + " Sao diferentes.\n");
            
        //maior e menor
        if(n1 > n2) System.out.println("N1: " + n1 + " e maior que N2: " + n2);
        
            if(n2 > n1) System.out.println("N2: " + n2 + " e maior que N1: " + n1);
    }
    
    
    
    public static void main(String[] args ){
        ComparaNumero printando = new ComparaNumero();
        printando.getNumbers    (44,77);
    }
}
