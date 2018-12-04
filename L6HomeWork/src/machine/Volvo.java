package machine;

import java.util.Objects;

public class Volvo extends Car {
    private String signal;

    public Volvo(int wheels, String color, String carType, String signal) {
        super(wheels, color, carType);
        this.signal = signal;
        System.out.println("Звук сигнала " + this.signal);
    }

    public void signalOn() {
        System.out.println("Сигнал включен: " + this.signal);
    }

    public void signalOff() {
        System.out.println("Сигнал выключен: " + this.signal);
    }

    @Override
    public String toString() {
        return "Volvo{" +
                "signal='" + signal + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Volvo volvo = (Volvo) o;
        return Objects.equals(signal, volvo.signal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), signal);
    }

    @Override
    public void on() {
        System.out.println("Volvo переопределил метод on Machine");
    }
}
