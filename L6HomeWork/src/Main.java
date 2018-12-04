import machine.Bmw;
import machine.Car;
import machine.Volvo;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {
        Volvo volvo = new Volvo(4, "black", "sport", "beep-beep");
        Bmw bmw = new Bmw(4, "yellow", "buggy", "white");

        System.out.println(volvo.toString());
        System.out.println(volvo.hashCode());
        System.out.println(volvo.equals(bmw));
        volvo.signalOn();
        volvo.signalOff();
        bmw.go();
        bmw.stop();

        Class clazz = bmw.getClass();
        System.out.println(clazz);
        System.out.println(clazz.getName());

        Method[] methods = clazz.getDeclaredMethods();

        Class clazzVolvo = Class.forName("machine.Volvo");
        Constructor constructorVolvo = clazzVolvo.getDeclaredConstructor(new Class[] {Integer.class, String.class, String.class});
        //Object v = constructorVolvo.newInstance(new Object[]{7, "green", "f1", "bi-bi-p"});
        //System.out.println("Рефлексия " + v);

        for (Method method: methods) {
            System.out.println(method);
        }

        Car[] cars = {volvo ,bmw};

        for (int i = 0; i < cars.length; i++) {
            cars[i].on();
        }
    }
}
