import java.util.Random;

public class Arco extends Arma {

    public Arco() {
        super("Arco Élfico", 6);
    }

    @Override
    public int calcularDanoExtra() {
        Random r = new Random();

        // 25% de chance de perfurar defesa
        if (r.nextInt(100) < 25) {
            System.out.println("→ O tiro perfura a defesa!");
            return danoBase + 5;
        }

        return danoBase;
    }
}
