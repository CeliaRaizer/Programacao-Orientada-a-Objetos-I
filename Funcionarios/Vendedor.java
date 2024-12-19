public class Vendedor extends Funcionario {
    private double comissao;

    public Vendedor(String nome, double salario, double comissao){
        super(nome, salario);
        this.comissao = comissao;
    }
    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
    public double getComissao() {
        return comissao;
    }

    public double calcularSalario(){
        return salario + (salario*comissao /100);
    }

    @Override
    public String toString() {
        return super.toString() +"\n"+
        "Salario com comissao: "+calcularSalario()+"\n"+
        "Percentual de comissao: "+this.comissao;
    }
}
