package LAB2;

import lombok.Data;

import java.util.List;
import java.util.logging.Logger;

@Data
public class Bank {
    private List<Client> clients;
    private String name;
    private Logger LOG;

    public Bank() {
    }

    public Bank(List<Client> clients, String name, Logger LOG) {
        this.clients = clients;
        this.name = name;
        this.LOG = LOG;
    }

    public boolean issueLoan(Client client, double loan) {
        boolean result = (loan * 12.0 + loan / 10.0) <= client.getSum();
        String sumsInfo = ", loan = " + loan + ", client sum = " + client.getSum();
        LOG.info((result ? "Loan issued to the client " + client.getName() + sumsInfo
                : "Loan was not issued to the client " + client.getName() + sumsInfo
        ));
        return result;
    }

    public boolean issueDeposit(Client client, double deposit) {
        boolean result = deposit >= 1000 && client.getSum() >= deposit;
        String sumsInfo = ", deposit = " + deposit + ", client sum = " + client.getSum();
        LOG.info((result ? "Deposit issued to the client " + client.getName() + sumsInfo + "\n"
                : "Deposit was not issued to the client " + client.getName() + sumsInfo
                + "\n"));
        return result;
    }
}
