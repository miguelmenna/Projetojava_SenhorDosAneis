import java.util.Random;

public class Mago extends Combatente {

    public Mago(String nome, int nivel) {
        super(nome, nivel);
    }

    @Override
    public void atacar(Combatente alvo) {
        Random r = new Random();
        int dano = this.ataque + r.nextInt(20) + 10; // mago tem ataque explosivo
        System.out.println(this.nome + " lançou uma bola de fogo causando " + dano + " de dano!");
        alvo.defender(dano);
    }
}
