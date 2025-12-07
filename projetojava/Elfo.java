import java.util.Random;

public class Elfo extends Combatente {

    public Elfo(String nome, int nivel) {
        super(nome, nivel);
    }

    @Override
    public void atacar(Combatente alvo) {
        Random r = new Random();
        int dano = this.ataque + r.nextInt(10);
        System.out.println(this.nome + " atirou uma flecha causando " + dano + " de dano!");
        alvo.defender(dano);
    }
}
