import javax.swing.JOptionPane;

public class Mistica extends Personagem {

    public Mistica() {
        super("Mística", 90, 40, 7, 10, "Invisibilidade"); // Valores iniciais: nome, vida, ataque, defesa, velocidade
    }

    // Implementação da habilidade especial
    @Override
    public void usarHabilidadeEspecial(Personagem alvo) {
        if (getHabilidadeEspecialUsada()) {
            JOptionPane.showMessageDialog(null, getNome() + " já usou sua habilidade especial e não pode usar novamente.");
            return;
        }

        int dano = (getPoderAtaque() + 10) - alvo.getPoderDefesa();
        alvo.receberDano(dano);
        setHabilidadeEspecialUsada(true);

        JOptionPane.showMessageDialog(null, getNome() + " usou sua habilidade especial: " + getHabilidadeEspecial());
        JOptionPane.showMessageDialog(null, getNome() + " está invisível e causou " + dano + " de dano!");
    }
}
