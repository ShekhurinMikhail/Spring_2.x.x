package web.services;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImp implements CarService {
    List<Car> listCars = new ArrayList<>();
    {
        listCars.add(new Car("Opel1", "Corsa1", 120));
        listCars.add(new Car("Opel2", "Corsa2", 130));
        listCars.add(new Car("Opel3", "Corsa3", 140));
        listCars.add(new Car("Opel4", "Corsa4", 150));
        listCars.add(new Car("Opel5", "Corsa5", 160));
    }
    @Override
    public List<Car> getSomeCars(int n) {
        if (n >= 5) {
            return listCars;
        }
        return listCars.stream().limit(n).toList();
    }

    @Override
    public List<Car> getListCars() {
        return listCars;
    }

}
