package LAB2;

public class Client {
    private String name;
    private double sum;

    public Client() {
    }

    public Client(String name, double sum) {
        this.name = name;
        this.sum = sum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", sum=" + sum +
                '}';
    }
}
