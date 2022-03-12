package com.example;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int dogCount=0;
        System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

        clock();

        flipNHeads(5);

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
        String previousDateTime =" ";

        for (int index =0 ; index < 10; index--) {
            LocalDateTime now = LocalDateTime.now();
            String formatTime=now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
            if(!(formatTime.equals(previousDateTime)))
            {
                System.out.println(formatTime );
                previousDateTime=formatTime;

            }
        }
    }

    public static void flipNHeads(int n) {
        int count=0;
        int flipRow=0;
        while (flipRow<n){
            Random random = new Random();
            float rand = random.nextFloat();

            if (rand > 0.5) {
                System.out.println("head");
                flipRow++;
                count++;
            } else if (rand < 0.5) {
                System.out.println("tail");
                count++;
                flipRow=0;
            }
        }
        System.out.println("it took " + count + "  flips to flip " + n +" heads in a row.");
    }

}
