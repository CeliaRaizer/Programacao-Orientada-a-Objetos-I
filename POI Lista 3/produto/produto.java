package produto;

public class produto {

    private String nome;
    private double valor;
    private int quantidade;

    public produto(String nome, double valor, int quantidade) {
        this.nome = nome;
        this.valor = valor;
        this.quantidade = quantidade;
    }

    public void escreverDados(){
        System.out.println("Nome: "+nome);
        System.out.println("Valor: "+valor);
        System.out.println("Quantidade: "+quantidade);
    }

    public double calcularValorTotal(){
        return valor*quantidade;
    }
    public void imprimirValorTotal(){
        System.out.println("O valor total do estoque e: "+valor*quantidade);
    }

    public void alterarQuantidade(float quant){
        quantidade += quant;
        System.out.println("Nova quantidade em estoque: "+quantidade);
    }
    
}
