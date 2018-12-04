package machine;

import java.util.Objects;

public class Bmw extends Car {
    private String lightColor;

    public Bmw(int wheels, String color, String carType, String lightColor) {
        super(wheels, color, carType);
        this.lightColor = lightColor;
        System.out.println("BMW цвет света: " + this.lightColor);
    }

    public void lightOn() {
        System.out.println("Свет включен: " + this.lightColor);
    }

    public void lightOff() {
        System.out.println(this.lightColor + " cвет выключен");
    }

    @Override
    public String toString() {
        return "Bmw{" +
                "lightColor='" + lightColor + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bmw bmw = (Bmw) o;
        return Objects.equals(lightColor, bmw.lightColor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), lightColor);
    }

    @Override
    public void on() {
        System.out.println("Bmw переопределил метот on Machine");
    }
}
