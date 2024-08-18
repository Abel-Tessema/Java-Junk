package utility;

import java.io.IOException;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Reads numbers or text from the console.
 */
public abstract class Console {
    private static final Scanner scanner = new Scanner(System.in);
    private static String input;

    public static String readText(String prompt, Pattern pattern, String correctionText) {
        String temp;
        while (true) {
            System.out.print(prompt + ": ");
            input = scanner.nextLine();
            Matcher matcher = pattern.matcher(input);
            if (matcher.matches()) break;
            System.out.println(correctionText);
        }
        return input;
    }
    public static double readNumber(String prompt, double min, double max) {
        String formattedMin = NumberFormat.getIntegerInstance().format(min);
        String formattedMax = NumberFormat.getIntegerInstance().format(max);
        double value;
        while (true) {
            try {
                System.out.print(prompt + ": ");
                input = scanner.nextLine();
                value = Double.parseDouble(input);
                if (value >= min && value <= max) break;
                System.out.println("Please enter a value between (and including) " + formattedMin + " and " + formattedMax + ".");
            } catch (Exception e) {
                System.out.println("Please enter a value between (and including) " + formattedMin + " and " + formattedMax + ".");
            }
        }
        return value;
    }

    public static LocalDate readDate(String prompt, LocalDate minDate, String correctionText) {
        String inputDate;
        LocalDate date;
        while (true) {
            try {
                inputDate = readText(prompt, Patterns.noPattern, "Too many characters. Please try again.");
                date = LocalDate.parse(inputDate);
                if (date.isEqual(minDate) || date.isAfter(minDate)) break;
                System.out.println(correctionText);
            }
            catch (DateTimeParseException e) {
                System.out.println("Please enter a date with a valid format (e.g. 2024-01-01).");
            }
        }
        return date;
    }
    public static void continueOnEnter() {
        System.out.println();
        System.out.print("Press 'Enter' to continue...");
        try {
            while (System.in.read() != '\n');
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
