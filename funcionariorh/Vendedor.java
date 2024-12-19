public class Vendedor extends Funcionario {
    private double totalVendas;
    private double percentualComissao;

    public Vendedor(String n, String cpf, double salario, double vendas){
        super(n, cpf, salario);
        this.totalVendas = vendas;
        this.percentualComissao = 0.05;
    }

    @Override
    public double calcularSalario() {
        return salarioBase * (1-IMPOSTO)+ (totalVendas*percentualComissao);
    }
}
