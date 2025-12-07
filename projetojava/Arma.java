public abstract class Arma {
    protected String nome;
    protected int danoBase; // dano adicional fornecido pela arma

    public Arma(String nome, int danoBase) {
        this.nome = nome;
        this.danoBase = danoBase;
    }

    public String getNome() {
        return nome;
    }

    public int getDanoBase() {
        return danoBase;
    }

    // Cada arma terá um efeito próprio (polimorfismo)
    public abstract int calcularDanoExtra();

    @Override
    public String toString() {
        return nome + " (+" + danoBase + " dano)";
    }
}
