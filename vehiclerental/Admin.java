package day2;

import java.util.Scanner;

/**
 * The Admin class demonstrates the use of inheritance,
 * abstraction, and interfaces by managing vehicles,
 * their insurance policies, and rental calculations.
 */
public class Admin {

    /**
     * Displays the rental cost for a given rentable vehicle and duration.
     */
    
    public void displayRent(Rentable vehicle, int hours) {
        int cost = vehicle.rent(hours);
        System.out.println("Rental cost for " + hours + " hours: ₹" + cost);
    }

    public static void main(String[] args) {
        Vehicle v1 = new TwoWheeler(1, "Lina", "Suzuki", 50000);
        Vehicle v2 = new FourWheeler(2, "Bugatti", "Chiron", 5000000);

        Policy policy = new Policy();

        System.out.println("Displaying Insurance Info:");
        policy.displayInsurance(v1);
        policy.displayInsurance(v2);

        Vehicle[] vehicles = { v1, v2 };

        System.out.println("\n--- Vehicle Summary ---");
        for (Vehicle v : vehicles) {
            System.out.println(v.toString());
            System.out.println("Insurance Amount: ₹" + v.calculateInsurance());
        }

        Admin admin = new Admin();
        Rentable bike = new TwoWheeler(3, "Hero", "Splendor", 60000);
        Rentable car = new FourWheeler(4, "Hyundai", "i20", 800000);

        admin.displayRent(bike, 2);
        admin.displayRent(car, 1);
        admin.displayRent(car, 6);
        admin.displayRent(bike, 5);

        // Interactive part
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("\nEnter the number of hours for bike: ");
            int hrBike = input.nextInt();
            admin.displayRent(bike, hrBike);

            System.out.print("Enter the number of hours for car: ");
            int hrCar = input.nextInt();
            admin.displayRent(car, hrCar);
        }
    }
}
