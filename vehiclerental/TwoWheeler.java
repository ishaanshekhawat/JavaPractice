package day2;

/**
 * Represents a two-wheeler vehicle (e.g., bikes, scooters).
 * Extends the abstract Vehicle class.
 */
public class TwoWheeler extends Vehicle {
  
    public TwoWheeler(int regNo, String make, String model, int price) {
        super(regNo, make, model, price);
    }

    /**
     * Calculates the insurance amount for a two-wheeler.
     * 5% of the vehicle's price.
     */
    @Override
    public double calculateInsurance() {
        return price * 0.05;
    }

    /**
     * Calculates rental cost for a two-wheeler.
     * Base rate: 300/hour, with a late fee after 3 hours.
     */
    @Override
    public int rent(int hours) {
        int baseRate = 300;
        int lateFee = 100;

        if (hours <= 3) {
            return baseRate * hours;
        } else {
            return (baseRate * hours) + ((hours - 3) * lateFee);
        }
    }

    // Test method
    public static void main(String[] args) {
        TwoWheeler tw1 = new TwoWheeler(1, "Luna", "Suzuki", 100000);
        System.out.println("Insurance: " + tw1.calculateInsurance());
    }
}
