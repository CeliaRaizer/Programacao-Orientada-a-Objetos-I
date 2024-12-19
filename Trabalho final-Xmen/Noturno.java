import javax.swing.JOptionPane;

public class Noturno extends Personagem {

    public Noturno() {
        super("Noturno", 100, 25, 15, 25, "Calda Preênsil");    
    }

    @Override
    public void usarHabilidadeEspecial(Personagem alvo) {
        if (getHabilidadeEspecialUsada()) {
            JOptionPane.showMessageDialog(null, getNome() + " já usou sua habilidade especial e não pode usar novamente.");
            return;
        }

        int danoEspecial = 40 - alvo.getPoderDefesa();
        alvo.receberDano(danoEspecial);
        setHabilidadeEspecialUsada(true);

        JOptionPane.showMessageDialog(null, getNome() + " usou sua habilidade especial: " + getHabilidadeEspecial());
        JOptionPane.showMessageDialog(null, alvo.getNome() + " recebeu " + danoEspecial + " de dano!");
    }
}
