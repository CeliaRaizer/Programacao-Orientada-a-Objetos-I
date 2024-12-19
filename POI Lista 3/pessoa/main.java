package pessoa;

public class main {
    public static void main(String[] args) {
        pessoa pessoa1 = new pessoa("Celia", 1, 2006);
        pessoa pessoa2 = new pessoa("Lucas", 2, 2002);

        pessoa1.comprimentar();
        pessoa1.calcularIdade();

        pessoa2.comprimentar();
        pessoa2.calcularIdade();
    }
    
}
