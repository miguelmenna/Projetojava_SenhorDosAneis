public class Humano extends Combatente {

    public Humano(String nome, int nivel) {
        super(nome, nivel);
    }

    @Override
    public void atacar(Combatente alvo) {
        int dano = this. ataque + 5;
        System.out.println(this.nome + " golpeou com a espada causando " + dano + " de dano!");
        alvo.defender(dano);
    }
}
