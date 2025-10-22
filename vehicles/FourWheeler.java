/**
 * The FourWheeler class represents vehicles with four wheels,
 * such as cars or jeeps.
 * It extends the Vehicle class and adds transmission details.
 */
public class FourWheeler extends Vehicle {
    // Private field for the transmission type (e.g., manual, automatic)
    private String transmissionType;

    public FourWheeler(String make, int vehicleNumber, String transmissionType) {
        super(make, vehicleNumber); // Call superclass constructor
        this.transmissionType = transmissionType;
    }

    // Getter for transmissionType
    public String getTransmissionType() {
        return transmissionType;
    }

    /**
     * Displays complete information about the four-wheeler.
     * Overrides the displayInfo() method from Vehicle.
     */
    @Override
    public void displayInfo() {
        super.displayInfo(); // Display base class details
        System.out.println("Transmission Type: " + transmissionType);
    }
}
