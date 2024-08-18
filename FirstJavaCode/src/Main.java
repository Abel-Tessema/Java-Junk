import java.awt.*;
import java.io.*;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File file = new File("/Volumes/Béla Jash/Java/FirstJavaCode/src/file.txt");
        try {
            FileReader reader = new FileReader(file);
            StringBuilder string = new StringBuilder();
            for (int i = 0; i < file.length(); i++) {
                char ch = (char)reader.read();
                string.append(ch);
            }
            System.out.print(string);
//            System.out.println(ch);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }



        /*var textBox1 = new TextBox();
        textBox1.setText("Box 1");
        System.out.println(textBox1.text.toUpperCase());
        var textBox2 = new TextBox();
        textBox2.setText("Box 2");
        System.out.println(textBox2.text);*/

//        System.out.print("Number: ");
//        int number = new Scanner(System.in).nextInt();
//        if (number % 15 == 0) System.out.println("FizzBuzz");
//        else if (number % 3 == 0) System.out.println("Fizz");
//        else if (number % 5 == 0) System.out.println("Buzz");
//        else System.out.println(number);

////        InputStream inputStream = System.in;
//        System.out.print("Name: ");
//        Scanner scanner = new Scanner(System.in);
//        String name = scanner.nextLine().trim();
//        System.out.println("You are " + name + ".");

//        NumberFormat currency = NumberFormat.getCurrencyInstance();
//        String formattedCurrency = currency.format(123456.789);
//        System.out.println(formattedCurrency);
//        NumberFormat percentage = NumberFormat.getPercentInstance();
//        String formattedPercentage = percentage.format(10.59);
//        System.out.println(formattedPercentage);

//        short x = (short) 123456;
//        System.out.println(x);

//        double result = (double)10 / 3;
//        System.out.println(result);

//        int[] numbers = new int[5];
//        numbers[0] = 1;
//        numbers[1] = 2;
//        numbers[2] = -2;
//        Arrays.sort(numbers);
//        System.out.println(Arrays.toString(numbers));

//        String message = "     Yah    allo!";
//        System.out.println(message.trim());
//        System.out.println(message);

//        long viewsCount = 3_123_456_789L;
//        boolean isEligible = true;
//        Date now = new Date();
//        Point point1 = new Point(1,2);
//        Point point2 = point1;
//        point1.x = 5;
//        System.out.println(point2);
//        System.out.println(now);

    }
}