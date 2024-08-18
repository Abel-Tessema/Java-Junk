package services;

import models.Car;
import models.Lists;

import java.util.ArrayList;
import java.util.List;

public class CarService {
    // ====================== Fields ======================
    private final List<Car> cars = new ArrayList<>();

    // ====================== Initialize cars List ======================
    private void initializeCarsList() {
        // ToDo: Read from files into the cars List
    }

    // ====================== Displaying ======================
    public void displayCarListHeaders() {
        System.out.printf("%-5s", "ID");
        System.out.printf("%-20s", "Brand");
        System.out.printf("%-20s", "Model");
        System.out.printf("%-20s", "Type");
        System.out.printf("%-20s", "Color");
        System.out.printf("%-15s", "Year");
        System.out.printf("%-25s", "Quantity Available");
        System.out.println("Base Rate");
    }

    public void displayCar(Car car) {
        System.out.printf("%-5s", car.getId());
        System.out.printf("%-20s", car.getBrand());
        System.out.printf("%-20s", car.getModel());
        System.out.printf("%-20s", car.getType());
        System.out.printf("%-20s", car.getColor());
        System.out.printf("%-15s", car.getYear());
        System.out.printf("%-25s", car.getQuantityAvailable());
        System.out.printf("Br. %.2f %n", car.getBaseRate());
    }

    // ====================== Listing ======================
    public void listAllCars() {
        initializeCarsList();
        displayCarListHeaders();
        for (Car car : cars)
            displayCar(car);
    }

    public void listCarsByBrand(String brand) {
        initializeCarsList();
        displayCarListHeaders();
        for (Car car : cars)
            if (brand.equals(car.getBrand()))
                displayCar(car);
    }

    public void listCarsByType(String type) {
        initializeCarsList();
        displayCarListHeaders();
        for (Car car : cars)
            if (type.equals(car.getType()))
                displayCar(car);
    }

    public void listCarsByYear(int year) {
        initializeCarsList();
        displayCarListHeaders();
        for (Car car : cars)
            if (year == car.getYear())
                displayCar(car);
    }

    public void searchCar(String key) {
        initializeCarsList();
        displayCarListHeaders();
        for (Car car : cars) {
            if (key.equalsIgnoreCase(Integer.toString(car.getId())) ||
                    key.equalsIgnoreCase(car.getBrand()) ||
                    key.equalsIgnoreCase(car.getModel()) ||
                    key.equalsIgnoreCase(car.getType()) ||
                    key.equalsIgnoreCase(Integer.toString(car.getYear())) ||
                    key.equalsIgnoreCase(car.getColor())
            )
                displayCar(car);
        }
    }
}
