package screens;

import services.CarService;
import utility.Console;
import utility.Patterns;

public class SearchCarScreen {
    private final CarService carService = new CarService();
    private final UserScreen userScreen = new UserScreen();
    public void displayScreen() {
        System.out.println("... > User Main Menu > Search Car");
        String key = Console.readText("Enter the car's id, brand, model, type, year, or color", Patterns.noPattern, "Too many characters. Please try again.");
        System.out.println("Here are the cars with properties that match the term \"" + key + "\":");
        System.out.println("(If you don't see any car, that means there are none with that property.)");
        carService.searchCar(key);
        Console.continueOnEnter();
        userScreen.display();
    }
}
