import java.util.Random;

public class Orque extends Combatente {

    public Orque(String nome, int nivel) {
        super(nome, nivel);
        this.vida += 20;
        this.ataque += 4;
    }

    @Override
    public void atacar(Combatente alvo) {
        Random r = new Random();

        int dano = this.ataque + r.nextInt(6);

        if (r.nextInt(100) < 20) {
            dano *= 2;
            System.out.println(this.nome + " entrou em FÚRIA! Ataque CRÍTICO!");
        }

        if (arma != null) {
            dano += arma.calcularDanoExtra();
        }

        System.out.println(this.nome + " atacou brutalmente causando " + dano + "!");
        alvo.defender(dano);
    }
}
