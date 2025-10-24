package day7;

import java.util.Set;
import java.util.TreeSet;

/**
 * Represents an article with details such as serial number, subject, 
 * year of publishing, number of views, and associated categories.
 */
public class Article {

    private int sno;
    private String subject;
    private int yearOfPublishing;
    private int numberOfViews;
    private Set<String> categories = new TreeSet<>();

    public Article(int sno, String subject, int yearOfPublishing, int numberOfViews, Set<String> categories) {
        this.sno = sno;
        this.subject = subject;
        this.yearOfPublishing = yearOfPublishing;
        this.numberOfViews = numberOfViews;
        this.categories = categories;
    }

    // Getters and setters
    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    public int getNumberOfViews() {
        return numberOfViews;
    }

    public void setNumberOfViews(int numberOfViews) {
        this.numberOfViews = numberOfViews;
    }

    public Set<String> getCategories() {
        return categories;
    }

    public void setCategories(Set<String> categories) {
        this.categories = categories;
    }

    @Override
    public String toString() {
        return "Article [sno=" + sno + ", subject=" + subject + ", yearOfPublishing=" + yearOfPublishing
                + ", numberOfViews=" + numberOfViews + ", categories=" + categories + "]";
    }
}
