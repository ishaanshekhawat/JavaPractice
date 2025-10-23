package day2;

/**
 * The Policy class is responsible for displaying
 * insurance details for any Vehicle.
 */
public class Policy {

    /**
     * Displays insurance details for a given vehicle.
     * @param v The vehicle whose insurance info will be shown
     */
    public void displayInsurance(Vehicle v) {
        System.out.println("\n--- Insurance Details ---");
        System.out.println("Vehicle: " + v.getMake() + " " + v.getModel());
        System.out.println("Price: ₹" + v.getPrice());
        System.out.println("Calculated Insurance: ₹" + v.calculateInsurance());
    }
}
