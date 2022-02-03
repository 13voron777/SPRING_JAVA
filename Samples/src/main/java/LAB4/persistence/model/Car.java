package LAB4.persistence.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@RequiredArgsConstructor
@Getter
@Setter
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String mark;
    private String model;
    private float engineVolume;
    private float price;
    private int maxSpeed;

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                ", price=" + price +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
