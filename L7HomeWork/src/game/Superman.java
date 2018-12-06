package game;

public class Superman extends Hero implements Jump, Run {
    private String name;

    public Superman(String name) {
        this.name = name;
    }

    @Override
    public void jump() {
        System.out.println(this.name + ": Прыгает");
    }

    @Override
    public void superPower(int power) {
        Operationable operation;
        operation = (x) -> x*x;
        System.out.println(this.name + ": Суперсила!!! Быстро Бежит!!!" + " Мощность - " + operation.power(power));
    }

    @Override
    public void run() {
        System.out.println(this.name + ": Бежит");
    }
}
