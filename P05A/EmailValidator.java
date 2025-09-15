import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator {
    public static void main(String[] args) {
        // Regex pattern for validating an email address
        String emailRegex = "^[a-zA-Z0-9]+@[a-zA-Z0-9]+.[a-zA-Z0_9]*$";

        // Compile the regex into a pattern
        Pattern pattern = Pattern.compile(emailRegex);

        // Create a scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Prompt user for an email address
        System.out.println("Enter an email address to validate:");
        String inputEmail = scanner.nextLine();

        // Create a matcher to check the input email
        Matcher matcher = pattern.matcher(inputEmail);

        // Check if the email matches the pattern
        if (matcher.matches()) {
            System.out.println("The email address is valid.");
        } else {
            System.out.println("The email address is invalid.");
        }

        scanner.close();
    }
}