import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<Contato> contatos;

    public Agenda(){
        this.contatos = new ArrayList<>();
    }

    public void adicionarContato(Contato contato){
        contatos.add(contato);
    }
    
    public void removerContato(String nome) {
        contatos.removeIf(contato -> contato.getNome().equals(nome));
    }

    public void listarContatos(){
        for (Contato contato : contatos) {
            System.out.println(contato);
        }
    }
}
