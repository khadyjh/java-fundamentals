package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private String name;
    private int stars;
    private String priceCategory;
    private List<Review> reviewList;


    public void setStars(int stars) {
        if(stars>0 && stars<=5){
            this.stars = stars;
        }
    }

    public int getStars() {
        return stars;
    }

    public Restaurant(String name, int stars, String priceCategory) {
        reviewList=new ArrayList<>();
        this.name = name;
        this.priceCategory = priceCategory;
        if(stars>0 && stars<=5){
            this.stars = stars;
        }




    }


    public void addReview(Review review){


        boolean flag=false;

        if(reviewList.size()==0){
            reviewList.add(review);
        }
        for (Review rev
                :reviewList) {
            if(rev.getAuthor()==review.getAuthor()){
                flag=true;
            }
        }

        if(flag==true){
            reviewList.add(review);

        }else {
            reviewList.add(review);
            calculateStars(review.getStars());
        }
    }

    public void calculateStars(int revStare){
        int sumOfStars=0;
        int stareAvg=0;
        for (Review rev:
                reviewList) {
            sumOfStars=sumOfStars+rev.getStars();
        }
        stareAvg=sumOfStars/reviewList.size();
        setStars(stareAvg);
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", stars=" + stars +
                ", priceCategory='" + priceCategory + '\'' +
                ", reviewList=" + reviewList +
                '}';
    }
}
