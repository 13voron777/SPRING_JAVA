package LAB1.impl.tyre;

import LAB1.interfaces.Tyre;

public class Rosava implements Tyre {
    public void twist() {
        System.out.println("*****************************");
        System.out.println("Tyre Rosava began to twist");
        System.out.println("*****************************");
    }

    public void change() {
        System.out.println("*****************************");
        System.out.println("Tyre Rosava has been changed");
        System.out.println("*****************************");
    }
}
