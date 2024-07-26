package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    public static List<Car> getCars() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("model1", 1, "user1"));
        cars.add(new Car("model2", 2, "user2"));
        cars.add(new Car("model3", 3, "user3"));
        cars.add(new Car("model4", 4, "user4"));
        cars.add(new Car("model5", 5, "user5"));
        return cars;
    }

    @Override
    public List<Car> carsCount(int count) {
        if (count <= 0) {
            return null;
        }
        if (count < 5) {
            return getCars().stream().limit(count).toList();
        }
        return getCars();
    }
}
