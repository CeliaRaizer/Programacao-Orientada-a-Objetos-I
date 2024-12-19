public class Gerente extends Funcionario{
    private String departamento;

    public Gerente(String departamento, double salario, String nome){
        super(nome, salario);
        this.departamento = departamento;
    }
    
    public void setDepartamento(String departamento){
        this.departamento = departamento;
    }
    public String getDepartamento(){
        return departamento;
    }

    @Override
    public String toString() {
        return super.toString() + "\n"+
        "Departamento: "+this.departamento;
    }
}
