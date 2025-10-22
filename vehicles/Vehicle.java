/**
 * The Vehicle class represents a general vehicle with basic attributes
 * like make and vehicle number.
 * This is the superclass for all specific types of vehicles.
 */
public class Vehicle {
    // Private instance variables to maintain encapsulation
    private String make;
    private int vehicleNumber;
  
    public Vehicle(String make, int vehicleNumber) {
        this.make = make;
        this.vehicleNumber = vehicleNumber;
    }

    // Getters for accessing private fields
    public String getMake() {
        return make;
    }

    public int getVehicleNumber() {
        return vehicleNumber;
    }

    /**
     * Displays basic vehicle information.
     */
    public void displayInfo() {
        System.out.println("Vehicle Make: " + make);
        System.out.println("Vehicle Number: " + vehicleNumber);
    }
}

