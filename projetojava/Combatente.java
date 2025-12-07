import java.util.Random;

public abstract class Combatente {
    protected String nome;
    protected int vida;
    protected int ataque;
    protected int defesa;
    protected int nivel;
    
    public Combatente(String nome, int nivel) {
        this.nome = nome;
        this.nivel = nivel;
        this.vida = 100 + (nivel * 10); 
        this.ataque = 10 + (nivel * 2);
        this.defesa = 5 + (nivel * 2);
    }

    public abstract void atacar(Combatente alvo);

    public void defender(int danoRecebido) {
        int danoReal = danoRecebido - this.defesa;
        
        if (danoReal < 0) danoReal = 0; // Não pode curar se a defesa for alta demais
        
        this.vida -= danoReal;
        
        System.out.println(this.nome + " defendeu e tomou " + danoReal + " de dano.");
        System.out.println("Vida restante: " + this.vida);
    }

    public boolean estaVivo() {
        return this.vida > 0;
    }

    public String getNome() { return nome; }
    public int getVida() { return vida; }
}