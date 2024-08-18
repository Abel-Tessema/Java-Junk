package programs;

import models.User;
import models.Car;
import models.Lists;
import decision_trees.UserDecisionTree;

import java.util.Arrays;

public abstract class UserProgram {
    public static void main(String[] args) {
//        Lists.readListsFromFiles();
        // Start the program
//        Lists.writeListsToFiles();
        // "Goodbye!"
        testLists();
        UserDecisionTree tree = new UserDecisionTree();
        tree.startUserProgram();

        System.out.println("Goodbye!");
    }
    public static void testLists() {
        User user = new User("Bela Jash", "0999999999", "a@b.c", "111111111");
        Lists.users.add(user);
        Car car1 = new Car(1, "Mercedes-Benz", "SLR-McLaren", "Coupe", "Black", 2003, 5, , 1_500.50);
        Car car2 = new Car(2, "Mercedes-Benz", "SLS-AMG", "Coupe", "Yellow", 2000, 8, , 1_250.89);
        Car car3 = new Car(3, "Suzuki", "Dzire", "Sedan", "White", 2008, 25, , 738.42);
        Car car4 = new Car(4, "Suzuki", "Alto 660cc", "Sedan", "White", 2022, 20, , 612.97);
        Car car5 = new Car(5, "Toyota", "Vitz", "Sedan", "Silver", 2019, 32, , 577.08);
        Lists.cars.addAll(Arrays.asList(car1, car2,car3, car4, car5));
        Lists.initializeSubLists();

    }
}