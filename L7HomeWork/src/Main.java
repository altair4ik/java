import game.Aquaman;
import game.Operationable;
import game.Superman;

public class Main {
    public static void main(String[] args) {
        Superman superman = new Superman("Кларк", 8);
        Aquaman aquaman = new Aquaman("Карась", 9);

        Operationable supermanWeapon;
        supermanWeapon = (x) -> x*x;

        superman.jump();
        superman.run();
        superman.superPower(supermanWeapon);

        aquaman.shot();
        aquaman.swim();
        aquaman.superPower(supermanWeapon);

    }
}
