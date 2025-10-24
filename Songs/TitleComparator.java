package day5;

import java.util.Comparator;

/**
 * Comparator for comparing Songs based on their title alphabetically.
 */
public class TitleComparator implements Comparator<Songs> {

    @Override
    public int compare(Songs o1, Songs o2) {
        return o1.getTitle().compareTo(o2.getTitle());
    }
}
