package LAB2;

import lombok.Data;

@Data
public class Client {
    private String name;
    private double sum;

    public Client() {
    }

    public Client(String name, double sum) {
        this.name = name;
        this.sum = sum;
    }
}
