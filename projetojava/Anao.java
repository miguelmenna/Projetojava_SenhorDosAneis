public class Anao extends Combatente {

    public Anao(String nome, int nivel) {
        super(nome, nivel);
        this.vida += 40;     // anões são mais resistentes
        this.defesa += 5;
    }

    @Override
    public void atacar(Combatente alvo) {
        int dano = this.ataque + 8; // dano alto com machado pesado
        System.out.println(this.nome + " desferiu um machado pesado causando " + dano + " de dano!");
        alvo.defender(dano);
    }
}
