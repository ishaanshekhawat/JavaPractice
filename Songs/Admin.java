package day5;

import java.util.Collections;
import java.util.List;

/**
 * The Admin class demonstrates how to work with a collection of Songs.
 * It includes sorting, searching, filtering, and finding min/max ratings.
 */
public class Admin {

    public static void main(String[] args) {

        // Retrieve sample song data
        List<Songs> songList = SongsCollection.getSongsData();

        System.out.println("------ Original Song List --------");
        SongsCollection.printList(songList);

        System.out.println("------ Sort by Song Title --------");
        Collections.sort(songList, new TitleComparator());
        SongsCollection.printList(songList);

        System.out.println("------ Search by Song Title --------");
        int found = Collections.binarySearch(songList, new Songs(0, "Sundar", null, 0, 0), new TitleComparator());
        System.out.println("Data found at index: " + found);

        System.out.println("----------- Filter by Release Year -------");
        List<Songs> filteredByYear = SongsCollection.filterByYear(songList, 2025);
        System.out.println(filteredByYear);

        System.out.println("----------- Filter by Artist -------");
        List<Songs> filteredByArtist = SongsCollection.filterByArtist(songList, "AR Rahman");
        System.out.println(filteredByArtist);

        System.out.println("----------- List by Title and Year -------");
        SongsCollection.printTitlesAndYears(songList);

        System.out.println("----------- Minimum Rating -------");
        System.out.println(Collections.min(songList, new RatingComparator()));

        System.out.println("----------- Maximum Rating -------");
        System.out.println(Collections.max(songList, new RatingComparator()));
    }
}
