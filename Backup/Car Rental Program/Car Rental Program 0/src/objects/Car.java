package objects;

public class Car {

    private int id;
    private String brand;
    private String model;
    private String type;
    private String color;
    private int year;
    private int quantityAvailable;
    private double baseRate;

    // ====================== Constructors ======================

    public Car() {}

    public Car(int id, String brand, String model, String type, String color, int year, int quantityAvailable, double baseRate) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.type = type;
        this.color = color;
        this.year = year;
        this.quantityAvailable = quantityAvailable;
        this.baseRate = baseRate;
    }

    // ====================== Displaying ======================
    public static void displayCarListHeaders() {
        System.out.printf("%-5s", "ID");
        System.out.printf("%-20s", "Brand");
        System.out.printf("%-20s", "Model");
        System.out.printf("%-20s", "Type");
        System.out.printf("%-20s", "Color");
        System.out.printf("%-15s", "Year");
        System.out.printf("%-25s", "Quantity Available");
        System.out.println("Base Rate");
    }

    public static void displayCar(Car car) {
        System.out.printf("%-5s", car.id);
        System.out.printf("%-20s", car.brand);
        System.out.printf("%-20s", car.model);
        System.out.printf("%-20s", car.type);
        System.out.printf("%-20s", car.color);
        System.out.printf("%-15s", car.year);
        System.out.printf("%-25s", car.quantityAvailable);
        System.out.printf("Br %.2f %n", car.baseRate);
    }

    // ====================== Listing ======================
    public static void listAllCars() {
        displayCarListHeaders();
        for (Car car : Lists.cars)
            displayCar(car);
    }

    public static void listCarsByBrand(String brand) {
        displayCarListHeaders();
        for (Car car : Lists.cars)
            if (brand.equals(car.brand))
                displayCar(car);
    }

    public static void listCarsByType(String type) {
        displayCarListHeaders();
        for (Car car : Lists.cars)
            if (type.equals(car.type))
                displayCar(car);
    }

    public static void listCarsByYear(int year) {
        displayCarListHeaders();
        for (Car car : Lists.cars)
            if (year == car.year)
                displayCar(car);
    }

    public static void searchCar(String key) {
        for (int i = 0; i < Lists.cars.size(); i++) {
            if (key.equalsIgnoreCase(Integer.toString(Lists.cars.get(i).id)) ||
                    key.equalsIgnoreCase(Lists.cars.get(i).brand) ||
                    key.equalsIgnoreCase(Lists.cars.get(i).model) ||
                    key.equalsIgnoreCase(Lists.cars.get(i).type) ||
                    key.equalsIgnoreCase(Integer.toString(Lists.cars.get(i).year)) ||
                    key.equalsIgnoreCase(Lists.cars.get(i).color)
            )
                displayCar(Lists.cars.get(i));
        }
    }
    // ====================== Getters
    public int getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public int getQuantityAvailable() {
        return quantityAvailable;
    }

    public double getBaseRate() {
        return baseRate;
    }
}
