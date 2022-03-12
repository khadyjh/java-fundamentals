package inheritance;

public class Review {
    private String body;
    private String author;
    private float stars;
    private String movieName;

    public Review(String body, String author, float stars) {
        this.body = body;
        this.author = author;
        if(stars>0 && stars<=5){
            this.stars = stars;
        }
    }

    public Review(String body, String author, int stars,String movieName){
        this.body=body;
        this.author=author;
        if(stars>0 && stars<=5){
            this.stars = stars;
        }
        this.movieName=movieName;
        setMovieName(movieName);

    }


    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public float getStars() {
        return stars;
    }

    public void setStars(float stars) {
        if(stars>0 && stars<=5){
            this.stars = stars;
        }
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    @Override
    public String toString() {
        if(getMovieName()==null){
            return "Review{" +
                    "body='" + body + '\'' +
                    ", stars='" + stars + '\'' +
                    ", author=" + author +
                    '}';
        }
        return "Review{" +
                "body='" + body + '\'' +
                ", stars='" + stars + '\'' +
                ", author=" + author +
                ", movie name= "+ getMovieName() +
                '}';

    }
}
