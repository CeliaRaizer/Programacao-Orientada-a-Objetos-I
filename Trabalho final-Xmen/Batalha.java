import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

public class Batalha {

    public void iniciarBatalha(Exercito exercito1, Exercito exercito2) {
        JOptionPane.showMessageDialog(null, "Iniciando batalha entre " + exercito1.getNome() + " e " + exercito2.getNome() + "!");

        while (true) {
            List<Personagem> turnos = combinarTurnosAlternados(exercito1, exercito2);

            for (Personagem personagem : turnos) {
                Exercito aliado = exercito1.getMembros().contains(personagem) ? exercito1 : exercito2;
                Exercito inimigo = aliado == exercito1 ? exercito2 : exercito1;

                if (inimigo.todosDerrotados()) {
                    JOptionPane.showMessageDialog(null, "Todos os membros do " + inimigo.getNome() + " foram derrotados!");
                    verificarVencedor(exercito1, exercito2);
                    return;
                }

                String mensagem = "Turno de " + personagem.getNome() + " do exército " + aliado.getNome();
                JOptionPane.showMessageDialog(null, mensagem);
                aliado.escolherAcao(personagem, inimigo);

                if (inimigo.todosDerrotados()) {
                    JOptionPane.showMessageDialog(null, "Todos os membros do " + inimigo.getNome() + " foram derrotados!");
                    verificarVencedor(exercito1, exercito2);
                    return;
                }
            }
        }
    }

    private List<Personagem> combinarTurnosAlternados(Exercito exercito1, Exercito exercito2) {
        List<Personagem> vivos1 = exercito1.getMembrosVivos();
        List<Personagem> vivos2 = exercito2.getMembrosVivos();

        // Ordenar por velocidade
        vivos1.sort(Comparator.comparingInt(Personagem::getVelocidade).reversed());
        vivos2.sort(Comparator.comparingInt(Personagem::getVelocidade).reversed());

        // Combinar turnos alternados
        List<Personagem> turnos = new ArrayList<>();
        int i = 0, j = 0;

        while (i < vivos1.size() || j < vivos2.size()) {
            if (i < vivos1.size()) turnos.add(vivos1.get(i++));
            if (j < vivos2.size()) turnos.add(vivos2.get(j++));
        }

        return turnos;
    }

    private void verificarVencedor(Exercito exercito1, Exercito exercito2) {
        if (exercito1.getMembrosVivos().isEmpty()) {
            mostrarImagemVencedor(exercito2.getNome(), "C:\\Users\\celia\\OneDrive\\Documentos\\Trabalho final-Xmen - tela - Copia (2)\\0665d1e5f0b49f716113c0f81371c6dc.jpg");
        } else if (exercito2.getMembrosVivos().isEmpty()) {
            mostrarImagemVencedor(exercito1.getNome(), "C:\\Users\\celia\\OneDrive\\Documentos\\Trabalho final-Xmen - tela - Copia (2)\\Imagem do WhatsApp de 2024-10-23 à(s) 19.18.53_9d3343eb.jpg");
        }
    }

    private void mostrarImagemVencedor(String nomeExercito, String caminhoImagem) {
        ImageIcon icone = new ImageIcon(caminhoImagem);
        Image imagemOriginal = icone.getImage();
        Image imagemRedimensionada = imagemOriginal.getScaledInstance(400, 400, Image.SCALE_SMOOTH); // Ajuste o tamanho aqui
        ImageIcon iconeRedimensionado = new ImageIcon(imagemRedimensionada);

        JOptionPane.showMessageDialog(null, nomeExercito + " venceu a batalha!", "Vencedor", JOptionPane.INFORMATION_MESSAGE, iconeRedimensionado);
    }
}
