package day2;

/**
 * Represents a four-wheeler vehicle (e.g., cars).
 * Extends the abstract Vehicle class.
 */
public class FourWheeler extends Vehicle {

    public FourWheeler(int regNo, String make, String model, int price) {
        super(regNo, make, model, price);
    }

    /**
     * Calculates the insurance amount for a four-wheeler.
     * 10% of the vehicle's price.
     */
    @Override
    public double calculateInsurance() {
        return price * 0.10;
    }

    /**
     * Calculates rental cost for a four-wheeler.
     * Base rate: 500/hour, with a higher late fee after 3 hours.
     */
    @Override
    public int rent(int hours) {
        int baseRate = 500;
        int lateFee = 200;

        if (hours <= 3) {
            return baseRate * hours;
        } else {
            return (baseRate * hours) + ((hours - 3) * lateFee);
        }
    }

    // Test method
    public static void main(String[] args) {
        FourWheeler fw1 = new FourWheeler(2, "Nano", "Tata", 10000);
        System.out.println("Insurance: " + fw1.calculateInsurance());
    }
}
