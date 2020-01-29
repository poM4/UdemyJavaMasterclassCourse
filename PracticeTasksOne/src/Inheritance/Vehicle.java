package Inheritance;

// Challenge.
// Start with a base class of a Vehicle, then create a Car class that inherits from this base class.
// Finally, create another class, a specific type of Car that inherits from the Car class.
// You should be able to hand steering, changing gears, and moving (speed in other words).
// You will want to decide where to put the appropriate state and behaviours (fields and methods).
// As mentioned above, changing gears, increasing/decreasing speed should be included.
// For you specific type of vehicle you will want to add something specific for that type of car.

public class Vehicle {

    private String name;
    private String size;

    private int currentDirection;
    private int currentVelocity;

    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;
        this.currentVelocity = 0;
        this.currentVelocity = 0;
    }

    public void steer(int direction) {
        this.currentDirection+=direction;
        System.out.println("Vehicle steers at " + currentDirection + " degrees");
    }

    public void move(int direction, int speed) {
        currentVelocity=speed;
        currentDirection=direction;
        System.out.println("Vehicle moves at: " + currentVelocity + " in direction" + currentDirection);

    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public void stop() {
        this.currentVelocity=0;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }
}
