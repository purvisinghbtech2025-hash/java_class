import java.util.InputMismatchException;
import java.util.Scanner;

public class Assignment14 {

    public static void main(String[] args) {

        // ---------- 1. Basic try-catch ----------
        System.out.println("---- Basic try-catch ----");
        try {
            int a = 10;
            int b = 0;
            int result = a / b;   // causes ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }

        // ---------- 2. Multiple catch blocks ----------
        System.out.println("\n---- Multiple catch blocks ----");
        Scanner sc = new Scanner(System.in);
        try {
            int[] arr = new int[5];
            System.out.print("Enter an index (0-4): ");
            int index = sc.nextInt();
            arr[index] = 100;              // may cause ArrayIndexOutOfBoundsException
            System.out.println("Value set at index " + index);

            System.out.print("Enter a number to divide 100 by: ");
            int divisor = sc.nextInt();
            System.out.println("100 / " + divisor + " = " + (100 / divisor)); // may cause ArithmeticException

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Caught InputMismatchException: Please enter a valid integer.");
        }

        // ---------- 3. Nested try-catch ----------
        System.out.println("\n---- Nested try-catch ----");
        try {
            System.out.println("Outer try block start");

            try {
                int[] numbers = {1, 2, 3};
                System.out.println("Inner try block: accessing invalid index");
                System.out.println(numbers[5]);  // causes ArrayIndexOutOfBoundsException
            } catch (NullPointerException e) {
                // deliberately won't catch the above, to demonstrate propagation
                System.out.println("Inner catch: NullPointerException");
            }

            System.out.println("This line will not execute if inner exception is not caught");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Outer catch caught the exception from inner block: " + e.getMessage());
        } finally {
            System.out.println("Outer finally block executed");
        }

        // ---------- 4. try-catch-finally with class cast ----------
        System.out.println("\n---- try-catch-finally ----");
        try {
            Object obj = "This is a string";
            Integer num = (Integer) obj; // causes ClassCastException
            System.out.println(num);
        } catch (ClassCastException e) {
            System.out.println("Caught ClassCastException: " + e.getMessage());
        } finally {
            System.out.println("Finally block always executes");
        }

        sc.close();
        System.out.println("\nProgram completed successfully.");
    }
}