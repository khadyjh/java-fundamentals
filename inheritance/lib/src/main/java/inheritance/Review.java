package inheritance;

public class Review  {

    private String body;
    private String author;
    private int stars;



    public int getStars() {
     return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getBody() {
        return body;
    }

    public Review(String body, String author, int stars) {
        this.body = body;
        this.author = author;
        if(stars>0 && stars<=5){
            this.stars = stars;
        }

    }

    @Override
    public String toString() {

        return "Review{" +
                "body='" + body + '\'' +
                ", stars='" + stars + '\'' +
                ", author=" + author +
                '}';
    }



}
