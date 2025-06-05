package exercicioNove;

class Animal{
    String nome;
    
    void fazerSom() {
        System.out.println("Cada animal faz um diferente!");
    }
}

class Cachorro extends Animal {
    @Override
    void fazerSom() {
        System.out.println("[Metodo Alterado!] | Animal = Cachorro | Som = AuAuu!");
        
    }
}

class Gato extends Animal {
    @Override
        void fazerSom(){
            System.out.println("[Metodo Alterado!] | Animal = Gato | Som = Miaaaaaaau!");
        }   
}

public class usandoPolimorfismo {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal cachorro = new Cachorro();
        Animal gato  = new Gato();
        
        System.out.println("Metodo padrao, sem alteracoes:");
        animal.fazerSom();
        System.out.println("----------");
        cachorro.fazerSom();
        gato.fazerSom();
    }
}
