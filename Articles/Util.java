package day7;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * Utility class for managing and filtering Article data.
 */
public class Util {

    private Util() {} // Prevent instantiation

    /**
     * Creates and returns a sample list of articles.
     */
    public static List<Article> addArticles() {
        List<String> categoryNames = List.of("Healthcare", "Children Health", "Covid");

        List<Article> articles = new ArrayList<>();

        Set<String> c1 = new TreeSet<>(Set.of(categoryNames.get(0), categoryNames.get(1)));
        articles.add(new Article(1, "Online Studies and Lack of Activity", 2021, 200, c1));

        Set<String> c2 = new TreeSet<>(Set.of(categoryNames.get(0)));
        articles.add(new Article(2, "Health is Wealth", 2023, 20000, c2));

        Set<String> c3 = new TreeSet<>(Set.of(categoryNames.get(2)));
        articles.add(new Article(3, "Covid is bad", 2023, 12100, c3));

        Set<String> c4 = new TreeSet<>(Set.of(categoryNames.get(1)));
        articles.add(new Article(4, "Children need to exercise more", 2022, 4832874, c4));

        Set<String> c5 = new TreeSet<>(Set.of(categoryNames.get(0), categoryNames.get(1), categoryNames.get(2)));
        articles.add(new Article(5, "Children need to play during lockdown", 2024, 42368, c5));

        Set<String> c6 = new TreeSet<>(Set.of(categoryNames.get(0)));
        articles.add(new Article(6, "Apples are keeping doctor away", 2021, 3214, c6));

        return articles;
    }

    /**
     * Filters the given list of articles by subject.
     */
    public static List<Article> filterBySubject(List<Article> articleList, String subject) {
        List<Article> filtered = new ArrayList<>();
        for (Article a : articleList) {
            if (a.getSubject().equals(subject)) {
                filtered.add(a);
            }
        }
        return filtered;
    }
}
