package it.develhope;

import org.w3c.dom.css.CSSStyleSheet;

import java.util.Arrays;
import java.util.List;

public class es15 {
    public static void main(String[] args) {
    exercise1();
    exercise2();
    exercise3();

}
   //static double fahrenheit;
    //tatic double f;
    /**
     * 1: Take the code below and put it into a function, read the code and see what it is.
     * <p>
     * What do you think the function does? Name the function appropriately and make sure
     * <p>
     * return the appropriate result type
     *
     */
    private static void exercise1() {
        System.out.println("Exercise 1:");
        //fahrenheit = a(30);
        //System.out.println(fahrenheit);
        //f = a(20);
        //System.out.println(f);
        // Put this into a function

        /*double celsius = 30;
        double fahrenheit = ((celsius * 9) / 5) + 32;
        String conversionDescription = celsius + " Celsius is " + fahrenheit + " fahrenheit";

        // End
        System.out.println(conversionDescription);
    */

        System.out.println(convertToFahrenheit(30));
        System.out.println(convertToFahrenheit(15));
    }
         public static String convertToFahrenheit ( double celsius){
            double fahrenheit = ((celsius * 9) / 5) + 32;
            return celsius + " Celsius is " + fahrenheit + " fahrenheit";



    }

    //public static double a (double celsius) {
      //  return ((celsius * 9) / 5) + 32;

   // }




    /**
     * 2: Create a function that processes and prints out all the names in the ArrayList
     *
     *    Make sure to put all the formatting code in the function, formatting:
     *    1) to Upper case
     *    2) Remove spaces at the start and the end
     *    3) If the name contains any numbers, instead of returning the name, return "Invalid"
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");
        List<String> names = Arrays.asList("Alan   ", "Alice   ", "Ant0ni0   ", "  Aziz");

        for (String name : names) {
            // Call your function
            System.out.println(stringName(name));
        }
    }
    public static String stringName(String name){
        name = name.toUpperCase();
        //name = name.trim();
        //name = name.toUpperCase().trim();
        name = name.strip();

        for (int i = 0; i < name.length(); i++) {
                if (Character.isDigit(name.charAt(i))){
                     return "invalid";

                 }
        }
        //if (name.matches(".*[0-9].*")) {
        //    return "invalid";

        //}

       return name;
    }

    /**
     * 3: Write a function that prints out every variable seen in the code. It should not return anything
     */
    private static void exercise3() {
        System.out.println("\nExercise 3:");

        double myLunchPrice = 5.99;
        String lunchType = "sandwich";
        String description = "Nice big sandwich";
        int weightInGrams = 500;


        lunch(lunchType,description,myLunchPrice,weightInGrams);
        // Call your function
    }
    static void lunch(String lunchType,String description,double myLunchPrice,int weightGrams){
        System.out.println("a price of " + lunchType +" is " + myLunchPrice + " it isn't cheapest, but is a " +
                description + ", the weight of this sandwich is " + weightGrams + " grams");
    }
}
