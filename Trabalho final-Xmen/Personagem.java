import javax.swing.JOptionPane;

public abstract class Personagem {
    
    private String nome;
    private int vida;
    private int poderAtaque;
    private int poderDefesa;
    private int velocidade;
    private String habilidadeEspecial;
    private boolean habilidadeEspecialUsada;

    public Personagem(String nome, int vida, int poderAtaque, int poderDefesa, int velocidade, String habilidadeEspecial) {
        this.nome = nome;
        this.vida = vida;
        this.poderAtaque = poderAtaque;
        this.poderDefesa = poderDefesa;
        this.velocidade = velocidade;
        this.habilidadeEspecial = habilidadeEspecial;
        this.habilidadeEspecialUsada = false;
    }

    public void atacar(Personagem inimigo) {
        int dano = this.poderAtaque - inimigo.getPoderDefesa();
        dano = Math.max(0, dano); 
        inimigo.receberDano(dano);
        JOptionPane.showMessageDialog(null, this.nome + " atacou " + inimigo.getNome() + " causando " + dano + " de dano!");
    }

    public void defender() {
        this.poderDefesa += this.poderDefesa / 2; // Aumenta a defesa em 50%
        JOptionPane.showMessageDialog(null, this.nome + " está se defendendo! Defesa aumentada para " + this.poderDefesa);
    }

    public void receberDano(int dano) {
        setVida(this.vida - dano);
    }

    //metodo abstrato
    public abstract void usarHabilidadeEspecial(Personagem alvo);

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Personagem personagem = (Personagem) obj;
        return this.getNome().equals(personagem.getNome());
    }

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = Math.max(0, vida); 
    }

    public int getPoderAtaque() {
        return poderAtaque;
    }

    public void setPoderAtaque(int poderAtaque) {
        this.poderAtaque = poderAtaque;
    }

    public int getPoderDefesa() {
        return poderDefesa;
    }

    public void setPoderDefesa(int poderDefesa) {
        this.poderDefesa = poderDefesa;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public String getHabilidadeEspecial() {
        return habilidadeEspecial;
    }
    public void setHabilidadeEspecial(String habilidadeEspecial) {
        this.habilidadeEspecial = habilidadeEspecial;
    }

    public boolean getHabilidadeEspecialUsada() {
        return habilidadeEspecialUsada;
    }

    public void setHabilidadeEspecialUsada(boolean habilidadeEspecialUsada) {
        this.habilidadeEspecialUsada = habilidadeEspecialUsada;
    }
}
