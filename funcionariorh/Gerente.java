public class Gerente extends Funcionario{
    private double totalHorasExtras;
    private double valorExtra;

    public Gerente(String n, String cpf, double salario, double total){
        super(n, cpf, salario);
        this.valorExtra= 50;
        this.totalHorasExtras = total;
    }

    @Override
    public double calcularSalario() {
        
        return salarioBase * (1-IMPOSTO) + (totalHorasExtras*valorExtra) ;
    }
}
