package spring.impl.navigation;

import spring.interfaces.NavigationSystem;



public class Pioneer implements NavigationSystem {
    public boolean createRoute() {
        System.out.println("*****************************");
        System.out.println("Route was created by Pioneer");
        System.out.println("*****************************");
        return true;
    }
}
