/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linter;

import java.io.*;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {

//        Reader();
        System.out.println("////////////////////////////////////////////");
        read("gates.js");


    }


    public static void Reader(){
        File file=new File("gates.js");

        int counter=1;
        HashSet<String> file1=new HashSet<>();
        try(Scanner scanner=new Scanner(file)) {

            while (scanner.hasNextLine()){

                file1.add(scanner.nextLine());
            }
            System.out.println(file1);
            String[] strg= file1.toArray(new String[file1.size()]);

            for (int index = 0; index < strg.length; index++) {
                if(!strg[index].contains(";")){
                    if(!strg[index].contains("{")){
                        if(!strg[index].contains("}")){
                            if(!strg[index].contains("if")){
                                if(!strg[index].contains("else")){
                                    if(!strg[index].isEmpty())
                                    {
                                        System.out.println( " Missing semicolon in this line => " +strg[index] );
                                    }

                                }

                            }

                        }

                    }

                }
                counter++;
            }

        } catch (FileNotFoundException fileNotFoundException){

            System.err.println(fileNotFoundException.getMessage());
        }

        System.out.println(counter);
        System.out.println(file1.size());
    }

    public static ArrayList read(String fileName) {
       int counter=1;
        ClassLoader classloader = Thread.currentThread().getContextClassLoader();
        InputStream is = classloader.getResourceAsStream(fileName);

        ArrayList<String> result=new ArrayList<>();

        try (Scanner scanner=new Scanner(is)){

            while (scanner.hasNextLine()){
                String str=scanner.nextLine();
                if (str.lastIndexOf(";")==-1 && str.length()!=0 && str.lastIndexOf("{")==-1
                        && str.lastIndexOf("}")==-1
                        && str.indexOf("if")==-1&&str.indexOf("else")==-1 )
                {
//                    System.out.println(" Missing semicolon in line => " + counter);
                    result.add(" Missing semicolon in line => " + counter);

                }
                counter++;
            }

        }catch (Exception e){
            System.err.println(e.getMessage());
        }

        System.out.println(result);

        return result;

    }

}
