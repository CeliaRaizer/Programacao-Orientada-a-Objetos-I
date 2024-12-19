public class Diretor extends Funcionario {
    private double bonificacao;
    private double participacaoLucros;

    public Diretor(String n , String cpf, double salario){
        super(n, cpf, salario);
        this.bonificacao = 5000;
        this.participacaoLucros = 10000;
    }

    @Override
    public double calcularSalario() {
        return super.salarioBase + this.bonificacao + this.participacaoLucros;
    }
}
