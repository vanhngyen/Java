/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MovieList;

import java.util.ArrayList;

/**
 *
 * @author asus
 */
public class MovieList {
    //khai báo 1 arrayList 
    private ArrayList<String> movielist = new ArrayList<String>();
    /**
     * thêm bộ phim yêu thích vào danh sách 
     * @param movie tên phim
     */
    public void addMovie(String movie){
        movielist.add(movie);
        //movielist.add("co dau 8 tuoi");
    }
    /**
     * hiển thị ra danh sách hiện tại 
     */
    public void displayList(){
        System.out.println("You have "+ movielist.size()+" items in favorite list");
        for (int i = 0; i < movielist.size(); i++) {
            String get = movielist.get(i);
            System.out.println("Movie "+(i+1)+  " " + movielist.get(i));
        }
    }
    public void updateMovie(int index,String movie){
        movielist.set(index, movie);
        System.out.println("Update ");
        System.out.println("Movie " + (index + 1) + " " + movie);
    }
    public void removeMovie(int index){
        String movie = movielist.get(index);
        movielist.remove(index);
        System.out.println("Removed : "+movie);
    }
    //tim kiem
    public String findMovie(String search){
        int position = movielist.indexOf(search);
        
        if(position >0){
            return movielist.get(position);
        }
        return null;
    }
    public static void main(String[] args) {
        System.out.println("Movie List");
        System.out.println("------------------------");
        MovieList a = new MovieList();
        a.addMovie("hehe");
        a.addMovie("hihi");
        a.addMovie("hí hí");
        a.displayList();
        a.updateMovie(2, "hoa hong tren nguc trai");
        a.removeMovie(1);
        
        System.out.println("search " + a.findMovie("hihi"));
        
    }
}
