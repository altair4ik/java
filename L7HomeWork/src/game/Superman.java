package game;

public class Superman extends Hero implements Jumper, Runner {
    private String name;
    private int power;

    public Superman(String name, int power) {
        this.name = name;
        this.power = power;
    }

    @Override
    public void jump() {
        System.out.println(this.name + ": Прыгает");
    }

    @Override
    public void superPower(Operationable operation) {
        System.out.println(this.name + ": Суперсила!!! Быстро Бежит!!!" + " Мощность: " + operation.power(this.power));
    }

    @Override
    public void run() {
        System.out.println(this.name + ": Бежит");
    }
}
