package LAB1.impl.car;

import LAB1.interfaces.Engine;
import LAB1.interfaces.Tyre;
import LAB1.interfaces.Car;

public class Kia implements Car {
    private Engine engine;
    private Tyre tyre;

    public Kia() {
    }

    public Kia(Engine engine, Tyre tyre) {
        this.engine = engine;
        this.tyre = tyre;
    }

    public void move() {
        System.out.println("*****************************");
        System.out.println("KIA in action");
        System.out.println("*****************************");
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Tyre getTyre() {
        return tyre;
    }

    public void setTyre(Tyre tyre) {
        this.tyre = tyre;
    }
}
