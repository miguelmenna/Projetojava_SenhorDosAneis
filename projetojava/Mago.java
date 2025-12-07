import java.util.Random;

public class Mago extends Combatente {

    public Mago(String nome, int nivel) {
        super(nome, nivel);
        this.ataque += 6; // poder mágico
    }

    @Override
    public void atacar(Combatente alvo) {
        Random r = new Random();
        
        int dano = this.ataque + r.nextInt(12);

        if (arma != null) {
            dano += arma.calcularDanoExtra(); // cajado ajuda muito
        }

        System.out.println(this.nome + " lançou uma magia causando " + dano + " de dano!");
        alvo.defender(dano);
    }
}
