package carroCorrida;

public class testar {
    public static void main(String[] args) {
        
        jogoFormula1 carro1 = new jogoFormula1("equipe 1", 250);

        carro1.acelerar();
        carro1.acelerar();
        carro1.acelerar();
        carro1.frear();
        carro1.imprimirVelocidadeAtual();
    }
}
