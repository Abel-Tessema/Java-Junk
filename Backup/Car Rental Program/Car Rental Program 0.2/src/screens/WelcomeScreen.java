package screens;

import menus.UserMenu;
import models.SuperAdmin;
import utility.Console;

public class WelcomeScreen {
    // public void display() {}
    private final LoginScreen loginScreen = new LoginScreen();
    private final SignupScreen signupScreen = new SignupScreen();
    private final FaqScreen faqScreen = new FaqScreen();
    public void displayScreen() {
        System.out.println();
        System.out.println("Welcome to " + SuperAdmin.getCompanyName() + ".");
        System.out.println("What would you like to do?");
        System.out.println("1) Log in");
        System.out.println("2) Sign up");
        System.out.println("3) FAQ");
        System.out.println("4) Exit");

        int welcomeMenuChoice = (int) Console.readNumber("Choice", 1, 4);

        switch (welcomeMenuChoice) {
            case 1: loginScreen.displayScreen(); break;
            case 2: signupScreen.displayScreen(); break;
            case 3: faqScreen.displayScreen(); displayScreen(); break;
            case 4: break;
        }
    }
}
