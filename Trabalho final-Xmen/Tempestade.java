import javax.swing.JOptionPane;

public class Tempestade extends Personagem {

    public Tempestade() {
        super("Tempestade", 110, 40, 8, 15, "Ataque Climático"); 
    }

    @Override
    public void usarHabilidadeEspecial(Personagem alvo) {
        if (getHabilidadeEspecialUsada()) {
            JOptionPane.showMessageDialog(null, getNome() + " já usou sua habilidade especial!");
            return;
        }

        JOptionPane.showMessageDialog(null, getNome() + " invoca um Ataque Climático contra " + alvo.getNome() + "!");

        // ignora poder defesa
        int dano = getPoderAtaque() + 20;
        alvo.receberDano(dano);
        setHabilidadeEspecialUsada(true);

        JOptionPane.showMessageDialog(null, getNome() + " causou " + dano + " de dano com o Ataque Climático!");
    }
}
