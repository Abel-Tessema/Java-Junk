package operations;

import accounts.User;
import objects.Lists;
import utility.Console;
import utility.Patterns;

import java.util.regex.Pattern;

public abstract class UserOperation {

    // ====================== Private Fields ======================
    private static User user;
    // ====================== Public Methods ======================

    // ====================== Log In ======================
    public static void logIn() {
        while (true) {
            String emailOrPhoneNumber = Console.readText("Enter your email or phone number", Patterns.noPattern, "Too many characters. Please try again.");
            String password = Console.readText("Enter your password", Patterns.noPattern, "Too many characters. Please try again.");;
            boolean accessGranted = false;
            for (int i = 0; i < Lists.users.size(); i++)
                if (emailOrPhoneNumber.equals(Lists.users.get(i).getEmail()) ||
                        emailOrPhoneNumber.equals(Lists.users.get(i).getPhoneNumber()))
                    if (password.equals(Lists.users.get(i).getPassword())) {
                        user = Lists.users.get(i);
                        accessGranted = true;
                        break;
                    }
            if (accessGranted) break;
            System.out.println("Your email/phone number and/or password is incorrect. Please try again.");
        }
        System.out.println("Login successful!");
        Console.continueOnEnter();
    }

    // ====================== Sign Up ======================
    public static void signUp() {
        String name = Console.readText("Enter your full name", Patterns.namePattern, "Please enter your full name with the correct format (e.g. John Doe).");
        String phoneNumber = Console.readText("Enter your phone number", Patterns.phoneNumberPattern, "Please enter your phone number with the correct format (09/07xxxxxxxx).");
        String email = Console.readText("Enter your email address", Patterns.emailPattern, "Please enter your email address with the correct format (e.g. janedoe@gmail.com).");
        String password = Console.readText("Enter your password", Patterns.passwordPattern, "Your password should contain only the English alphabet letters, numbers, and/or symbols, and should be from 8 to 25 characters long.");
        Console.readText("Confirm your password", Pattern.compile(password), "The confirmed password doesn't match the original one. Please try again.");

        user.setName(name);
        user.setPhoneNumber(phoneNumber);
        user.setEmail(email);
        user.setPassword(password);
        Lists.users.add(user);

        System.out.println("Signup successful!");
        Console.continueOnEnter();
    }

    // ====================== Book a Car ======================
    public static void bookCar() {
        // Enter ID
        // Enter quantity
        // Enter starting date (dd/mm/yyyy)
        // Enter ending date (dd/mm/yyyy)
        // Recap inputted info and ask for confirmation
        // Booking successful
        // Console.continueOnEnter();
    }

    // ====================== Getters ======================
    public static User getUser() {
        return user;
    }
}
