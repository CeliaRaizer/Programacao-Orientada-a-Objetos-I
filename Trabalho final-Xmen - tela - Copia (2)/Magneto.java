import javax.swing.JOptionPane;

public class Magneto extends Personagem {

    public Magneto() {
        super("Magneto", 115, 40, 10, 5, "Campo Magnético"); // Valores de exemplo
    }

    @Override
    public void usarHabilidadeEspecial(Personagem alvo) {
        if (getHabilidadeEspecialUsada()) {
            JOptionPane.showMessageDialog(null, getNome() + " já usou sua habilidade especial!");
            return;
        }
        
        int dano = (getPoderAtaque() + 20) - alvo.getPoderDefesa(); 
        alvo.receberDano(dano);
        setHabilidadeEspecialUsada(true);

        JOptionPane.showMessageDialog(null, getNome() + " controla o metal ao redor e lança contra " + alvo.getNome() + "!");
        JOptionPane.showMessageDialog(null, getNome() + " causou " + dano + " de dano!");
    }
}
