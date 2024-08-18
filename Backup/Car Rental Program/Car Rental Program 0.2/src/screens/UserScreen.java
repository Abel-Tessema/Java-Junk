package screens;

import services.UserService;
import utility.Console;

import java.time.LocalDateTime;

public class UserScreen {
    private final BookCarScreen bookCarScreen = new BookCarScreen();
    private final AllCarsScreen allCarsScreen = new AllCarsScreen();
    private final CarFilterScreen carFilterScreen = new CarFilterScreen();
    private final SearchCarScreen searchCarScreen = new SearchCarScreen();
    private final RentedCarsScreen rentedCarsScreen = new RentedCarsScreen();
    private final AccountScreen accountScreen = new AccountScreen();
    private final FaqScreen faqScreen = new FaqScreen();
    private final LogoutScreen logoutScreen = new LogoutScreen();

    public void display() {
        System.out.println();
        System.out.println("Welcome Screen > Log In > User Main Menu");
        int currentHour = LocalDateTime.now().getHour();
        if (currentHour >= 6 && currentHour < 12)
            System.out.print("Good morning, ");
        else if (currentHour >= 12 && currentHour < 18)
            System.out.print("Good afternoon, ");
        else
            System.out.print("Good evening, ");
        System.out.println(UserService.getUser().getName() + ".");
        System.out.println("What would you like to do?");
        System.out.println("1) Book a car");
        System.out.println("2) See the list of all cars");
        System.out.println("3) List cars with filter");
        System.out.println("4) Search for a car");
        System.out.println("5) List all cars you've rented");
        System.out.println("6) Modify your user account");
        System.out.println("7) FAQ");
        System.out.println("8) Log out");

        int userMainMenuChoice = (int) Console.readNumber("Choice", 1, 8);

        switch (userMainMenuChoice) {
            case 1: bookCarScreen.displayScreen(); break;
            case 2: allCarsScreen.displayScreen(); break;
            case 3: carFilterScreen.displayScreen(); break;
            case 4: searchCarScreen.displayScreen(); break;
            case 5: rentedCarsScreen.displayScreen(); break;
            case 6: accountScreen.displayScreen(); break;
            case 7: faqScreen.displayScreen(); display(); break;
            case 8: logoutScreen.displayScreen(); break;
        }
    }
}
