package machine;

import java.util.Objects;

public class Machine {
    private String type;

    public Machine(String type) {
        this.type = type;
        System.out.println("Машина типа " + this.type + " создана");
    }

    public String getType() {
        return type;
    }

    public void on() {
        System.out.println("Машина типа - " + this.type + " включина");
    }

    public void off() {
        System.out.println("Машина типа - " + this.type + " выключина");
    }

    @Override
    public String toString() {
        return "Machine{" +
                "type='" + type + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Machine machine = (Machine) o;
        return Objects.equals(type, machine.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type);
    }
}
