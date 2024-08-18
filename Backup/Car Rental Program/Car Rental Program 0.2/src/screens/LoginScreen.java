package screens;

import services.UserService;
import utility.Console;
import utility.Patterns;

public class LoginScreen {
    private final UserService userService = new UserService();
    private final UserScreen userScreen = new UserScreen();
    public void displayScreen() {
        System.out.println();
        System.out.println("Welcome Screen > Log In");
        System.out.println("Enter your credentials to log in.");
        String emailOrPhoneNumber = Console.readText("Enter your email or phone number", Patterns.noPattern, "Too many characters. Please try again.");
        String password = Console.readText("Enter your password", Patterns.noPattern, "Too many characters. Please try again.");;

        userService.logIn(emailOrPhoneNumber, password);

        userScreen.display();
    }
}
