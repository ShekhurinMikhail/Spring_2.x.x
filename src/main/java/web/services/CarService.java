package web.services;

import web.models.Car;

import java.util.List;

public interface CarService {
    List<Car> getSomeCars(int n);
    List<Car> getListCars();
}
