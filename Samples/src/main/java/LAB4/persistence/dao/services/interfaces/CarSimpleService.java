package LAB4.persistence.dao.services.interfaces;

import LAB4.persistence.model.Car;

import java.util.List;

public interface CarSimpleService {
    List<Car> findAll() throws InterruptedException;

    Car addCar(Car car);

    List<Car> findCarByMark(String mark);

    List<Car> findCarByMarkAndModelAndMaxSpeed(String mark, String model, int max_speed);

    void removeById(long id);

    void removeAllByMark(String mark);
}
