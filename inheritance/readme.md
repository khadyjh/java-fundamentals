# lab 6

in this lab will introduce association of classes and how two classes will interact 
first class about restaurant it has methode called add review to add review to the restaurant and recalculate the rating stares 

second class about Review it has the state of reviews 
## TEST

in test file will find the test cases for restaurant toString and reviews toString methods and test for addareview method using assertEquals 
to compare the expected result with the actual one .
```
  @Test
    @DisplayName("create an instance of Review and ensure that its toString is working properly.")
    void reviewTest(){
        Review review=new Review("clean","yara",5);
        String result=review.toString();
        String exp="Review{body='clean', stars='5', author=yara}";
        assertEquals(exp,result);
    }
```

# lab 7
in this lab will introduce inheritance and abstract classes and how two classes will interact using inheritance
in this version of project I have shop , restaurant , review , theater normal classes extend bigOne which is abstract class

review class has a composite relation with shop , restaurant ,and theater


## TEST

in test file will find the test cases for restaurant,reviews,shop,theater toString and for calculateStars method , and test for addareview method for each class using assertEquals
to compare the expected result with the actual one .

```
@Test
    @DisplayName("Test add review with movie name for theater")
    void theaterAddReviewMovieTest(){
        Theater theater=new Theater("movie show");
        theater.addMovie("spider name");
        theater.addMovie("spider name: no way home");
        Review review=new Review("clean","yara",5,"spider name");
        Review review1=new Review("clean","ali",3,"spider name: no way home");

        theater.addReview(review);
        theater.addReview(review1);

        String exp="Theater{name='movie show', movieList=[spider name, spider name: no way home], theaterReviewList=[Review{body='clean', stars='5.0', author=yara, movie name= spider name}, Review{body='clean', stars='3.0', author=ali, movie name= spider name: no way home}]}";
        String result=theater.toString();
        assertEquals(exp,result);
    }
```

