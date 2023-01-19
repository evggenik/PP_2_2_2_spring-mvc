package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarService {
    private final List<Car> cars;

    public CarService()
    {
        cars = new ArrayList<>();
        cars.add(new Car(1, "car1", 1));
        cars.add(new Car(2, "car2", 2));
        cars.add(new Car(3, "car3", 3));
        cars.add(new Car(4, "car4", 4));
        cars.add(new Car(5, "car5", 5));
    }

    public List<Car> countCars(int count) {
        return count >= 5 ? cars : cars.subList(0, count);
    }
}
