/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;


import java.util.*;

public class Library {

    public static void main(String[] args){
//        System.out.println("hello");

//        System.out.println(Arrays.toString(roll(4)));
//
//        String[] num={"1,2,2,3","kh","ma"};
//        boolean result= containsDuplicates(num);
//        System.out.println(result);
//
//        int[] num2={1,5,3,5,6};
//
//        System.out.println(calculatingAverages(num2));
////
//        System.out.println(arrayOfArrays());

//        weatherData();

        List<String> votes = new ArrayList<>();
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Shrub");
        votes.add("Hedge");
        votes.add("Shrub");
        votes.add("Bush");
        votes.add("Hedge");
        votes.add("Bush");


        tally(votes);


    }
    public boolean someLibraryMethod() {
        return true;
    }

    public static int[] roll(int n){
        int[] RandomRoll=new int[n];

       java.util. Random rand = new Random();
        for (int index = 0; index < n; index++) {
            int randomRollNum = 1 + rand.nextInt((6 - 1) + 1);
            RandomRoll[index]=randomRollNum;
        }

        return RandomRoll;
    }

    public static boolean containsDuplicates(String[] arr){
        for (int index = 0; index < arr.length ; index++) {
            for (int s2index = index+1 ; s2index < arr.length; s2index++) {
                if(arr[index]==arr[s2index]){
                    return true;
            }

            }

        }
        return false;
    }

    public static int calculatingAverages(int[] num){

        int sum=0;
        for (int index = 0; index < num.length; index++) {
            sum +=num[index];
        }
        int avg=sum/ num.length;

        return avg;
    }

    public static int[] arrayOfArrays(){
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 5, 55, 52, 55, 62, 57}
        };

        ArrayList<Integer> avgs=new ArrayList<>();

        for (int[] arr:
             weeklyMonthTemperatures) {
            int avg= calculatingAverages(arr);
            avgs.add(avg);
        }

        int minArr=0;

        int min=avgs.get(0);
        for (int index = 0; index < avgs.size(); index++) {
            if(avgs.get(index)< min){
                min=avgs.get(index);

                minArr=index;
            }
        }
        return weeklyMonthTemperatures[minArr];

    }


////////////////////////////////////////////lab3/////////////////////////////////////////

    public static String weatherData(){
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        HashSet<Integer> weather=new HashSet<>();

//        HashSet<String> result=new HashSet<>();

        String result="";
        for (int[] temp:
            weeklyMonthTemperatures ) {
            for (int index = 0; index < temp.length; index++) {

                weather.add(temp[index]);
            }
        }



        Integer[] arr=weather.toArray(new Integer[weather.size()]);

        int min=arr[0];
        int max=arr[0];
        for (int index = 0; index < arr.length; index++) {

            if(arr[index]<min){
                min=arr[index];
            }
            if(arr[index]>max){
                max=arr[index];
            }

        }

//        result.add("the min number " + min);
//        result.add("the max number " + max);
        result=result+ "the min number "+min +'\n';
        result=result+ "the min number "+max +'\n';
//        System.out.println(min+" the min number");
//        System.out.println(max+" the max number");


        int num=min;
        while (num<max){
            if(!weather.contains(num)){
//                System.out.println("Never saw temperature: " +num);
                result=result + "Never saw temperature: " + num +'\n';
//                result.add("Never saw temperature: " +num);
            }
            num++;
        }


        System.out.println(result);

        return result;

    }

    public static String tally(List<String> votes){

        Map<Integer,String> vot=new HashMap<>();
        int count=0;
        int winnerVot=0;

        for (int index = 0; index < votes.size(); index++) {

               String val=votes.get(index);

            for (int index2 = 0; index2 < votes.size(); index2++) {

                if(votes.get(index2)==val){
                    count++;
                }

            }
            vot.put(count,val);

            if(count>winnerVot){
                winnerVot=count;
            }
            count=0;
        }


        String result=vot.get(winnerVot)+ " is the winner";


        return result;
    }



}
