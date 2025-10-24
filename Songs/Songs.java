package day5;

import java.util.Set;
import java.util.TreeSet;

/**
 * The Songs class represents a song with its title, artists,
 * release year, serial number, and rating.
 */
public class Songs implements Comparable<Songs> {

    private int sno;
    private String title;
    private Set<String> artists = new TreeSet<>();
    private int releaseYear;
    private int rating;

    public Songs(int sno, String title, Set<String> artists, int releaseYear, int rating) {
        this.sno = sno;
        this.title = title;
        this.artists = artists;
        this.releaseYear = releaseYear;
        this.rating = rating;
    }

    public Songs(String title, int releaseYear) {
        this.title = title;
        this.releaseYear = releaseYear;
    }

    // Getters and Setters
    public int getSno() { return sno; }
    public void setSno(int sno) { this.sno = sno; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public Set<String> getArtists() { return artists; }
    public void setArtists(Set<String> artists) { this.artists = artists; }

    public int getReleaseYear() { return releaseYear; }
    public void setReleaseYear(int releaseYear) { this.releaseYear = releaseYear; }

    public int getRating() { return rating; }
    public void setRating(int rating) { this.rating = rating; }

    @Override
    public String toString() {
        return "Songs [sno=" + sno +
               ", title=" + title +
               ", artists=" + artists +
               ", releaseYear=" + releaseYear +
               ", rating=" + rating + "]";
    }

    /**
     * Natural ordering of songs (optional).
     * Currently unused but can be defined as per need.
     */
    @Override
    public int compareTo(Songs o) {
        // Could be by title or release year; returning 0 disables natural sorting.
        return 0;
    }
}
