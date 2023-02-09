package it.develhope;

public class es3 {public static void main(String[] args) {
    exercise1();
    exercise2();
    exercise3();
}

    /**
     * 1: Store your age in an appropriate variable, print it out in
     *    one line using the "+" in your print statement. Only use 1 print statement
     */
    private static void exercise1() {
        System.out.println("Exercise 1:");

        int myAge =(26);
        System.out.println("my age is " + myAge);
    }

    /**
     * 2: Store your first name initial (i.e. Jane -> J) in a variable, your age in another variable.
     *
     *    And then print them out on the same line using the following idea
     *
     *    System.out.println("My Age=" + myAge +", my initial=" + myInitial);
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");

        char firstInitialName = 'F';
        int myAge = (26);

        System.out.println("My Age=" + myAge +", my initial=" + firstInitialName);
    }

    /**
     * 3: Write comments above each line of code, describing what the line of code is doing
     */
    private static void exercise3() {
        System.out.println("\nExercise 3:");

        //creation of boolean varible for understand if it has lunch
        boolean hasEatenLunch = false;

        //creation of varible for pricing lunch
        double lunchCost = 5.99;

        //print lunch cost with a corrispondant price
        System.out.println("Lunch cost=" + lunchCost);

        //print if it has eaten lunch in boolean varible
        System.out.println("Has Eaten lunch=" + hasEatenLunch);
    }
}
        //spero che sia abbastanza chiaro il mio inglese
