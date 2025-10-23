package day2;

/**
 * Abstract base class representing a generic vehicle.
 * Implements Rentable and serves as a superclass
 * for specific vehicle types like TwoWheeler and FourWheeler.
 */
public abstract class Vehicle implements Rentable {

    protected int regNo;
    protected String make;
    protected String model;
    protected int price;
  
    public Vehicle(int regNo, String make, String model, int price) {
        this.regNo = regNo;
        this.make = make;
        this.model = model;
        this.price = price;
    }

    // Setters
    public void setRegNo(int regNo) {
        this.regNo = regNo;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    // Getters
    public int getRegNo() {
        return regNo;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getPrice() {
        return price;
    }

    /**
     * Abstract method to calculate insurance.
     * Must be implemented by subclasses.
     */
  
    public abstract double calculateInsurance();

    /**
     * Returns a formatted string representing the vehicle details.
     */
    @Override
    public String toString() {
        return "Vehicle [RegNo=" + regNo + ", Make=" + make + ", Model=" + model + ", Price=" + price + "]";
    }
}
