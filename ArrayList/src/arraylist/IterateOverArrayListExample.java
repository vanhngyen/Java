/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author asus
 */
public class IterateOverArrayListExample {

    public static void main(String[] args) {
        List<String> tvShows = new ArrayList<>();
        tvShows.add("Breaking Bad");
        tvShows.add("Game of thrones");
        tvShows.add("Friends");
        tvShows.add("Prison break");
        
        System.out.println("--- Iterate using Java 8 forEach and lambla ---");
        tvShows.forEach(tvShow -> {
            System.out.println(tvShows);
        });
        
        System.out.println("\n--- Iterate using an iterator() ---");
        Iterator<String> tvShowIterator = tvShows.iterator();
        while (tvShowIterator.hasNext()) {
            String tvShow = tvShowIterator.next();
            System.out.println(tvShow);
        }
        
        System.out.println("\n---Iterate using an iterator() and Java 8 forEachRemaining() method --- ");
        tvShowIterator = tvShows.iterator();
        tvShowIterator.forEachRemaining(tvShow -> {
            System.out.println(tvShow);
        });
        
        System.out.println("\n---Iterate using a listIterator() to traverse in both directions ---");
        //Ở đây, chúng tôi bắt đầu từ cuối danh sách và đi ngược lại.
        
        ListIterator<String> tvShowListIterator = tvShows.listIterator(tvShows.size());
        while (tvShowListIterator.hasPrevious()) {
            String tvShow = tvShowListIterator.previous();
            System.out.println(tvShow);
        }
        System.out.println("\n--- Iterare using simple for-each loop");
        for (String tvShow : tvShows) {
            System.out.println(tvShow);
        }
        
        System.out.println("\n--- Iterare using for loop with index ---");
        for (int i = 0; i < tvShows.size(); i++) {
            System.out.println(tvShows.get(i));
        }
        
    }
}
