package com.example;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here

//        int dogCount=0;
//        System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

        clock();

//        flipNHeads(5);

    }

    public static String  pluralize(String name,int count){
        if(count==0 || count>1)
        {
            return name + "s";
        }else {
            return name;
        }


    }

    public static void clock(){
        LocalDateTime now=LocalDateTime.now();

        for (int indx =0 ; indx < 10; indx--) {
            int increment=0;
            increment-=indx;
            LocalDateTime nowS =now.plusSeconds(increment);
            System.out.println(nowS.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
        }

    }

    public static void flipNHeads(int n) {
//        int counter = 0;
//        for (int i = 0; i < n; i++) {
//            Random random = new Random();
//            float rand = random.nextFloat();
//
//            if (rand > 0.5) {
//                System.out.println(rand);
//                System.out.println("head");
//                counter++;
//            } else if (rand < 0.5) {
//                System.out.println(rand);
//                System.out.println("tail");
//            }
//        }

        int count=0;
        int flipRow=0;
        while (flipRow<n){
            Random random = new Random();
            float rand = random.nextFloat();

            if (rand > 0.5) {
                System.out.println(rand);
                System.out.println("head");
              flipRow++;
            } else if (rand < 0.5) {
                System.out.println(rand);
                System.out.println("tail");
            }

          count++;
        }

        System.out.println("it took " + count + "  flips to flip " + n +" heads in a row.");


    }
}
