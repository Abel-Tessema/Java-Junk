package decision_trees;

import menus.UserMenu;
import models.Car;
import models.Lists;
import operations.UserOperation;
import utility.Console;
import utility.Patterns;

import java.util.regex.Pattern;

public class UserDecisionTree {
    public void startUserProgram() {
        welcomeMenuSwitch();
    }
    // ====================== Switches ======================
//    private void welcomeMenuSwitch() {
//        UserMenu.welcomeMenu();
//        int welcomeMenuChoice = (int) Console.readNumber("Choice", 1, 4);
//        switch (welcomeMenuChoice) {
//            case 1: loginDecision(); break;
//            case 2: signupDecision(); break;
//            case 3: UserMenu.faq(); welcomeMenuSwitch(); break;
//            case 4: break;
//        }
//    }

    private void userMainMenuSwitch() {
        UserMenu.userMainMenu();
        int userMainMenuChoice = (int) Console.readNumber("Choice", 1, 8);
        switch (userMainMenuChoice) {
            case 1: bookCarMenuDecision(); break;
            case 2: listAllCarsDecision(); break;
            case 3: listCarsWithFilterSwitch(); break;
            case 4: searchCarDecision(); break;
            case 5: listAllRentedCarsDecision(); break;
            case 6: editAccountMenuSwitch(); break;
            case 7: UserMenu.faq(); userMainMenuSwitch(); break;
            case 8: logOutMenuSwitch(); break;
        }
    }

    private void listCarsWithFilterSwitch() {
        UserMenu.listCarsWithFilter();
        int listCarsWithFilterChoice = (int) Console.readNumber("Choice", 1, 4);
        switch (listCarsWithFilterChoice) {
            case 1: listCarsByBrandDecision(); break;
            case 2: listCarsByTypeDecision(); break;
            case 3: listCarsByYearDecision(); break;
            case 4: userMainMenuSwitch(); break;
        }
    }

    private void editAccountMenuSwitch() {
        UserMenu.editAccountMenu();
        int editAccountChoice = (int) Console.readNumber("Choice", 1, 5);
        switch (editAccountChoice) {
            case 1: editNameDecision(); break;
            case 2: editPhoneNumberDecision(); break;
            case 3: editEmailAddressDecision(); break;
            case 4: editPasswordDecision(); break;
            case 5: userMainMenuSwitch(); break;
        }
    }

    // ====================== Decisions ======================
    private void bookCarMenuDecision() {
        UserMenu.bookCarMenu();
        UserOperation.bookCar();
        Console.continueOnEnter();
        userMainMenuSwitch();
    }

//    private void loginDecision() {
//        UserMenu.loginMenu();
//        UserOperation.logIn();
//        userMainMenuSwitch();
//    }

//    private void signupDecision() {
//        UserMenu.signupMenu();
//        UserOperation.signUp();
//        userMainMenuSwitch();
//    }


//    private void listAllCarsDecision() {
//        UserMenu.allCarsListMenu();
//        Car.listAllCars();
//        Console.continueOnEnter();
//        userMainMenuSwitch();
//    }

    private void listCarsByBrandDecision() {
        UserMenu.listCarsByBrandMenu();
        System.out.println("Here are all of the brands of the cars:");
        for (int i = 0; i < Lists.carBrands.size(); i++)
            System.out.println((i + 1) + ") " + Lists.carBrands.get(i));
        int carBrandChoice = (int) Console.readNumber("Choice", 1, Lists.carBrands.size());
        String carBrand = Lists.carBrands.get(carBrandChoice - 1);
        System.out.println("Here are the cars with the brand name \"" + carBrand + "\":");
        Car.listCarsByBrand(carBrand);
        Console.continueOnEnter();
        userMainMenuSwitch();
    }

    private void listCarsByTypeDecision() {
        System.out.println("Here are all of the types of the cars:");
        for (int i = 0; i < Lists.carTypes.size(); i++)
            System.out.println((i + 1) + ") " + Lists.carTypes.get(i));
        int carTypeChoice = (int) Console.readNumber("Choice", 1, Lists.carTypes.size());
        String carType = Lists.carTypes.get(carTypeChoice - 1);
        System.out.println("Here are the cars of the type \"" + carType + "\":");
        Car.listCarsByType(carType);
        Console.continueOnEnter();
        userMainMenuSwitch();
    }

