package exercicioTres;

class Professor {
    void darOrientacao() {
        System.out.println("Para saber sua nota, voce deve entrar na plataforma e procurar a materia desejada.");
    }
    
}

class AlunoX {
    private Professor professor;
    
    AlunoX(Professor professor) {
        this.professor = professor;
    }
    void recebeOrientacao() {
        professor.darOrientacao();
    }
}

public class Aluno {
    public static void main(String[] args) {
        Professor professor = new Professor();
        
        AlunoX aluno = new AlunoX(professor);
        
        aluno.recebeOrientacao();
        
    }
}
