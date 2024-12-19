import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Exercito {
    private String nome;
    private List<Personagem> membros;

    public Exercito(String nome) {
        this.nome = nome;
        this.membros = new ArrayList<>();
    }

    public void adicionarPersonagem(Personagem personagem) {
        membros.add(personagem);
    }

    public void escolherAcao(Personagem personagem, Exercito exercitoAdversario) {
       
        if (personagem.getVida() <= 0) {
            JOptionPane.showMessageDialog(null, personagem.getNome() + " está derrotado e não pode agir!");
            return;
        }

        String[] opcoes = {"Atacar", "Usar Habilidade Especial", "Defender"};
        int escolha = JOptionPane.showOptionDialog(null, 
                "Escolha uma ação para " + personagem.getNome(), 
                "Escolher Ação", 
                JOptionPane.DEFAULT_OPTION, 
                JOptionPane.INFORMATION_MESSAGE, 
                null, 
                opcoes, 
                opcoes[0]);

        if (escolha == 0) { // Atacar
            Personagem alvo = escolherAlvo(exercitoAdversario);
            if (alvo != null) {
                personagem.atacar(alvo);
            }
        } else if (escolha == 1) { // Usar habilidade especial
            if (!personagem.getHabilidadeEspecialUsada()) {
                Personagem alvoHabilidade = escolherAlvo(exercitoAdversario);
                if (alvoHabilidade != null) {
                    personagem.usarHabilidadeEspecial(alvoHabilidade);
                }
            } else {
                JOptionPane.showMessageDialog(null, personagem.getNome() + " já usou sua habilidade especial.");
                escolherAcao(personagem, exercitoAdversario);
            }
        } else if (escolha == 2) { // Defender
            personagem.defender();
        } else { 
            JOptionPane.showMessageDialog(null, "Opção inválida.");
            escolherAcao(personagem, exercitoAdversario); // Recurso para corrigir a escolha
        }
    }

    private Personagem escolherAlvo(Exercito exercitoAdversario) {
        List<Personagem> membrosVivos = exercitoAdversario.getMembrosVivos();
        if (membrosVivos.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Todos os membros do exército adversário estão derrotados!");
            return null;
        }

        String[] opcoes = new String[membrosVivos.size()];
        for (int i = 0; i < membrosVivos.size(); i++) {
            Personagem membro = membrosVivos.get(i);
            opcoes[i] = membro.getNome() + " - Vida: " + membro.getVida();
        }

        int escolha = JOptionPane.showOptionDialog(null, 
                "Escolha um alvo:", 
                "Escolher Alvo", 
                JOptionPane.DEFAULT_OPTION, 
                JOptionPane.INFORMATION_MESSAGE, 
                null, 
                opcoes, 
                opcoes[0]);

        if (escolha >= 0 && escolha < membrosVivos.size()) {
            return membrosVivos.get(escolha);
        } else {
            JOptionPane.showMessageDialog(null, "Escolha inválida.");
            return escolherAlvo(exercitoAdversario);
        }
    }

    public List<Personagem> getMembrosVivos() {
        List<Personagem> vivos = new ArrayList<>();
        for (Personagem membro : membros) {
            if (membro.getVida() > 0) {
                vivos.add(membro);
            }
        }
        return vivos;
    }
    
    public boolean todosDerrotados() {
        for (Personagem membro : membros) {
            if (membro.getVida() > 0) {
                return false;
            }
        }
        return true;
    }

    public String getNome() {
        return nome;
    }

    public List<Personagem> getMembros() {
        return membros;
    }
}
