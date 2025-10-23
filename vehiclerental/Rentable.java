package day2;

/**
 * Interface representing rentable vehicles.
 * Classes implementing this interface must define
 * the logic for calculating rental costs based on hours.
 */
public interface Rentable {
    /**
     * Calculates and returns the rental cost for the given duration.
     */
    int rent(int hours);
}
