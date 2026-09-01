// interface - defines a contract that a class must follow
interface Insurable {
    double calculatePremium();
}

// parent class (superclass)
class Vehicle {
    String brand;
    int topSpeed;

    Vehicle(String brand, int topSpeed) {
        this.brand = brand;
        this.topSpeed = topSpeed;
    }

    void displayInfo() {
        System.out.println("Brand: " + brand + " | Top Speed: " + topSpeed + " km/h");
    }
}

// child class - inherits from Vehicle, implements Insurable interface
class Car extends Vehicle implements Insurable {
    int numDoors;

    Car(String brand, int topSpeed, int numDoors) {
        super(brand, topSpeed);   // calling parent class constructor
        this.numDoors = numDoors;
    }

    // overriding parent method
    void displayInfo() {
        super.displayInfo();      // reuse parent's version too
        System.out.println("Doors: " + numDoors);
    }

    // implementing the interface method
    public double calculatePremium() {
        return topSpeed * 10.5;   // just a simple formula for demo
    }
}

// another child class - inherits from Vehicle only
class Bike extends Vehicle {
    Bike(String brand, int topSpeed) {
        super(brand, topSpeed);
    }
}

public class assignment7 {
    public static void main(String[] args) {

        Car car = new Car("Toyota", 180, 4);
        System.out.println("----- Car Details -----");
        car.displayInfo();
        System.out.println("Insurance Premium: " + car.calculatePremium());
        System.out.println();

        Bike bike = new Bike("Yamaha", 150);
        System.out.println("----- Bike Details -----");
        bike.displayInfo();   // uses Vehicle's version since Bike doesn't override it
    }
}