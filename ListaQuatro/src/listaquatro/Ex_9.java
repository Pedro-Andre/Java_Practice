import java.util.Scanner;
public class Ex_9 { 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int opt = 0;
        double velo, veloKm, veloMs;
        
        
      while (opt != 3) {
            System.out.println("\nEscolha o tipo de conversao:");
            System.out.println("1 = Km/h -> M/s | 2 = M/s -> Km/h | 3 = Encerra");
            opt = scan.nextInt();
            
            if (opt == 1) {
                System.out.println("(Km/h -> M/s)");
                System.out.print("Digite a velocidade (em Km/h): ");
                veloKm = scan.nextDouble();
                
                velo = veloKm / 3.6;
                
                System.out.printf("Velocidade convertida para M/s: %.2f M/s \n", velo);
            }
            
            if (opt == 2) {
                System.out.println("(M/s -> Km/h)");
                System.out.print("Digite a velocidade (em M/s): ");
                veloMs = scan.nextDouble();
                
                velo = veloMs * 3.6;
                
                System.out.printf("Velocidade convertida para Km/h: %.2f Km/h \n", velo);
            }
            
            if (opt == 3) System.out.println("\nEncerrado...");

           
            
        } 
    }
}