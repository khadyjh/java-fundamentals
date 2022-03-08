package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Theater extends BigOne {

    private List<Review> theaterReviewList;
    private List<String> movieList;


    public Theater(String name) {
        super(name);
        theaterReviewList=new ArrayList<>();
        movieList=new ArrayList<>();
    }

    public List<Review> getTheaterReviewList() {
        return theaterReviewList;
    }

    public void setTheaterReviewList(List<Review> theaterReviewList) {
        this.theaterReviewList = theaterReviewList;
    }

    public List<String> getMovieList() {
        return movieList;
    }

    public void setMovieList(List<String> movieList) {
        this.movieList = movieList;
    }

    public void addMovie(String movie){
        movieList.add(movie);
    }

    public void removeMovie(String movie){
        movieList.remove(movie);
    }

    @Override
    public void addReview(Review review){
        if(review.getMovieName()!=null){
            if(movieList.contains(review.getMovieName())){
                theaterReviewList.add(review);
            }else {
                System.out.println("movie name not in our list");
            }
        }else {
            theaterReviewList.add(review);
        }

    }

    @Override
    public String toString() {
        return "Theater{" +
                "name='" + super.getName() + '\'' +
                ", movieList=" + movieList +
                ", theaterReviewList=" + theaterReviewList +
                '}';
    }
}
