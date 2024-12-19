public class Principal {
    public static void main(String[] args) {

        Vendedor v01 = new Vendedor("Logan", "07654334545", 2500, 14000);
        System.out.println(v01.calcularSalario());

        Gerente g01 = new Gerente("Celia", "07645761946", 5000, 80);
        System.out.println(g01.calcularSalario());

        Diretor d01 = new Diretor("Fabio Pinheiro", "00099956787", 25000);
        System.out.println(d01.calcularSalario());

        FolhaPagamento Fp = new FolhaPagamento();
        Fp.inserirFuncionario(d01);
        Fp.inserirFuncionario(g01);
        Fp.inserirFuncionario(v01);

        Fp.calcularFolha();
    }


}
