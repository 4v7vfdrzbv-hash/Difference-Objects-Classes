// Main.java
// This program creates objects from the Car class.

public class Main {
    public static void main(String[] args) {

        // Create two OBJECTS from the same CLASS
        Car car1 = new Car("Red");
        Car car2 = new Car("Blue");

        // Each object starts the same
        car1.showInfo();
        car2.showInfo();

        // Change only car1
        car1.accelerate();
        car1.accelerate();

        // Show that objects are independent
        car1.showInfo();
        car2.showInfo();
    }
}
