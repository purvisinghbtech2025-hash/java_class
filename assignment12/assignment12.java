// importing the class from our user-defined package
import mypackage.calculator;

public class assignment12 {
    public static void main(String[] args) {

        calculator calc = new calculator();

        System.out.println("Add: " + calc.add(10, 5));
        System.out.println("Subtract: " + calc.subtract(10, 5));
        System.out.println("Multiply: " + calc.multiply(10, 5));
    }
}