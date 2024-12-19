package produto;

public class produtomain {
    public static void main(String[] args) {
        produto produto1 = new produto("cafe", 10, 100);

        produto1.escreverDados();
        produto1.alterarQuantidade(-50);
        produto1.calcularValorTotal();
        produto1.imprimirValorTotal();
    }
}
