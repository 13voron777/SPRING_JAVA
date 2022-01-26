package LAB1;


import LAB1.impl.car.Lexus;
import LAB1.impl.engine.Forte;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("labContext.xml");
        Lexus lexus = ctx.getBean("lexus", Lexus.class);
        lexus.move();

        lexus.setEngine(ctx.getBean("forte", Forte.class));
        lexus.getEngine().start();

        Lexus Lexus2 = ctx.getBean("lexus2", Lexus.class);
        Lexus2.getEngine().start();

        Lexus lexus3 = ctx.getBean("lexus3", Lexus.class);
        lexus3.getEngine().start();
        lexus3.getTyre().twist();
        lexus3.getTyre().change();
    }
}
