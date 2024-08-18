package menus;

import accounts.SuperAdmin;
import objects.Car;
import operations.UserOperation;
import utility.Console;

import java.time.LocalDateTime;

/**
 * <p>This class only displays user menus.</p>
 * <p>It doesn't do any operation.</p>
 */
public abstract class UserMenu {

    // ====================== Welcome Menu and Submenus ======================
    public static void welcomeMenu() {
        System.out.println();
        System.out.println("Welcome to " + SuperAdmin.getCompanyName() + ".");
        System.out.println("What would you like to do?");
        System.out.println("1) Log in");
        System.out.println("2) Sign up");
        System.out.println("3) FAQ");
        System.out.println("4) Exit");
    }

    public static void loginMenu() {
        System.out.println();
        System.out.println("Welcome Screen > Log In");
        System.out.println("Enter your credentials to log in.");
    }

    public static void signupMenu() {
        System.out.println();
        System.out.println("Welcome Screen > Sign Up");
        System.out.println("Enter your credentials to sign up.");
    }

    public static void faq() {
        System.out.println();
        System.out.println("FAQ");
        System.out.println("---");
        System.out.println("How is the usage fee calculated?");
        System.out.println("Is the mileage unlimited or is there a cap?");
        Console.continueOnEnter();
    }

    // ====================== USER MAIN MENU ======================
    public static void userMainMenu() {
        System.out.println();
        System.out.println("Welcome Screen > Log In > User Main Menu");
        int currentHour = LocalDateTime.now().getHour();
        if (currentHour >= 6 && currentHour < 12)
            System.out.print("Good morning, ");
        else if (currentHour >= 12 && currentHour < 18)
            System.out.print("Good afternoon, ");
        else
            System.out.print("Good evening, ");
        System.out.println(UserOperation.getUser().getName() + ".");
        System.out.println("What would you like to do?");
        System.out.println("1) Book a car");
        System.out.println("2) See the list of all cars");
        System.out.println("3) List cars with filter");
        System.out.println("4) Search for a car");
        System.out.println("5) List all cars you've rented");
        System.out.println("6) Update your user account");
        System.out.println("7) FAQ");
        System.out.println("8) Log out");
    }

    // ====================== Book Car Menu and Submenus ======================
    public static void bookCarMenu() {
        System.out.println();
        System.out.println("... > User Main Menu > Book a Car");
        System.out.println("How you would like to select a car?");
        System.out.println("1) List all cars and then select");
        System.out.println("2) List cars with filter and then select");
        System.out.println("3) Enter the id of the car");
        System.out.println("4) Go back");
        System.out.println("5) Main Menu");
    }

    public static void listAllCarsAndSelectMenu() {
        System.out.println();
        System.out.println("... > Book a Car > List All and Select");
        Car.listAllCars();
    }

    public static void listCarsWithFilterAndSelectMenu() {
        System.out.println();
        System.out.println("... > Book a Car > List with Filter");
        carFilterChoice();
        System.out.println("5) Return to main menu");
    }

    public static void listCarsByBrandMenu() {
        System.out.println();
        System.out.println("... > List with Filter > Brand");

    }
    
    public static void listCarsByTypeMenu() {
        System.out.println();
        System.out.println("... > List with Filter > Type");
    }
    
    public static void listCarsByYearMenu() {
        System.out.println();
        System.out.println("... > List with Filter > Year");
    }

    // ====================== Car List Menu and Submenus ======================
    public static void allCarsListMenu() {
        System.out.println();
        System.out.println("... > User Main Menu > List All Cars");
    }

    // ====================== List Cars with Filter Menu and Submenus ======================
    public static void listCarsWithFilter() {
        System.out.println();
        System.out.println("... > User Main Menu > List Cars with Filter");
        carFilterChoice();
    }
    
    // ====================== Search Car Menu and Submenus ======================
    // ToDo: Remove the old logic of the search method
    public static void searchCarMenu() {
        System.out.println("... > User Main Menu > Search Car");
    }

    // ====================== Rented Cars Menu and Submenus ======================
    public static void listAllRentedCarsMenu() {
        System.out.println();
        System.out.println("... > User Main Menu > List Rented Cars");
    }

    // ====================== Update Account Menu and Submenus ======================
    public static void editAccountMenu() {
        System.out.println();
        System.out.println("... > User Main Menu > Edit Account");
        System.out.println("What would you like to change?");
        System.out.println("1) Your name");
        System.out.println("2) Your phone number");
        System.out.println("3) Your email address");
        System.out.println("4) Your password");
        System.out.println("5) Go back");
    }

    public static void editNameMenu() {
        System.out.println();
        System.out.println("... > Edit Account > Name");
    }

    public static void editPhoneNumberMenu() {
        System.out.println();
        System.out.println("... > Edit Account > Phone Number");
    }

    public static void editEmailAddress() {
        System.out.println();
        System.out.println("... > Edit Account > Email Address");
    }

    public static void editPassword() {
        System.out.println();
        System.out.println("... > Edit Account > Password");
    }

    // ====================== Logout Menu and Submenus ======================
    public static void logoutMenu() {
        System.out.println();
        System.out.println("... > User Main Menu > Log Out");
        System.out.println("Are you sure you want to log out?");
        System.out.println("1) Yes");
        System.out.println("2) No");
    }

    // ====================== Private Static Methods ======================
    private static void carFilterChoice() {
        System.out.println("Which filter do you choose?");
        System.out.println("1) Brand");
        System.out.println("2) Type");
        System.out.println("3) Year");
        System.out.println("4) Go back");
    }

}
