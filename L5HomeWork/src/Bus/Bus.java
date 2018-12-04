package Bus;

import BusStop.BusStop;

/**
 * Клас описывающий автобус
 */

public class Bus {
    private String name;

    public String getName() {
        return name;
    }

    /**
     *
     * @param name - название маршрута автобуса
     */

    public Bus(String name) {
        this.name = name;
    }

    /**
     *
     * @param busStop - текущая остановка
     * @param secondBusStop - слудующая остановка
     */

    public void goToBusStop(BusStop busStop, BusStop secondBusStop) {
        System.out.println("Автобус " + name + " выехас с " + busStop.getName());
        System.out.println("Следующая остановка " + secondBusStop.getName());
    }

    /**
     *
     * @param busStop - остановка
     */
    public void stop(BusStop busStop) {
        System.out.println("Автобус " + name + " приехал на остановку " + busStop.getName());
    }
}
