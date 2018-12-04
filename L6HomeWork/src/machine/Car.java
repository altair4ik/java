package machine;

import java.util.Objects;

public class Car extends Machine {
    private int wheels;
    private String color;
    private String carType;

    public Car(int wheels, String color, String carType) {
        super("Механический");
        this.wheels = wheels;
        this.color = color;
        this.carType = carType;
        System.out.println("Автомобиль тип: " + this.carType + " цвет: " + this.color + " кол-во колес: " + this.wheels);
    }

    public int getWheels() {
        return wheels;
    }

    public String getColor() {
        return color;
    }

    public void go() {
        System.out.println(
                this.wheels + "-х колесный автомобиль цвета " + this.color + " и типа " + this.carType + " поехал"
        );
    }

    public void stop() {
        System.out.println(this.wheels + "-х колесный автомобиль цвета " + this.color +  " и типа " + this.carType + " остановился" );
    }

    @Override
    public String toString() {
        return "Car{" +
                "wheels=" + wheels +
                ", color='" + color + '\'' +
                ", carType='" + carType + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Car car = (Car) o;
        return wheels == car.wheels &&
                Objects.equals(color, car.color) &&
                Objects.equals(carType, car.carType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), wheels, color, carType);
    }
}
