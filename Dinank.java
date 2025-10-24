package day8;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * Demonstrates date and time operations using the Java Time API.
 */
public class Dinank {

    private static final LocalDate ISHAAN_DOB = LocalDate.of(2002, Month.SEPTEMBER, 9);
    private static final LocalDate AVIJAM_DOB = LocalDate.of(2003, Month.MARCH, 25);

    public static void main(String[] args) {
        LocalDate today = LocalDate.now();

        // 1. Calculate ages
        Period ageIshaan = ISHAAN_DOB.until(today);
        System.out.println("Ishaan's Age: " + ageIshaan.getYears());

        Period ageAvijam = AVIJAM_DOB.until(today);
        System.out.println("Avijam's Age: " + ageAvijam.getYears());

        // 2. Find Programmer’s Day (256th day of the year)
        LocalDate programmersDay = LocalDate.ofYearDay(2026, 256);
        System.out.println("Programmer's Day in 2026: " + programmersDay);

        // 3. List all Fridays that fall on the 13th in the current year
        LocalDate start = LocalDate.of(2025, 1, 1);
        LocalDate end = LocalDate.of(2026, 1, 1);

        System.out.println("Fridays on the 13th in 2025:");
        Stream<LocalDate> wholeYear = start.datesUntil(end);
        Predicate<LocalDate> friday13 = d ->
                d.getDayOfMonth() == 13 && d.getDayOfWeek().equals(DayOfWeek.FRIDAY);

        wholeYear.filter(friday13).forEach(System.out::println);
    }
}
