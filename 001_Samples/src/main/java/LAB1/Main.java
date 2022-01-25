package LAB1;

import spring.impl.audio.Alpine;
import spring.impl.audio.Kenwood;
import spring.impl.audio.Sony;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.impl.car.Audi;
import spring.impl.car.Kia;
import spring.impl.car.Lexus;
import spring.impl.navigation.Navitel;

public class Main {

    public static void main( String[] args )
    {

// =============================== without Spring ===============================

        Audi audi = new Audi();
        audi.setAudioSystem(new Sony());
        audi.move();
        audi.getAudioSystem().playRadio();
//
//
//        Lexus lexus = new Lexus(new Alpine(), new Navitel());
//        lexus.move();
//        lexus.getAudioSystem().playCD();



// =============================== with Spring ===============================

//        ApplicationContext ctx = new ClassPathXmlApplicationContext("context.xml");
//        Audi audi = (Audi) ctx.getBean("audi"); // Audi.class
//        audi.move();
//
//        audi.setAudioSystem(ctx.getBean("kenwood", Kenwood.class));
//        audi.getAudioSystem().playRadio();
//
//
//        Audi audi2 = ctx.getBean("audi2", Audi.class);
//        audi2.getAudioSystem().playRadio();


//        Audi audi3 = ctx.getBean("audi3", Audi.class);
//        audi3.getAudioSystem().playRadio();
//        audi3.getNavigationSystem().createRoute();

// ==============================================

//        ApplicationContext  ctx = new AnnotationConfigApplicationContext(Config.class);
//
//        Audi audi = ctx.getBean(Audi.class);
//        audi.move();
//        audi.getNavigationSystem().createRoute();
//        audi.getAudioSystem().playRadio();
//
//
//        ctx.getBean(Kia.class).move();
    }
}
