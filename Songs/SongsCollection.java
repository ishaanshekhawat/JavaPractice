package day5;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * Utility class providing helper methods for managing a collection of songs.
 */
public class SongsCollection {

    /**
     * Returns a list of sample songs.
     */
    public static List<Songs> getSongsData() {
        List<Songs> songList = new ArrayList<>();

        // Create artist sets
        Set<String> artists1 = new TreeSet<>();
        artists1.add("AR Rahman");
        artists1.add("Papa");

        Set<String> artists2 = new TreeSet<>();
        artists2.add("Imran Khan");
        artists2.add("Lady Gaga");

        // Create songs
        Songs s1 = new Songs(1, "Sundar", artists1, 2025, 5);
        Songs s2 = new Songs(2, "Beautiful", artists2, 2024, 4);

        // Add songs to list
        songList.add(s1);
        songList.add(s2);

        return songList;
    }

    /**
     * Prints details of all songs in the provided list.
     */
    public static void printList(List<Songs> songList) {
        for (Songs s : songList) {
            System.out.println(s);
        }
    }

    /**
     * Removes a song from the list.
     */
    public static void removeSong(List<Songs> songList, Songs s) {
        songList.remove(s);
    }

    /**
     * Filters songs by their release year.
     */
    public static List<Songs> filterByYear(List<Songs> songList, int releaseYear) {
        List<Songs> filtered = new ArrayList<>();
        for (Songs s : songList) {
            if (s.getReleaseYear() == releaseYear) {
                filtered.add(s);
            }
        }
        return filtered;
    }

    /**
     * Filters songs by artist name.
     */
    public static List<Songs> filterByArtist(List<Songs> songList, String artist) {
        List<Songs> filtered = new ArrayList<>();
        for (Songs s : songList) {
            if (s.getArtists().contains(artist)) {
                filtered.add(s);
            }
        }
        return filtered;
    }

    /**
     * Displays each song's title and release year.
     */
    public static void printTitlesAndYears(List<Songs> songList) {
        for (Songs s : songList) {
            System.out.println("Title: " + s.getTitle() + ", Released in: " + s.getReleaseYear());
        }
    }
}
