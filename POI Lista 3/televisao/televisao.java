package televisao;

public class televisao {
    //atributos
    private int canal;
    private int volume;
    private boolean ligada;

    public televisao(){
        this.canal=1;
        this.volume=20;
        this.ligada=false;
    }

    public void ligarTv(){
        if(ligada==false){
            ligada = true;
            System.out.println("TV ligada");
        }else{
            System.out.println("TV ja esta ligada");
        }
    }

    public void desligaTv(){
        if(ligada==true){
            ligada=false;
            System.out.println("TV desligada");
        }else{
            System.out.println("TV ja esta desligada");
        }
    }

    public void aumentarVolume(){
        if(volume<100){
            volume++;
            System.out.println("Volume atual: "+volume);
        }else{
            System.out.println("Volume maximo");
        }
    }
    public void diminuirVolume(){
        if(volume<100){
            volume--;
            System.out.println("Volume atual: "+volume);
        }else{
            System.out.println("Volume minimo");
        }
    }

    public void mudarCanal(int canall){
        canal=canall;
        System.out.println("Canal mudado para: "+canal);
    }
}
