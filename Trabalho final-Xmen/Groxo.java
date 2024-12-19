import javax.swing.JOptionPane;

public class Groxo extends Personagem {

    public Groxo() {
        super("Groxo", 90, 28, 18, 20, "Saliva Tóxica");
    }

    @Override
    public void usarHabilidadeEspecial(Personagem alvo) {
        if (getHabilidadeEspecialUsada()) {
            JOptionPane.showMessageDialog(null, getNome() + " já usou sua habilidade especial!");
            return;
        }

        // Ignora o poder de defesa do inimigo
        int dano = getPoderAtaque() + 15;
        alvo.receberDano(dano);

        setHabilidadeEspecialUsada(true);

        JOptionPane.showMessageDialog(null, getNome() + " usa " + getHabilidadeEspecial() + " em " + alvo.getNome() + "!");
        JOptionPane.showMessageDialog(null, getNome() + " causou " + dano + " de dano com " + getHabilidadeEspecial() + "!");
       
    }
}
