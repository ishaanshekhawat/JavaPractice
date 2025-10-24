package day7;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Demonstrates filtering, sorting, and counting operations on articles.
 */
public class Tester {

    public static void main(String[] args) {
        List<Article> articles = Util.addArticles();

        // 1. Filter articles published in 2023
        List<Article> articles2023 = articles.stream()
                .filter(a -> a.getYearOfPublishing() == 2023)
                .collect(Collectors.toList());
        System.out.println("Articles published in 2023:");
        articles2023.forEach(System.out::println);

        // 2. Filter articles by a specific subject
        List<Article> articlesSubject = articles.stream()
                .filter(a -> a.getSubject().equals("Children need to exercise more"))
                .collect(Collectors.toList());
        System.out.println("\nArticles with subject 'Children need to exercise more':");
        articlesSubject.forEach(System.out::println);

        // 3. Count how many articles match that subject
        long countBySubject = articles.stream()
                .filter(a -> a.getSubject().equals("Children need to exercise more"))
                .count();
        System.out.println("\nCount of articles with that subject: " + countBySubject);

        // 4. Filter articles with views greater than 10,000
        List<Article> articleViews = articles.stream()
                .filter(a -> a.getNumberOfViews() > 10000)
                .collect(Collectors.toList());
        System.out.println("\nArticles with more than 10,000 views:");
        articleViews.forEach(System.out::println);

        // 5. Display top 5 most viewed articles
        System.out.println("\nTop 5 articles by number of views:");
        articles.stream()
                .sorted(Comparator.comparingInt(Article::getNumberOfViews).reversed())
                .limit(5)
                .forEach(System.out::println);
    }
}