    private void listCarsByYearDecision() {
        UserMenu.listCarsByYearMenu();
        System.out.println("Here are all of the years of the cars:");
        for (int i = 0; i < Lists.carYears.size(); i++)
            System.out.println((i + 1) + ") " + Lists.carYears.get(i));
        int carYearChoice = (int) Console.readNumber("Choice", 1, Lists.carYears.size());
        int carYear = Lists.carYears.get(carYearChoice - 1);
        System.out.println("Here are the cars of the year \"" + carYear + "\":");
        Car.listCarsByYear(carYear);
        Console.continueOnEnter();
        userMainMenuSwitch();
    }

    private void searchCarDecision() {
        UserMenu.searchCarMenu();
        String key = Console.readText("Enter the car's id, brand, model, type, year, or color", Patterns.noPattern, "Too many characters. Please try again.");
        System.out.println("Here are the cars with properties that match the term \"" + key + "\":");
        System.out.println("(If you don't see any car, that means there are none with that property.)");
        Car.searchCar(key);
        Console.continueOnEnter();
        userMainMenuSwitch();
    }

    private void listAllRentedCarsDecision() {
        UserMenu.listAllRentedCarsMenu();
        System.out.println("Here are the cars you're currently renting:");
        System.out.println("(If you don't see any car, that means there are none you have rented.)");
        UserOperation.getUser().listRentedCars();
        Console.continueOnEnter();
        userMainMenuSwitch();
    }

    private void editNameDecision() {
        UserMenu.editNameMenu();
        System.out.println("Your previous name is: " + UserOperation.getUser().getName() + ".");
        String newName = Console.readText("Enter your new full name", Patterns.namePattern, "Please enter your full name with the correct format (e.g. John Doe).");
        while (true) {
            String password = Console.readText("Enter your password", Patterns.noPattern, "Too many characters. Please try again.");
            if (password.equals(UserOperation.getUser().getPassword())) {
                UserOperation.getUser().setName(newName);
                break;
            }
            System.out.println("Incorrect password. Please try again.");
        }
        System.out.println("You have changed your name successfully, " + newName + ".");
        Console.continueOnEnter();
        editAccountMenuSwitch();
    }

    private void editPhoneNumberDecision() {
        UserMenu.editPhoneNumberMenu();
        System.out.println("Your previous phone number is: " + UserOperation.getUser().getPhoneNumber() + ".");
        String newPhoneNumber = Console.readText("Enter your new phone number", Patterns.phoneNumberPattern, "Please enter your phone number with the correct format (09/07xxxxxxxx).");
        while (true) {
            String password = Console.readText("Enter your password", Patterns.noPattern, "Too many characters. Please try again.");
            if (password.equals(UserOperation.getUser().getPassword())) {
                UserOperation.getUser().setPhoneNumber(newPhoneNumber);
                break;
            }
            System.out.println("Incorrect password. Please try again.");
        }
        System.out.println("You have changed your phone number successfully.");
        Console.continueOnEnter();
        editAccountMenuSwitch();
    }

    private void editEmailAddressDecision() {
        UserMenu.editEmailAddressMenu();
        System.out.println("Your previous email address is: " + UserOperation.getUser().getEmail() + ".");
        String newEmail = Console.readText("Enter your new email address", Patterns.emailPattern, "Please enter your email address with the correct format (e.g. janedoe123@gmail.com).");
        while (true) {
            String password = Console.readText("Enter your password", Patterns.noPattern, "Too many characters. Please try again.");
            if (password.equals(UserOperation.getUser().getPassword())) {
                UserOperation.getUser().setEmail(newEmail);
                break;
            }
            System.out.println("Incorrect password. Please try again.");
        }
        System.out.println("You have changed your email address successfully.");
        Console.continueOnEnter();
        editAccountMenuSwitch();
    }

    private void editPasswordDecision() {
        UserMenu.editPasswordMenu();
        Console.readText("Enter your previous password", Pattern.compile(UserOperation.getUser().getPassword()), "Incorrect password. Please try again.");
        String newPassword = Console.readText("Enter your new password", Patterns.passwordPattern, "Your password should contain only the English alphabet letters, numbers, and/or symbols, and should be from 8 to 25 characters long.");
        Console.readText("Confirm your new password", Pattern.compile(newPassword), "The confirmed password doesn't match the original one. Please try again.");
        UserOperation.getUser().setPassword(newPassword);
        System.out.println("You have changed your password successfully.");
        Console.continueOnEnter();
        editAccountMenuSwitch();
    }

    private void logOutMenuSwitch() {
        UserMenu.logoutMenu();
        int logOutMenuChoice = (int) Console.readNumber("Choice", 1, 2);
        switch (logOutMenuChoice) {
            case 1: welcomeMenuSwitch(); break;
            case 2: userMainMenuSwitch(); break;
        }
    }
}
