public class Funcionario {
    private String nome;
    protected double salario;

    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }
    public double getSalario() {
        return salario;
    }

    @Override
    public String toString() {
        return "Nome: "+this.nome+"\n"+
        "Salario: "+this.salario;
    }
}
