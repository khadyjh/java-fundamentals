package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Shop extends BigOne {
    private String description;
    private String priceCategory;
    private int priceCategoryInt;
    private List<Review>reviewList;

    public Shop(String name,String description,int priceCategoryInt) {
        super(name);
        this.description=description;

        if(priceCategoryInt>0 && priceCategoryInt<=3){
            this.priceCategoryInt=priceCategoryInt;
            this.priceCategory= super.calculatePriceCategory(priceCategoryInt);
        }else {
            this.priceCategory="enter num between 1-3";
        }

        reviewList=new ArrayList<>();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPriceCategory() {
        return priceCategory;
    }

    public void setPriceCategory(String priceCategory) {
        this.priceCategory = priceCategory;
    }

    public int getPriceCategoryInt() {
        return priceCategoryInt;
    }

    public void setPriceCategoryInt(int priceCategoryInt) {
        if(priceCategoryInt>1 && priceCategoryInt<=3){
            this.priceCategoryInt=priceCategoryInt;
        }
    }

    @Override
    public void addReview(Review review) {
        reviewList.add(review);
    }

    @Override
    public String toString() {
        return "Shop{" +
                " name=" +super.getName()+
                ", description='" + description + '\'' +
                ", priceCategory='" + priceCategory + '\'' +
                ", reviewList=" + reviewList +
                '}';
    }
}
