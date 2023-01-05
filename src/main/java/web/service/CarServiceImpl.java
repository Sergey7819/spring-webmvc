package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService {
    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car(7384, "Black", "Audi"));
        cars.add(new Car(7632, "White", "BMW"));
        cars.add(new Car(1332, "Blue", "Tesla"));
        cars.add(new Car(5454, "Orange", "Kia"));
        cars.add(new Car(3469, "Grey", "Toyota"));
    }
    @Override
    public List<Car> carList(int count) {
        return cars.subList(0, count);
    }
}

