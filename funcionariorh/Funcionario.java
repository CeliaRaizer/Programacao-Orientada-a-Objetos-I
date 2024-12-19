abstract class Funcionario{
    protected String nome;
    protected String cpf;
    protected double salarioBase;
    public final static double IMPOSTO = 0.25;

    public Funcionario(String n, String cpf, double salario){
        this.nome = n;
        this.cpf = cpf;
        this.salarioBase = salario;
    }

    abstract public double calcularSalario();
}