import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Jogo {
    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null, "Bem-vindo ao Jogo dos Mutantes!", "Jogo dos Mutantes", JOptionPane.INFORMATION_MESSAGE);
        
        ImageIcon imagemXMen = new ImageIcon("C:\\Users\\celia\\OneDrive\\Documentos\\Trabalho final-Xmen - tela - Copia (2)\\Imagem do WhatsApp de 2024-10-23 à(s) 19.18.53_9d3343eb.jpg");
        Image imgXMen = imagemXMen.getImage().getScaledInstance(400, 400, Image.SCALE_SMOOTH);  
        imagemXMen = new ImageIcon(imgXMen);  
        JOptionPane.showMessageDialog(null, "Equipe X-Men", "X-Men", JOptionPane.INFORMATION_MESSAGE, imagemXMen);
        
        ImageIcon imagemIrmandade = new ImageIcon("C:\\Users\\celia\\OneDrive\\Documentos\\Trabalho final-Xmen - tela - Copia (2)\\0665d1e5f0b49f716113c0f81371c6dc.jpg");
        Image imgIrmandade = imagemIrmandade.getImage().getScaledInstance(400, 400, Image.SCALE_SMOOTH);  // Redimensionar imagem
        imagemIrmandade = new ImageIcon(imgIrmandade);  
        JOptionPane.showMessageDialog(null, "Equipe Irmandade", "Irmandade", JOptionPane.INFORMATION_MESSAGE, imagemIrmandade);
        
        String[] opcoes = {"1- Jogo 2x2", "2- Jogo Exército Completo"};
        int opcao = JOptionPane.showOptionDialog(null, 
            "Escolha uma opção de jogo:", 
            "Menu de Jogo", JOptionPane.DEFAULT_OPTION, 
            JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);

        if (opcao == 0) {
            jogo2x2();
        } else if (opcao == 1) {
            jogoExercitoCompleto();
        } else {
            JOptionPane.showMessageDialog(null, "Opção inválida");
        }
    }

    public static void jogo2x2() {
        
        JOptionPane.showMessageDialog(null, "Jogador 1, escolha seus dois personagens dos X-Men:");
        Personagem[] jogador1 = new Personagem[2];
        for (int i = 0; i < 2; i++) {
            String[] opcoesXMen = {"Ciclope", "Jean Grey", "Vampira", "Noturno", "Tempestade"};
            int escolha = JOptionPane.showOptionDialog(null, 
                "Escolha o personagem " + (i + 1) + ":", "Escolher Personagem",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoesXMen, opcoesXMen[0]);

            Personagem personagemEscolhido = escolherPersonagem(escolha + 1, "X-Men");

            while (personagemEscolhido.equals(jogador1[0]) || personagemEscolhido.equals(jogador1[1])) {
                JOptionPane.showMessageDialog(null, "Você já escolheu esse personagem! Escolha outro.");
                escolha = JOptionPane.showOptionDialog(null, 
                    "Escolha o personagem " + (i + 1) + ":", "Escolher Personagem",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoesXMen, opcoesXMen[0]);
                personagemEscolhido = escolherPersonagem(escolha + 1, "X-Men");
            }

            jogador1[i] = personagemEscolhido;
        }

        JOptionPane.showMessageDialog(null, "Jogador 2, escolha seus dois personagens da Irmandade:");
        Personagem[] jogador2 = new Personagem[2];
        for (int i = 0; i < 2; i++) {
            String[] opcoesIrmandade = {"Magneto", "Mistica", "Mercurio", "Avalanche", "Groxo"};
            int escolha = JOptionPane.showOptionDialog(null, 
                "Escolha o personagem " + (i + 1) + ":", "Escolher Personagem",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoesIrmandade, opcoesIrmandade[0]);

            Personagem personagemEscolhido = escolherPersonagem(escolha + 1, "Irmandade");

            while (personagemEscolhido.equals(jogador2[0]) || personagemEscolhido.equals(jogador2[1])) {
                JOptionPane.showMessageDialog(null, "Você já escolheu esse personagem! Escolha outro.");
                escolha = JOptionPane.showOptionDialog(null, 
                    "Escolha o personagem " + (i + 1) + ":", "Escolher Personagem",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoesIrmandade, opcoesIrmandade[0]);
                personagemEscolhido = escolherPersonagem(escolha + 1, "Irmandade");
            }

            jogador2[i] = personagemEscolhido;
        }

        Exercito exercito1 = new Exercito("Jogador 1 - X-Men");
        Exercito exercito2 = new Exercito("Jogador 2 - Irmandade");
        
        for (Personagem p : jogador1) {
            exercito1.adicionarPersonagem(p);
        }
        for (Personagem p : jogador2) {
            exercito2.adicionarPersonagem(p);
        }

        JOptionPane.showMessageDialog(null, "Personagens escolhidos! A batalha vai começar!");
        new Batalha().iniciarBatalha(exercito1, exercito2);
    }

    public static void jogoExercitoCompleto() {

        JOptionPane.showMessageDialog(null, "Iniciando o Jogo Exército Completo...");
        
        Personagem[] exercitoXMen = {
            new Ciclope(), new JeanGrey(), new Vampira(), new Noturno(), new Tempestade()
        };
        Personagem[] exercitoIrmandade = {
            new Magneto(), new Mistica(), new Mercurio(), new Avalanche(), new Groxo()
        };

        Exercito exercito1 = new Exercito("X-Men");
        Exercito exercito2 = new Exercito("Irmandade");

        for (Personagem p : exercitoXMen) {
            exercito1.adicionarPersonagem(p);
        }
        for (Personagem p : exercitoIrmandade) {
            exercito2.adicionarPersonagem(p);
        }

        new Batalha().iniciarBatalha(exercito1, exercito2);
    }

    public static Personagem escolherPersonagem(int escolha, String equipe) {
        switch (escolha) {
            case 1:
                return equipe.equals("X-Men") ? new Ciclope() : new Magneto();
            case 2:
                return equipe.equals("X-Men") ? new JeanGrey() : new Mistica();
            case 3:
                return equipe.equals("X-Men") ? new Vampira() : new Mercurio();
            case 4:
                return equipe.equals("X-Men") ? new Noturno() : new Avalanche();
            case 5:
                return equipe.equals("X-Men") ? new Tempestade() : new Groxo();
            default:
                JOptionPane.showMessageDialog(null, "Escolha inválida! Selecionando o primeiro personagem por padrão.");
                return equipe.equals("X-Men") ? new Ciclope() : new Magneto();
        }
    }
}
