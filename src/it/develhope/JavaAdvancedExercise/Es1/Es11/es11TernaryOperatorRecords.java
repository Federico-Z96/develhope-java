package it.develhope.JavaAdvancedExercise.Es1.Es11;

import it.develhope.OOP.exercise1.Exercise;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class es11TernaryOperatorRecords {
    public static void main (String[]Args){
        exercise1();
        exercise2();
        exercise3();
    } /**
 * 1:
 *
 *
 * In the main method, create a variable x as a random number between 0-100 using Math.random() * 100;
 *
 * Use a ternary operator to check if x is greater than or equal to 50. If it is, print "x is greater than or equal to 50". If it's not, print "x is less than 50".
 *
 * Experiment with different values of x and observe the output
 */
private static void exercise1() {
    System.out.println("\nExercise 1: ");
    // Your code here
    int x = (int) (Math.random() * 100);

    String xString = x >= 50 ? "x is greater than or equal to 50" : "x is less than or equal to 50";
    System.out.println(xString);
}

    /**
     * 2:
     *
     *
     * Create a record called "Person" with fields for name, age and address.
     *
     * Add a toString method to Person to print out the data in a different format
     *
     * Print the record to the console
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        // Your code here
        Person person1 = new Person("federico", 26, "F.Turati");
        System.out.println(person1);
    }

    /**
     * 3:
     *
     *
     * In the main method, create a BigInteger variable with a large value.
     *
     * Create a BigDecimal variable with a large value
     *
     * Divide the BigInteger by 3 using the divide method and assign the result to a new BigInteger variable
     *
     * Divide the BigDecimal by Math.PI using the divide method and assign the result to a new BigDecimal variable
     *
     * Print the results
     */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        // Your code here
        BigInteger bigInteger = new BigInteger("1000000000000000");
        BigDecimal bigDecimal = new BigDecimal("1.000000010100000003");
        BigInteger secondBigInteger = bigInteger.divide(new BigInteger("3"));
        BigDecimal secondBigDecimal = bigDecimal.divide(new BigDecimal(Math.PI), RoundingMode.HALF_UP);
        System.out.println(secondBigInteger + "-----" + secondBigDecimal);

    }

}
