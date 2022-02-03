package LAB4.persistence.dao.services.implementations;

import LAB4.persistence.dao.repositories.CarRepository;
import LAB4.persistence.dao.services.interfaces.CarSimpleService;
import LAB4.persistence.model.Car;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarSimpleServiceImpl implements CarSimpleService {
    private CarRepository carRepository;

    @Override
    public List<Car> findAll() throws InterruptedException {
        return Lists.newArrayList(carRepository.findAll());
    }

    @Override
    public Car addCar(Car car) {
        return carRepository.save(car);
    }

    @Override
    public List<Car> findCarByMark(String mark) {
        return carRepository.findCarByMark(mark);
    }

    @Override
    public List<Car> findCarByMarkAndModelAndMaxSpeed(String mark, String model, int max_speed) {
        return carRepository.findCarByMarkAndModelAndMaxSpeed(mark, model, max_speed);
    }

    @Override
    public void removeById(long id) {
        carRepository.deleteById(id);
    }

    @Override
    public void removeAllByMark(String mark) {
        carRepository.deleteAllByMark(mark);
    }

    @Autowired
    private void setCarRepository(CarRepository carRepository) {
        this.carRepository = carRepository;
    }
}
