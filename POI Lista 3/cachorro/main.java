package cachorro;

public class main {
    public static void main(String[] args) {
        cachorro cachorro1 = new cachorro("Pitoco", 2, "Buldogue");

        cachorro1.latir();
        cachorro1.correr();
        cachorro1.comer(10);
        cachorro1.imprimirPeso();
    }
    
}
