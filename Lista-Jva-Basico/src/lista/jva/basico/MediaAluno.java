package lista.jva.basico;

public class MediaAluno {

    public void notasAluno(int notas[]) {
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] < 0 || notas[i] > 100) {
                System.out.println("Nota INVALIDA: " + notas[i] + " | Valor abaixo de 0 ou acima de 100!!");
            } else {
            System.out.println("Nota: " + notas[i]);
            }
        }
    };
    
    public double calcMedia(int notas[]) {
        double soma = 0;
        int cont = 0;
        
        for(int i = 0; i < notas.length; i++){
            if (notas[i] >=0 && notas[i]<= 100)  {
                soma += notas[i];
                cont++;
            }   
        }
        
        return soma / cont;
    }
    
    public static void main(String[] args) {
        MediaAluno alunoNotas = new MediaAluno();
        
        int[] notas = {34, 31, 56, 53, 45, -10, 122};
        
        alunoNotas.notasAluno(notas);
        
        double media = alunoNotas.calcMedia(notas);
        System.out.println("\nMedia das notas validas: " + media+"\n");
    }
}
