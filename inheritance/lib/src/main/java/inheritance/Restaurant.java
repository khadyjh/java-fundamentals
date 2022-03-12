package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Restaurant extends BigOne{
    private String priceCategory;
    private float stars;
    private List<Review> restaurantReviewList;
    private int priceCategoryInt;

    public Restaurant(String name,int priceCategoryInt,float stars) {
        super(name);

        if(stars>0 && stars<=5){
            this.stars = stars;
        }
        if(priceCategoryInt>0 && priceCategoryInt<=3){
            this.priceCategoryInt=priceCategoryInt;
            this.priceCategory= super.calculatePriceCategory(priceCategoryInt);
        }else {
            this.priceCategory="enter num between 1-3";
        }

        restaurantReviewList=new ArrayList<>();


    }

    public String getPriceCategory() {
        return priceCategory;
    }

    public void setPriceCategory(String priceCategory) {
        this.priceCategory=priceCategory;
    }

    public int getPriceCategoryInt() {
        return priceCategoryInt;
    }

    public void setPriceCategoryInt(int priceCategoryInt) {
        if(priceCategoryInt>1 && priceCategoryInt<=3){
            this.priceCategoryInt=priceCategoryInt;
        }
    }

    public float getStars() {
        return stars;
    }

    public void setStars(float stars) {
        if(stars>0 && stars<=5){
            this.stars = stars;
        }
    }

    @Override
    public void addReview(Review review) {
        restaurantReviewList.add(review);
        calculateStars();
    }


    public void calculateStars(){
        float sumOfStars=0;
        float stareAvg=0;
        for (Review rev:
                restaurantReviewList) {
            sumOfStars=sumOfStars+rev.getStars();
        }
        stareAvg=sumOfStars/restaurantReviewList.size();
        setStars((float) Math.round(stareAvg*10)/10);
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "name= "+ super.getName()+
                ", priceCategory='" + priceCategory + '\'' +
                ", stars=" + stars +
                ", restaurantReviewList=" + restaurantReviewList +
                '}';
    }
}
