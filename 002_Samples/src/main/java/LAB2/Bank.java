package LAB2;

import java.util.List;

public class Bank {
    private List<Client> clients;

    public boolean issueLoan(Client client, double loan) {
        return (loan * 12.0 + loan / 10.0) <= client.getSum();
    }

    public boolean issueDeposit(Client client, double deposit) {
        return deposit >= 1000 && client.getSum() >= deposit;
    }
}
