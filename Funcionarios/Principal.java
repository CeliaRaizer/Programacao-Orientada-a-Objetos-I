public class Principal {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Maria", 1200);
        System.out.println(f1.toString());

        Diretor d1 = new Diretor("Pedro", 3000, 50);
        System.out.println(d1.toString());

        Gerente g1 = new Gerente("TI", 4000, "João");
        System.out.println(g1.toString());

        Vendedor v1 = new Vendedor("Ana", 1200, 20);
        System.out.println(v1.toString());
    }
}
