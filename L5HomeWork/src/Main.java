import Bus.Bus;
import BusStop.BusStop;
import Human.Human;

public class Main {
    public static void main(String[] args) {
        System.out.println("start main");
        BusStop busStop1 = new BusStop("Вокзал");
        BusStop busStop2 = new BusStop("Базар");
        BusStop busStop3 = new BusStop("Театр");
        BusStop busStop4 = new BusStop("ЦУМ");
        BusStop busStop5 = new BusStop("Конечная");
        Bus bus = new Bus("#278");

        bus.goToBusStop(busStop1, busStop2);
        bus.stop(busStop2);
        Human vasya = new Human("Вася", "бобик");
        vasya.goToBus(bus);
        bus.goToBusStop(busStop2, busStop3);

        bus.stop(busStop3);
        bus.goToBusStop(busStop3, busStop4);

        bus.stop(busStop4);
        vasya.getOffTheBuss(bus);
        Human petya = new Human("Петя");
        Human jenya = new Human("Женя");
        Human vova = new Human("Вова");
        Human kolya = new Human("Коля");
        petya.goToBus(bus);
        jenya.goToBus(bus);
        vova.goToBus(bus);
        kolya.goToBus(bus);
        bus.goToBusStop(busStop4, busStop5);

        bus.stop(busStop5);
        petya.getOffTheBuss(bus);
        jenya.getOffTheBuss(bus);
        vova.getOffTheBuss(bus);
        kolya.getOffTheBuss(bus);
    }
}
