package it.develhope;

public class es5 {
    // Don't forget to use comments to clear things up if you need them!
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4Bonus();
    }

    /**
     * 1: Create a double variable called value, create another double variable called valueSquareRoot
     *
     *    Use Math.sqrt to find the square root of value and assign it to valueSquareRoot
     */
    private static void exercise1() {
        System.out.println("Exercise 1:");

        double value = 9;
        double valueSquareRoot = Math.sqrt(value);
        System.out.println("number of value is: " + value + ", square number is: " + valueSquareRoot);
    }

    /**
     * 2: See the code below
     *
     *    Print out the highest value using Math.max()
     *
     *    Then print out the lowest value using Math.min()
     *
     *    You must put your variables into these methods and separate them with a comma
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");
        int valueA = 5;
        int valueB = 10;


        int maxValue = Math.max(valueA, valueB);
        System.out.println("Max="+ maxValue);

        int minValue = Math.min(valueA, valueB);
        System.out.println("Min= " + minValue);
    }

    /**
     * 3: Use Modulus (%) to calculate the remaining amount of money if we buy as many burgers as possible, print remainder
     */
    private static void exercise3() {
        System.out.println("\nExercise 3:");

        int totalMoney = 54;
        int costPerBurger = 9;

        int totalBuger = totalMoney / costPerBurger;
        int remainder = totalMoney % costPerBurger;
        System.out.println("Remainder=" + remainder );
        System.out.println(totalBuger);
    }

    /**
     * 4: BONUS! This is an optional task, but it is recommended you complete it
     * ----------------------------------------------------------------------
     * I've chosen loads of methods from the Math Library, write comments above each line to guess what they do!
     *
     * You do not need to write any code
     *
     * Answers can be found in resources
     */
    private static void exercise4Bonus() {
        System.out.println("\nExercise 4 (Bonus!):");

        double ourValue = 4.5;

        // takes number to next whole number, if there are any non-zero decimal places.
        System.out.println(ourValue + " after using ceiling=" + Math.ceil(ourValue));
        // takes number to previous whole number, if there are any non-zero decimal places
        System.out.println(ourValue + " after using floor=" + Math.floor(ourValue));
        //Takes number to next whole number if decimal place is .5 or above, otherwise takes it to previous whole number
        System.out.println(ourValue + " after using round=" + Math.round(ourValue));
        // Squares our number
        System.out.println(ourValue + " after using powerOf with the value of 2=" + Math.pow(ourValue, 2));
        // Cubes our number
        System.out.println(ourValue + " after using powerOf with the value of 3=" + Math.pow(ourValue, 3));
        // generates a random value between 0-1, we then times this by our number
        System.out.println(ourValue + " times random =" + Math.random() * ourValue);
    }
}
