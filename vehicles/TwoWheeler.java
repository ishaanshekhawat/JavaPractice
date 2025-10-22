/**
 * The TwoWheeler class represents vehicles with two wheels,
 * such as motorcycles or scooters.
 * It extends the Vehicle class and adds handle-related details.
 */
public class TwoWheeler extends Vehicle {
    // Private field for the handle type (e.g., sports, standard)
    private String handleType;


    public TwoWheeler(String make, int vehicleNumber, String handleType) {
        super(make, vehicleNumber); // Call superclass constructor
        this.handleType = handleType;
    }

    // Getter for handleType
    public String getHandleType() {
        return handleType;
    }

    /**
     * Displays complete information about the two-wheeler.
     * Overrides the displayInfo() method from Vehicle.
     */
    @Override
    public void displayInfo() {
        super.displayInfo(); // Display base class details
        System.out.println("Handle Type: " + handleType);
    }
}
