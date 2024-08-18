package accounts;

import objects.Car;

import java.util.ArrayList;
import java.util.List;

public class User extends Account {
    public User() {}

    public User(String name, String phoneNumber, String email, String password) {
        super(name, phoneNumber, email, password);
    }

    private List<Car> rentedCars = new ArrayList<>();
    public void listRentedCars() {
        Car.displayCarListHeaders();
        for (Car rentedCar : rentedCars)
            Car.displayCar(rentedCar);
    }

}
