class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void displaySalary() {
        System.out.println("Base Salary: " + salary);
    }
}

class Manager extends Employee {
    double bonus;

    Manager(String name, double salary, double bonus) {
        super(name, salary);   // super() - calls parent class constructor
        this.bonus = bonus;
    }

    void displaySalary() {
        super.displaySalary();   // super.method() - calls parent's version of the method
        System.out.println("Bonus: " + bonus);
        double total = super.salary + bonus;
        System.out.println("Total Salary: " + total);   // super.variable - accessing parent's field
    }
}

public class assignment8f {
    public static void main(String[] args) {
        Manager mgr = new Manager("Riya Sharma", 50000, 8000);
        System.out.println("Name: " + mgr.name);
        mgr.displaySalary();
    }
}