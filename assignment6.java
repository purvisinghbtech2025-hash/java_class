public class assignment6 {

    // instance variable of outer class
    String carName = "Tesla Model 3";

    // inner class - class defined inside another class
    class Engine {
        void start() {
            System.out.println("Engine started for " + carName);
        }

        void stop() {
            System.out.println("Engine stopped for " + carName);
        }
    }

    // interface used to demonstrate anonymous class
    interface Greeting {
        void greet();
    }

    public static void main(String[] args) {

        // using the inner class - needs an object of outer class first
        assignment6 outerObj = new assignment6();
        assignment6.Engine engineObj = outerObj.new Engine();
        engineObj.start();
        engineObj.stop();
        System.out.println();

        // anonymous class - class with no name, created and used immediately
        Greeting greeting = new Greeting() {
        
            public void greet() {
                System.out.println("Hello! This is an anonymous class implementation.");
            }
        };
        greeting.greet();
    }
}
