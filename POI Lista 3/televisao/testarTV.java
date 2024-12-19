package televisao;

public class testarTV {
    public static void main(String[] args) {
        televisao tv1 = new televisao();

        tv1.ligarTv();
        tv1.aumentarVolume();
        tv1.aumentarVolume();
        tv1.diminuirVolume();
        tv1.mudarCanal(3);
        tv1.desligaTv();
        tv1.desligaTv();
    }
}
