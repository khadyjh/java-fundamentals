/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package inheritance;

public class Library {
    public boolean someLibraryMethod() {

        return true;
    }

     public static void main(String[] args) {

         System.out.println("\n");
         System.out.println("/////////////////////////////////shop/////////////////////////////////");
         Shop shop=new Shop("market","clean",2);
         Review review=new Review("body","author",5);
         shop.addReview(review);
         System.out.println(shop);

         System.out.println("\n");
         System.out.println("/////////////////////////////////theater/////////////////////////////////");
         Theater theater=new Theater("plywood");
         Review review1=new Review("body1","author",5);
         theater.addReview(review1);
         System.out.println(theater);

         System.out.println("\n");
         System.out.println("/////////////////////////////////Restaurant/////////////////////////////////");
         Restaurant restaurant=new Restaurant("mac",5,5.0f);
         Review review2=new Review("body2","author",3.0f);
         Review review3=new Review("body3","author3",2);
         Review review4=new Review("body4","author4",3.2f);
         restaurant.addReview(review2);
         restaurant.addReview(review3);
         restaurant.addReview(review4);
         System.out.println(restaurant);

         System.out.println("\n");
         System.out.println("/////////////////////////////////theater1/////////////////////////////////");
         Theater theater1=new Theater("plywood");
         Review review5=new Review("body1","author",5,"spider man");
         Review review6=new Review("body5","author5",5);
         theater1.addMovie("spider man");
         theater1.addReview(review5);
         theater1.addReview(review6);
         System.out.println(theater1);
    }
}
