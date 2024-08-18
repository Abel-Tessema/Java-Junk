package models;

import services.CarService;

import java.util.ArrayList;
import java.util.List;

public class User extends Account {
    private final CarService carService = new CarService();
    public User() {}

    public User(String name, String phoneNumber, String email, String password) {
        super(name, phoneNumber, email, password);
    }

    private List<Car> rentedCars = new ArrayList<>();
    public void listRentedCars() {
        carService.displayCarListHeaders();
        for (Car rentedCar : rentedCars)
            carService.displayCar(rentedCar);
    }

}
