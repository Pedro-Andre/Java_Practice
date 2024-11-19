package lista.jva.basico;

public class atvContato {

    // Classe Contato
    public static class Contato {
        private String nome;
        private String email;

        public Contato(String nome, String email) {
            this.nome = nome;
            this.email = email;
        }

        public String getNome() {
            return nome;
        }

        public String getEmail() {
            return email;
        }

        @Override
        public String toString() {
            return "Nome: " + nome + ", Email: " + email;
        }
    }

    // Classe Agenda
    public static class Agenda {
        private Contato[] contatos;

        public Agenda(int tamanho) {
            this.contatos = new Contato[tamanho];
        }

        public boolean adicionarContato(Contato contato) {
            for (int i = 0; i < contatos.length; i++) {
                if (contatos[i] == null) {
                    contatos[i] = contato;
                    System.out.println("Contato adicionado com sucesso.\n");
                    return true;
                }
            }
            System.out.println("Agenda cheia. Não foi possível adicionar o contato.\n");
            return false; 
        }

        public Contato buscarContato(String nome) {
            for (Contato contato : contatos) {
                if (contato != null && contato.getNome().equalsIgnoreCase(nome)) {
                    return contato; 
                }
            }
            System.out.println("Contato nao encontrado.\n");
            return null;
        }

        public boolean excluirContato(String nome) {
            for (int i = 0; i < contatos.length; i++) {
                if (contatos[i] != null && contatos[i].getNome().equalsIgnoreCase(nome)) {
                    contatos[i] = null;
                    System.out.println("Contato removido com sucesso.\n");
                    return true;
                }
            }
            System.out.println("Contato nao encontrado.");
            return false; 
        }

        public void listarContatos() {
            for (Contato contato : contatos) {
                if (contato != null) {
                    System.out.println(contato);
                }
            }
        }
    }

    
    public static void main(String[] args) {
        Agenda agenda = new Agenda(5);

        agenda.adicionarContato(new Contato("Amanda", "amanda@gmal.com\n"));
        agenda.adicionarContato(new Contato("Isadora", "isadora@gmal.com\n"));

        Contato contatoBuscado = agenda.buscarContato("Amanda\n");
        if (contatoBuscado != null) {
            System.out.println("Contato encontrado: " + contatoBuscado + "\n");
        }

        System.out.println("Contatos na agenda: " + "\n");
        agenda.listarContatos();

        agenda.excluirContato("Isadora");

        System.out.println("Contatos na agenda apos exclusao: \n" );
        agenda.listarContatos();
    }
}
