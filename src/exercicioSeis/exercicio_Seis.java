package exercicioSeis;

public class exercicio_Seis {
/**
  
EXERCICIO 6

----(Associação)---- 

Existem 3 tipos de associação:

Simples;

public class Professor {
    String nome;
}

public class Aluno {
     Professor professor;
}

•	É como dizer que duas coisas estão ligadas, mas ainda são independentes, existem sem um ao outro.


(Agregação)

public class Departamento {
    List professores;
} 

•	O departamento consegue existir sem professores e vice-versa


(Bidirecional)

public class Aluno {
    Professor professor;
}

public class Professor {
    List alunos;
}

•	Um pai sabe quem é seu filho, e o filho sabe quem é seu pai. Os dois se conhecem e isso seria a associação bidirecional

(Composição)

public class Universidade {
 private Departamento departamento = new Departamento();
} 

•	O departamento não existe sem a universidade mas a universidade existe sem o departamento

----(Dependência simples)----

public class Relatorio { 
    public void gerar(Calculadora calculadora) {
        int soma = calculadora.somar(2, 3); 
        System.out.println("Resultado: " + soma); } 
    }
•	Uma classe depende de outra quando usa seus métodos ou instâncias temporariamente
 
 */
    
}
