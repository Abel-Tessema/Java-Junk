package screens;

import services.CarService;
import utility.Console;

public class AllCarsScreen {
    private final CarService carService = new CarService();
    private final UserScreen userScreen = new UserScreen();
    public void displayScreen() {
        System.out.println();
        System.out.println("... > User Main Menu > List All Cars");
        System.out.println("Here are all the available cars:");
        System.out.println("(If you don't see any car, that means all of them have been booked for the time being.)");
        carService.listAllCars();
        Console.continueOnEnter();
        userScreen.display();
    }
}
