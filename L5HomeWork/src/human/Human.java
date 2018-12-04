package human;

import bus.Bus;
import dog.Dog;

public class Human {
    private String name;
    private Dog dog;

    public String getName() {
        return name;
    }

    /**
     *
     * @param name - имя человека
     */
    public Human(String name) {
        this.name = name;
    }

    /**
     *
     * @param name - имя человека
     * @param dog - кличка его собаки
     */

    public Human(String name, Dog dog) {
        this.name = name;
        this.dog = dog;
    }

    /**
     *
     * @param bus - автобус в который садится человек
     */

    public void goToBus(Bus bus) {
        if (this.dog == null) {
            System.out.println("Человек " + this.name + " сел в автобус " + bus.getName());
        } else {
            System.out.println("Человек " + this.name + " с собакой " + this.dog.getName() + " сели в автобус " + bus.getName());
        }
    }

    /**
     *
     * @param bus - автобус с которого выходит человек
     */
    public void getOffTheBuss(Bus bus) {
        if (this.dog == null) {
            System.out.println("Человек " + this.name + " вышел с автобуса " + bus.getName());
        } else {
            System.out.println("Человек " + this.name + " с собакой " + this.dog.getName() + " вышли с автобуса " + bus.getName());
        }
    }
}
