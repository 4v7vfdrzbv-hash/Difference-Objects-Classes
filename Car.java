// Car.java
// This is a CLASS.
// A class is a blueprint used to create objects.

public class Car {

    // Variables describe each object
    String color;
    int speed;

    // Constructor runs when an object is created
    public Car(String carColor) {
        color = carColor;
        speed = 0;
    }

    // Method to increase speed
    public void accelerate() {
        speed += 10;
    }

    // Method to show object data
    public void showInfo() {
        System.out.println("Color: " + color + ", Speed: " + speed);
    }
}
