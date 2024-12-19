public class Main {
    public static void main(String[] args) {
        Agenda a1 = new Agenda();

        Contato contato1 = new Contato("Celia");
        contato1.adicionarTelefone(new Telefone("49933001500", "Casa"));
        contato1.adicionarEmail(new Email("Celia@gmail", "Pessoal"));

        Contato contato2 = new Contato("Luciana");
        contato2.adicionarTelefone(new Telefone("49999999999", "Casa"));
        contato2.adicionarEmail(new Email("Luciana@gmail.com", "Pessoal"));

       a1.adicionarContato(contato1);
       a1.adicionarContato(contato2);

       a1.listarContatos();

       a1.removerContato("Celia");

       a1.listarContatos();

    }
}
