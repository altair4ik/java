package game;

public class Aquaman extends Hero implements Swimmer, Shoter {
    private String name;
    private int power;

    public Aquaman(String name, int power) {
        this.name = name;
        this.power = power;
    }

    @Override
    public void swim() {
        System.out.println(this.name + ": Плывет");
    }

    @Override
    public void superPower(Operationable operation) {
        System.out.println(this.name + ": Суперсила!!! Быстро плывет!!!" + " Мощность: " + operation.power(this.power));
    }

    @Override
    public void shot() {
        System.out.println(this.name + ": Стреляет!");
    }
}
