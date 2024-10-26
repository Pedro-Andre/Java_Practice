package lista.cinco.e.seis;
import java.util.Random;

public class Ex_1 {
    public static void main(String[] args) {
     Random rand = new Random();
	
     int i;
	int vet[] = new int[10];
	
	System.out.println("\t\t\t VETOR ");
	
	for (i = 0; i < 10; i++) {
		vet[i] = rand.nextInt(10);
		
		System.out.printf("\nO numero: %d, esta na posicao: %d\n", vet[i], i);
    }
    
}
}
