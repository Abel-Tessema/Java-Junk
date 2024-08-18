package screens;

import utility.Console;

public class CarFilterScreen {
    private final CarBrandScreen carBrandScreen = new CarBrandScreen();
    private final CarTypeScreen carTypeScreen = new CarTypeScreen();
    private final CarYearScreen carYearScreen = new CarYearScreen();
    private final UserScreen userScreen = new UserScreen();
    public void displayScreen() {
        System.out.println();
        System.out.println("... > User Main Menu > List Cars with Filter");
        System.out.println("Which filter do you choose?");
        System.out.println("1) Brand");
        System.out.println("2) Type");
        System.out.println("3) Year");
        System.out.println("4) Go back");

        int carFilterChoice = (int) Console.readNumber("Choice", 1, 4);

        switch (carFilterChoice) {
            case 1: carBrandScreen.display(); break;
            case 2: carTypeScreen.display(); break;
            case 3: carYearScreen.display(); break;
            case 4: userScreen.display(); break;
        }

    }
}
