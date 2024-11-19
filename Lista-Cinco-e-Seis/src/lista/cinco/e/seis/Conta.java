package lista.cinco.e.seis;

public class Conta {
    double saldo;
    
    boolean sacar(double valor) {
        if (saldo<valor) {
            return false;
        } else {
        saldo-=valor;
        return true;
    }
    }
}
