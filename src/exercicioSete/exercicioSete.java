package exercicioSete;

import java.util.ArrayList;
import java.util.List;

public class exercicioSete {
    String nome;
    List<Professor> professores;

    public exercicioSete(String nome) {
        this.nome = nome;
        this.professores = new ArrayList<>();
    }

    public void adicionarProfessor(Professor professor) {
        professores.add(professor);
    }

    public void removerProfessor(Professor professor) {
        professores.remove(professor);
    }
}

class Professor {
    String nome;

    public Professor(String nome) {
        this.nome = nome;
    }
}
