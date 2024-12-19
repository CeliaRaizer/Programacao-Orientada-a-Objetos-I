package carroCorrida;

public class jogoFormula1 {
    private String nomeEquipe;
    private double velocidadeAtual;
    private double velocidadeMaxima;

    public jogoFormula1(String nomeEquipe, double velocidadeMaxima) {
        this.nomeEquipe = nomeEquipe;
        this.velocidadeMaxima = velocidadeMaxima;
        this.velocidadeAtual = 0;  
    }

    public void acelerar(){
        if(velocidadeAtual + 5 <= velocidadeMaxima){
            velocidadeAtual+=5;
        }else{
            velocidadeAtual=velocidadeMaxima;
        }
    }
    public void frear(){
        velocidadeAtual-=10;
    }
    public void imprimirVelocidadeAtual(){
        System.out.println("Velocidade Atual: "+velocidadeAtual);
    }
}
