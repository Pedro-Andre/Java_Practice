package exercicioOito;

public class PessoaeCarro {
public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.ligarCarro();
}
}

class Carro{
    public void ligar() {
        System.out.println("Motor ligado!");
    }
}

class Pessoa{
    private Carro carro;
   
    public Pessoa(){
        this.carro = new Carro ();
    }
   
    public void ligarCarro() {
        carro.ligar();
    }
}