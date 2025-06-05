package exercicioUm;

class Animal{
    String nome;
    
    void fazerSom() {
        System.out.println("Sem animal, sem som!");
    }
}

class Cachorro extends Animal {
    void fazerSom() {
        System.out.println("Latido!");
        
    }
}

class Gato extends Animal {
        void fazerSom(){
            System.out.println("Miau!");
        }   
}

public class ListaRomulo {

    public static void main(String[] args) {
        Animal cachorro = new Cachorro();
        //cachorro.fazerSom();
        
        Animal gato = new Gato();
        //gato.fazerSom();
        
        //Animal animals = new Animal();
        //animals.fazerSom();
        
        System.out.println("-----");
        
         Animal[] animal = {cachorro, gato};
         
         for (Animal i :animal) {
            i.fazerSom();
        }
    }
    
}
