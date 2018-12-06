import game.Aquaman;
import game.Superman;

public class Main {
    public static void main(String[] args) {
        Superman superman = new Superman("Кларк");
        Aquaman aquaman = new Aquaman("Карась");
        superman.jump();
        superman.run();
        superman.superPower(5);

        aquaman.shot();
        aquaman.swim();
        aquaman.superPower(4);

    }
}
