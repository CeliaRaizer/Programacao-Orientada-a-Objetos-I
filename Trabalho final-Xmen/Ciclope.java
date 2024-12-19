import javax.swing.JOptionPane;

public class Ciclope extends Personagem {

    public Ciclope() {
        super("Ciclope", 100, 35, 10, 20, "Raios Opticos");
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
        JOptionPane.showMessageDialog(null, alvo.getNome() + " recebeu " + danoEspecial + " de dano diretamente!");
    }
}
