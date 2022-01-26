package LAB1.impl.tyre;

import LAB1.interfaces.Tyre;

public class Premiorry implements Tyre {
    public void twist() {
        System.out.println("*****************************");
        System.out.println("Tyre Premiorry began to twist");
        System.out.println("*****************************");
    }

    public void change() {
        System.out.println("*****************************");
        System.out.println("Tyre Premiorry has been changed");
        System.out.println("*****************************");
    }
}
