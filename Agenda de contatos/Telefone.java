public class Telefone {
    private String numero;
    private String rotulo;

    public Telefone(String numero, String rotulo){
        this.numero = numero;
        this.rotulo = rotulo;
    }

    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public String getRotulo() {
        return rotulo;
    }
    public void setRotulo(String rotulo) {
        this.rotulo = rotulo;
    }

    @Override
    public String toString() {
        return rotulo+" : "+numero;
    }
}
