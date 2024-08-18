package operations;

import models.User;
import models.Car;
import models.Lists;
import utility.Console;
import utility.Patterns;

import java.time.LocalDate;
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
            System.out.println("Your email or phone number, and/or password is incorrect. Please try again.");
        }
        System.out.println("Login successful!");
        Console.continueOnEnter();
    }

    // ====================== Sign Up ======================
    public static void signUp() {
        User newUser = new User();
        String name = Console.readText("Enter your full name", Patterns.namePattern, "Please enter your full name with the correct format (e.g. John Doe).");
        String phoneNumber = Console.readText("Enter your phone number", Patterns.phoneNumberPattern, "Please enter your phone number with the correct format (09/07xxxxxxxx).");
        String email = Console.readText("Enter your email address", Patterns.emailPattern, "Please enter your email address with the correct format (e.g. janedoe123@gmail.com).");
        String password = Console.readText("Enter your password", Patterns.passwordPattern, "Your password should contain only the English alphabet letters, numbers, and/or symbols, and should be from 8 to 25 characters long.");
        Console.readText("Confirm your password", Pattern.compile(password), "The confirmed password doesn't match the original one. Please try again.");

        newUser.setName(name);
        newUser.setPhoneNumber(phoneNumber);
        newUser.setEmail(email);
        newUser.setPassword(password);
        user = newUser;
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
        int carId = (int) Console.readNumber("Enter the ID number of the car you want to rent", 1, Lists.cars.size());
        Car car = Lists.cars.get(carId - 1);
        int carQuantity = (int) Console.readNumber("Enter the quantity of this car you want to rent", 1, car.getQuantityAvailable());
        LocalDate startDate = Console.readDate("Enter the starting date (yyyy-mm-dd)", LocalDate.now(), "Starting date should be no earlier than today. Please try again.");
        LocalDate endDate = Console.readDate("Enter the ending date (yyyy-mm-dd)", startDate, "Ending date should be no earlier than the starting date.");
        // ToDo: Figure out the logic of booking cars and the interplay between two users booking the same car, and write the code here
        car.setQuantityAvailable(car.getQuantityAvailable() - carQuantity);

        System.out.println("Car booked successfully.");
    }

    // ====================== Getters ======================
    public static User getUser() {
        return user;
    }
}
