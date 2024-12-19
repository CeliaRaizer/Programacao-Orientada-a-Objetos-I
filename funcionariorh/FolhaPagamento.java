import java.util.ArrayList;
import java.util.List;

public class FolhaPagamento {
    List<Funcionario> funcionarios;

    public FolhaPagamento(){
        this.funcionarios = new ArrayList<>();
    }

    public void inserirFuncionario(Funcionario f){
        this.funcionarios.add(f);
    }

    public void calcularFolha(){
        double total = 0;
        for (Funcionario f : funcionarios){
            total += f.calcularSalario();
        }
        System.out.println("A folha do pagamento do mês corrente é R$: " + total);
    }
}
