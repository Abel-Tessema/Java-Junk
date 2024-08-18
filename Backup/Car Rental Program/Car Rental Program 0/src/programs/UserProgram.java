package programs;

import accounts.User;
import menus.UserMenu;
import objects.Car;
import objects.Lists;
import decision_trees.UserDecisionTree;
import utility.Console;

import java.util.Arrays;

public abstract class UserProgram {
    public static void main(String[] args) {
//        Lists.readListsFromFiles();
        // Start the program
//        Lists.writeListsToFiles();
        // "Goodbye!"
        testLists();
        UserDecisionTree.startUserProgram();

        System.out.println("Goodbye!");
    }
    public static void testLists() {
        User user = new User("Bela Jash", "a@g.com", "0966917975", "11111111");
        Lists.users.add(user);
        Car car1 = new Car(1, "a", "b", "c", "d", 2000, 5, 500.50);
        Car car2 = new Car(1, "a", "bb", "cc", "dd", 2000, 5, 500.50);
        Car car3 = new Car(1, "abebe", "bb", "cc", "dd", 2000, 5, 500.50);
        Lists.cars.addAll(Arrays.asList(car1, car2,car3));
        Lists.initializeSubLists();
    }
}