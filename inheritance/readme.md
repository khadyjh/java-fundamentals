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
