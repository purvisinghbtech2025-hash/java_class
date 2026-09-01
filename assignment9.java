// final class - cannot be inherited/extended by any other class
final class Constants {
    static final double PI = 3.14159;
}

class Vehicle {
    // final method - cannot be overridden by any subclass
    final void displayBrandInfo() {
        System.out.println("This is a generic vehicle brand.");
    }

    void displaySpeed() {
        System.out.println("Speed info not set.");
    }
}

class Car extends Vehicle {
    // allowed - overriding a normal (non-final) method
    void displaySpeed() {
        System.out.println("Car top speed: 180 km/h");
    }

    // NOT allowed - uncommenting this would give a compile error
    // because displayBrandInfo() is final in the parent class
    /*
    void displayBrandInfo() {
        System.out.println("Trying to override final method");
    }
    */
}

public class assignment9 {
    public static void main(String[] args) {

        // final variable - value cannot be changed once assigned
        final double RADIUS = 5.0;
        System.out.println("Radius: " + RADIUS);

        double area = Constants.PI * RADIUS * RADIUS;
        System.out.println("Area of circle: " + area);

        // RADIUS = 10.0;   // NOT allowed - would give compile error, final variable can't be reassigned

        Car car = new Car();
        car.displayBrandInfo();   // inherited final method, used as-is
        car.displaySpeed();       // overridden method
    }
}

// class Constants cannot be extended:
// class ExtraConstants extends Constants { }   // NOT allowed - compile error, Constants is final