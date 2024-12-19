package pessoa;

public class pessoa {
    //atributos
    private String nome;
    private int sexo;
    private int anoNasc;

    public pessoa(String nome, int sexo, int anoNasc){
        this.nome=nome;
        this.sexo=sexo;
        this.anoNasc=anoNasc;
    }

    //metodo
    public void comprimentar(){
        if(sexo==1){
            System.out.println("Ola senhora "+nome);
        }else{
            System.out.println("Ola senhor "+nome);
        }
    }
    
    public void calcularIdade(){
        System.out.println("Idade de "+nome+" e: "+(2024-anoNasc));
    }
    
}
