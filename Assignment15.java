import java.util.Scanner;

public class Assignment15 {

    // Custom exception class (used to demonstrate 'throw' with user-defined exceptions)
    static class InvalidAgeException extends Exception {
        public InvalidAgeException(String message) {
            super(message);
        }
    }

    // Method that uses 'throws' to declare it might throw a checked exception
    static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            // 'throw' is used to actually raise the exception
            throw new InvalidAgeException("Age must be 18 or above. You entered: " + age);
        } else {
            System.out.println("Age is valid. Access granted.");
        }
    }

    // Method demonstrating 'throws' with a built-in unchecked exception
    static int divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return a / b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ---------- 1. finally block ----------
        System.out.println("---- Demonstrating finally ----");
        try {
            int[] arr = {1, 2, 3};
            System.out.println("Accessing valid index: " + arr[1]);
            System.out.println("Accessing invalid index: " + arr[5]); // throws ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed: this always runs, error or not.");
        }

        // ---------- 2. throw with custom exception ----------
        System.out.println("\n---- Demonstrating throw (custom exception) ----");
        try {
            System.out.print("Enter your age: ");
            int age = sc.nextInt();
            validateAge(age);   // may throw InvalidAgeException
        } catch (InvalidAgeException e) {
            System.out.println("Caught Custom Exception: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed after age validation.");
        }

        // ---------- 3. throws with built-in exception ----------
        System.out.println("\n---- Demonstrating throws (method declaration) ----");
        try {
            System.out.print("Enter numerator: ");
            int num = sc.nextInt();
            System.out.print("Enter denominator: ");
            int den = sc.nextInt();

            int result = divide(num, den);  // divide() declares 'throws ArithmeticException'
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed after division.");
        }

        // ---------- 4. throw with a general runtime exception directly ----------
        System.out.println("\n---- Demonstrating throw (built-in exception) ----");
        try {
            System.out.print("Enter a number (must be positive): ");
            int num = sc.nextInt();
            if (num < 0) {
                throw new IllegalArgumentException("Negative numbers are not allowed: " + num);
            }
            System.out.println("You entered a valid positive number: " + num);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed after number check.");
        }

        sc.close();
        System.out.println("\nProgram completed successfully.");
    }
}