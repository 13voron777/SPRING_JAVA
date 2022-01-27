package LAB2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("LAB2\\clients.xml");
        Bank bank = ctx.getBean("bankRaiff", Bank.class);

        for (Client client : bank.getClients()) {
            bank.issueLoan(client, 1000);
            bank.issueDeposit(client, 1000);
        }
    }
}
