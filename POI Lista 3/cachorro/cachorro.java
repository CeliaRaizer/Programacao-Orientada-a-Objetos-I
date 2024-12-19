package cachorro;

public class cachorro {
    //atributos
    private String nome;
    private String raca;
    private double peso;;

    public cachorro(String nome, double peso, String raca){
        this.nome=nome;
        this.raca=raca;
        this.peso=peso;
    }

    //metodos
    public void latir(){
        System.out.println(nome+" esta latindo!");
    }
    public void correr(){
        System.out.println(nome+" esta correndo!");
    }
    public void comer(double quantRacao){
        peso+= quantRacao*0.1;
    }
    public void imprimirPeso(){
        System.out.println("O peso do "+nome+" apos a refeicao e "+peso);
    }
}

