import javax.swing.JOptionPane;

public class JeanGrey extends Personagem {

    public JeanGrey() {
        super("Jean Grey", 90, 35, 9, 14, "Explosão psiônica");
    }

    @Override
    public void usarHabilidadeEspecial(Personagem alvo) {
        if (getHabilidadeEspecialUsada()) {
            JOptionPane.showMessageDialog(null, getNome() + " já usou sua habilidade especial e não pode usar novamente.");
            return;
        }

        // ignorando defesa
        int danoEspecial = 45;
        alvo.receberDano(danoEspecial);

        setHabilidadeEspecialUsada(true);

        JOptionPane.showMessageDialog(null, getNome() + " usou sua habilidade especial: " + getHabilidadeEspecial());
        JOptionPane.showMessageDialog(null, alvo.getNome() + " recebeu " + danoEspecial + " de dano diretamente.");
    }
}
