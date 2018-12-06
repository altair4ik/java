package game;

public class Aquaman extends Hero implements Swim, Shot {
    private String name;

    public Aquaman(String name) {
        this.name = name;
    }

    @Override
    public void swim() {
        System.out.println(this.name + ": Плывет");
    }

    @Override
    public void superPower(int power) {
        Operationable operation;
        operation = (x) -> x*x;
        System.out.println(this.name + ": Суперсила!!! Быстро плывет!!!" + " Мощность - " + operation.power(power));
    }

    @Override
    public void shot() {
        System.out.println(this.name + ": Стреляет!");
    }
}
