package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
@Service
public class CarServiceClass implements CarService{
    @Transactional
    @Override
    public List<Car> getCars() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("audi", "A4", 2005));
        cars.add(new Car("bmw", "X5", 2010));
        cars.add(new Car("lada", "Granta", 2008));
        return cars;
    }
}
