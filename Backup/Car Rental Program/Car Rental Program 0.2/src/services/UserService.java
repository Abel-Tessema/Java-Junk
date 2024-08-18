package services;

import models.User;
import models.Car;
import models.Lists;
import utility.Console;
import utility.Patterns;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class UserService {

    // ====================== Private Fields ======================
    private static User user;
    // ====================== Public Methods ======================

    // ====================== Log In ======================
    public void logIn(String emailOrPhoneNumber, String password) {
        List<User> users = new ArrayList<>();
        // ToDo: Initialize users from files
        while (true) {
            boolean accessGranted = false;
            for (User aUser : users)
                if (emailOrPhoneNumber.equals(aUser.getEmail()) ||
                        emailOrPhoneNumber.equals(aUser.getPhoneNumber()))
                    if (password.equals(aUser.getPassword())) {
                        user = aUser;
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
    public void signUp(String name, String phoneNumber, String email, String password) {
        User newUser = new User();

        newUser.setName(name);
        newUser.setPhoneNumber(phoneNumber);
        newUser.setEmail(email);
        newUser.setPassword(password);
        user = newUser;
        // ToDo: Write newUser to file

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
