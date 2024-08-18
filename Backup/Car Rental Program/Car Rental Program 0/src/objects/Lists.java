package objects;

import accounts.Admin;
import accounts.User;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public abstract class Lists {
    // ====================== Reading and Writing ======================
    // To be called at the start and end of the program respectively
    public static void readListsFromFiles() {}
    public static void writeListsToFiles() {}

    // ====================== Lists ======================
    public static List<Car> cars = new ArrayList<>();
    public static List<User> users = new ArrayList<>();
    public static List<Admin> admins = new ArrayList<>();

    // ====================== Sub-Lists ======================
    public static List<String> carBrands = new ArrayList<>();
    public static List<String> carModels = new ArrayList<>();
    public static List<String> carTypes = new ArrayList<>();
    public static List<String> carColors = new ArrayList<>();
    public static List<Integer> carYears = new ArrayList<>();


    // ====================== Initializing Sub-Lists ======================
    public static void initializeSubLists() {
        for (Car car : cars) {
            carBrands.add(car.getBrand());
            carModels.add(car.getModel());
            carTypes.add(car.getType());
            carColors.add(car.getColor());
            carYears.add(car.getYear());
        }
        carBrands = sortAndRemoveDuplicate(carBrands);
        carModels = sortAndRemoveDuplicate(carModels);
        carTypes = sortAndRemoveDuplicate(carTypes);
        carColors = sortAndRemoveDuplicate(carColors);
        carYears = sortAndRemoveDuplicate(carYears);
    }

    private static <T> List<T> sortAndRemoveDuplicate(List<T> list) {
        return list.stream().sorted().distinct().collect(Collectors.toList());
    }

    // ====================== Sorting ======================
    public static void sortCars() {}
    public static void sortCarTypes() {}
    public static void sortCarBrands() {}

    // ====================== Reading from Files into Lists ======================

    public static void readCars() {}
    public static void readCarTypes() {}
    public static void readCarBrands() {}
    public static void readUsers() {}
    public static void readAdmins() {}


    // ToDo: Remove tests
    // ====================== Tests ======================

}
