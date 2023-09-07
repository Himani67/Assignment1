import java.util.Random;
import java.util.Scanner;

public class assignment1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String validUsername = "DWIT";
        String validPassword = "1234";

        System.out.print("Enter your username: ");
        String usernameInput = scanner.nextLine();
        System.out.print("Enter your password: ");
        String passwordInput = scanner.nextLine();

        if (usernameInput.equals(validUsername) && passwordInput.equals(validPassword)) {
            System.out.println("Welcome to the tool selection menu!");
            System.out.println("Choose an operation:");
            System.out.println("1. Calculator");
            System.out.println("2. Number Guessing Game");
            System.out.println("3. Simple Interest Calculator");
            System.out.println("4. Vowel or Consonant Checker");

            int selectedTool = scanner.nextInt();

            switch (selectedTool) {
                case 1:
                    System.out.println("You have selected the Calculator.");
                    System.out.print("Enter an operation (+, -, *, /): ");
                    String operation = scanner.next();
                    System.out.print("Enter the first number: ");
                    double firstNumber = scanner.nextDouble();
                    System.out.print("Enter the second number: ");
                    double secondNumber = scanner.nextDouble();

                    double num1, num2;
                    double greaterNumber = Math.max(firstNumber, secondNumber);

                    if (greaterNumber == firstNumber) {
                        num1 = firstNumber;
                        num2 = secondNumber;
                    } else if (greaterNumber == secondNumber) {
                        num2 = firstNumber;
                        num1 = secondNumber;
                    } else {
                        num1 = firstNumber;
                        num2 = secondNumber;
                    }

                    switch (operation) {
                        case "+":
                            System.out.println("The sum is: " + (firstNumber + secondNumber));
                            break;
                        case "-":
                            System.out.println("The difference is: " + (num1 - num2));
                            break;
                        case "*":
                            System.out.println("The result is: " + (num1 * num2));
                            break;
                        case "/":
                            if (num2 != 0) {
                                System.out.println("The division is: " + (num1 / num2));
                            } else {
                                System.out.println("Division by zero is not allowed.");
                            }
                            break;
                        default:
                            System.out.println("Invalid operation.");
                    }
                    break;
                case 2:
                    Random random = new Random();
                    int chosenNumber = random.nextInt(51);

                    System.out.println("Number Guessing Game");
                    int numberOfGuesses = 0;

                    while (true) {
                        System.out.print("Enter your guess (1-50): ");
                        int guess = scanner.nextInt();
                        numberOfGuesses++;

                        if (guess == chosenNumber) {
                            System.out.println("Congratulations! Your guess is correct.");
                            System.out.println("Number of guesses: " + numberOfGuesses);
                            break;
                        } else if (guess < chosenNumber) {
                            System.out.println("Try a higher number.");
                        } else {
                            System.out.println("Try a lower number.");
                        }
                    }
                    break;
                case 3:
                    System.out.println("Simple Interest Calculator");
                    System.out.print("Enter the principal amount: ");
                    double principalAmount = scanner.nextDouble();
                    System.out.print("Enter the time (in years): ");
                    double timePeriod = scanner.nextDouble();
                    System.out.print("Enter the annual interest rate: ");
                    double interestRate = scanner.nextDouble();

                    double simpleInterest = (principalAmount * timePeriod * interestRate) / 100;
                    System.out.println("Simple Interest is: " + simpleInterest);
                    break;
                case 4:
                    System.out.println("Vowel or Consonant Checker");
                    System.out.print("Enter a character: ");
                    String character = scanner.next().toLowerCase();

                    if (character.length() == 1) {
                        char charInput = character.charAt(0);

                        if (charInput == 'a' || charInput == 'e' || charInput == 'i' || charInput == 'o' || charInput == 'u') {
                            System.out.println("It is a vowel.");
                        } else {
                            System.out.println("It is a consonant.");
                        }
                    } else {
                        System.out.println("Please enter only one valid character.");
                    }
                    break;
                default:
                    System.out.println("Invalid tool selection.");
            }
        } else {
            System.out.println("Invalid login credentials. Please try again.");
        }
    }
}
