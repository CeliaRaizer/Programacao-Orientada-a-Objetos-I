import javax.swing.JOptionPane;

public class Mercurio extends Personagem {

    public Mercurio() {
        super("Mercurio", 100, 36, 15, 35, "Desvio Sônico"); // Vida, Poder de Ataque, Poder de Defesa, Velocidade
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
        
        JOptionPane.showMessageDialog(null, getNome() + " usa Desvio Sônico e causou " + dano + " de dano!");
    }
}
