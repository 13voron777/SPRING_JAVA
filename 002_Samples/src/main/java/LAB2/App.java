package LAB2;

import com.itvdn.domain.implementation.SmartPhone;
import com.itvdn.domain.interfaces.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.logging.Logger;

public class App {
    private static final Logger LOG = Logger.getLogger("labLogger2");

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("clients.xml");

        Client client1 = ctx.getBean("client1", Client.class);
        Client client2 = ctx.getBean("client2", Client.class);
        Client client3 = ctx.getBean("client3", Client.class);

        SmartPhone samsungPhone = ctx.getBean("samsungPhone", SmartPhone.class);
        boolean status = samsungPhone.sendMessage(person1);
        LOG.info(status + "\n\n\n");
        samsungPhone.makeCall(person2);

        LOG.info(person3 + " Peter is here");
        LOG.info(person4 + " Petro also is here");


//        ctx.getBean("oldPhone", Calculate.class).getInfo();


//        System.out.println();
//        System.out.println(ctx.getBean("subscriberList"));

    }
}
