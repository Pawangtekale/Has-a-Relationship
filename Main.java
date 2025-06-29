// Engine class
class Engine {
    private String type;

    public Engine(String type) {
        this.type = type;
    }

    public void start() {
        System.out.println(type + " engine starting...");
    }

    public void stop() {
        System.out.println(type + " engine stopping...");
    }
}
// Car class
class Car {
    private String make;
    private String model;
    private Engine engine; // Car has an Engine (composition)

    public Car(String make, String model, String engineType) {
        this.make = make;
        this.model = model;
        this.engine = new Engine(engineType); // Create an Engine object
    }

    public void drive() {
        System.out.println("Driving the " + make + " " + model + ".");
        engine.start(); // Using the Engine's method
    }

    public void park() {
        System.out.println("Parking the " + make + " " + model + ".");
        engine.stop(); // Using the Engine's method
    }
}
public class  Main
{
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Camry", "V6");
        myCar.drive();
        myCar.park();
    }
}
