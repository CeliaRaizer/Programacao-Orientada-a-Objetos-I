import javax.swing.JOptionPane;

public class Avalanche extends Personagem {

    public Avalanche() {
        super("Avalanche", 100, 30, 9, 15, "Terremoto");
    }

    @Override
    public void usarHabilidadeEspecial(Personagem alvo) {
        if (getHabilidadeEspecialUsada()) {
            JOptionPane.showMessageDialog(null, getNome() + " já usou sua habilidade especial e não pode usar novamente.");
            return;
        }

        int danoEspecial = 50 - alvo.getPoderDefesa();
        alvo.receberDano(danoEspecial);

        setHabilidadeEspecialUsada(true);

        JOptionPane.showMessageDialog(null, getNome() + " usou sua habilidade especial: " + getHabilidadeEspecial());
        JOptionPane.showMessageDialog(null, alvo.getNome() + " recebeu " + danoEspecial + " de dano.");
    }
}
