public class Hobbit extends Combatente {

    public Hobbit(String nome, int nivel) {
        super(nome, nivel);
    }

    @Override
    public void atacar(Combatente alvo) {
        int dano = this.ataque - 2; // hobbit é mais fraco
        if (dano < 1) dano = 1;
        
        System.out.println(this.nome + " atacou com uma panela causando " + dano + " de dano!");
        alvo.defender(dano);
    }
}
