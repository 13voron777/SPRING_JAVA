package LAB4.persistence.dao.repositories;

import LAB4.persistence.model.Car;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface CarRepository extends CrudRepository<Car, Long> {
    List<Car> findCarByMark(String mark);
    List<Car> findCarByMarkAndModelAndMaxSpeed(String mark, String model, int max_speed);
    void deleteAllByMark(String mark);
}
