public class Main {
    public static void main(String[] args) {
        TwoWheeler bike = new TwoWheeler("Yamaha", 101, "Sports");
        FourWheeler car = new FourWheeler("Honda", 202, "Automatic");

        System.out.println("--- Two Wheeler Details ---");
        bike.displayInfo();

        System.out.println("\n--- Four Wheeler Details ---");
        car.displayInfo();
    }
}
