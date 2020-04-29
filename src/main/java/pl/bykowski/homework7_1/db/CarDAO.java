package pl.bykowski.homework7_1.db;

import pl.bykowski.homework7_1.model.Car;
import pl.bykowski.homework7_1.model.SearchParam;

import java.util.List;

public interface CarDAO {

    public List<Car> getAll();
    public void addCar(Car car);
    public List<Car> getCarsByDate(SearchParam searchParam);
}
