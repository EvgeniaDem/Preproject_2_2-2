package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    @Override
    public List<Car> getAllCars() {
        Car car1 = new Car("BMW", 836, "Germany");
        Car car2 = new Car("Volvo", 035, "Sweden");
        Car car3 = new Car("Reno", 035, "France");
        Car car4 = new Car("Niva", 285, "Russia");
        Car car5 = new Car("Lada", 8262, "Russia");

        List<Car> cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);

        return cars;
    }

    @Override
    public List<Car> getSeveralCars(int count) {
        List<Car> allCars = getAllCars();
        if (count >= allCars.size()) {
            return allCars;
        } else {
            allCars.subList(count, allCars.size()).clear();
            return allCars;
        }
    }
}
