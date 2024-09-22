import java.util.Scanner;

public class Ex_12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int alunos = 0, cont = 0, i = 0;
        double n1, n2, n3, media;
        
        System.out.println("    Digite as notas dos Alunos (10 Alunos)");
        
        do {
            
            System.out.printf("\nAluno %d: \n", alunos+1);
            System.out.printf("Nota %d: ", i+=1);
            n1 = scan.nextDouble();
            
            System.out.printf("Nota %d: ", i+=1);
            n2 = scan.nextDouble();
            
            System.out.printf("Nota %d: ", i+=1);
            n3 = scan.nextDouble();
            i = 0;
            
            media = (n1 + n2 + n3) / 3;
            System.out.printf("Media do Aluno %d: %.2f\n", alunos+1, media);
            
            alunos++;
            cont++;
            
        } while (cont < 10);
        
    }
}
