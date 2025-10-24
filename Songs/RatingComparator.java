package day5;

import java.util.Comparator;

/**
 * Comparator for comparing Songs based on their rating.
 */
public class RatingComparator implements Comparator<Songs> {

    @Override
    public int compare(Songs o1, Songs o2) {
        return Integer.compare(o1.getRating(), o2.getRating());
    }
}
