import java.util.Random;

public class Humano extends Combatente {

    public Humano(String nome, int nivel) {
        super(nome, nivel);
    }

    @Override
    public void atacar(Combatente alvo) {
        Random r = new Random();

        int dano = this.ataque + r.nextInt(6);

        if (arma != null) {
            dano += arma.calcularDanoExtra();
        }

        System.out.println(this.nome + " atacou com força humana causando " + dano + " de dano!");
        alvo.defender(dano);
    }
}
