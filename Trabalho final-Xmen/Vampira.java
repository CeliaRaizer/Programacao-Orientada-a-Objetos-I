import javax.swing.JOptionPane;

public class Vampira extends Personagem {

    public Vampira() {
        super("Vampira", 110, 35, 10, 10, "Roubo de poder");
    }

    @Override
    public void usarHabilidadeEspecial(Personagem alvo) {
        if (getHabilidadeEspecialUsada()) {
            JOptionPane.showMessageDialog(null, getNome() + " já usou sua habilidade especial!");
            return;
        }
        
        int dano = alvo.getPoderAtaque();
        alvo.receberDano(dano);
        setHabilidadeEspecialUsada(true);

        JOptionPane.showMessageDialog(null, getNome() + " roubou o poder de " + alvo.getNome() + "!");
        JOptionPane.showMessageDialog(null, getNome() + " causou dano de " + dano + "!");
    }
}
