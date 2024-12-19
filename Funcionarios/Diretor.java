public class Diretor extends Funcionario {
    private double participacaoLucros;

    public Diretor(String nome, double Salario, double participacaoLucros){
        super(nome, Salario);
        this.participacaoLucros = participacaoLucros;
    }

    public double getParticipacaoLucros() {
        return participacaoLucros;
    }
    public void setParticipacaoLucros(double participacaoLucros) {
        this.participacaoLucros = participacaoLucros;
    }

    public double calcularSalario(){
        return salario + (2*participacaoLucros);
    }

    @Override
    public String toString() {
        return super.toString()+"\n"+
        "Participação dos lucros"+this.participacaoLucros+"\n"+
        "Salario com a participação: "+calcularSalario();
    }
}
