package it.develhope.JavaAdvancedExercise.Es1.ES6ENUMS;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Es6Enums {public static void main(String[] args) {
    exercise1();
    exercise2();
    exercise3();
    exercise4();
    exercise5();
}

    private enum YouCanUseClassLocalEnumsLikeThis {
        THIS_CAN_ONLY_BE_ACCESSED_IN_THIS_CLASS,
        THIS_TOO
    }

    /**
     * 1:
     *
     *
     * Create an enum called "Days" with the values "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "SUNDAY".
     *
     * Loop over the values with Days.values() and print them out.
     */
    private static void exercise1() {
        System.out.println("\nExercise 1: ");
        // Your code here

        for (DaysOfWeek days : DaysOfWeek.values()) {
            System.out.println(days);
        }
    }

    /**
     * 2:
     *
     *
     * Create an enum called "Seasons" with the values "SPRING", "SUMMER", "FALL", "WINTER".
     *
     * Write a method that takes a Seasons value as input and returns the corresponding date range of months in that season.
     *
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        // Your code here
        //System.out.println(Seasons.values()); come faccio a prendere tutti i valori del mio enum in un solo sout?
        System.out.println(Seasons.SPRING + " : " + Seasons.SPRING.months());
        System.out.println(Seasons.SUMMER + " : " + Seasons.SUMMER.months());
        System.out.println(Seasons.FALL + " : " + Seasons.FALL.months());
        System.out.println(Seasons.WINTER + " : " + Seasons.WINTER.months());
        }



    /**
     * 3:
     *
     *
     * Create an enum called "Trafficlight" with the values "RED", "YELLOW", "GREEN".
     *
     * Write code that simulates the behavior of a traffic light. It should take the current state of the traffic light as input and return the next state.
     *
     */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        // Your code here

        Trafficlight light = Trafficlight.RED;
        for (int i = 0; i < 6; i++) {
           light = light.nextLight();
            System.out.println(light);
        }
    }







    /**
     * 4:
     *
     * Given the Days enum from exercise 1, add a local field called isWeekend and set it to true for the weekend days and false for the weekdays.
     *
     * Write an if statement that prints weekend or weekday based on the enum
     */
    private static void exercise4() {
        System.out.println("\nExercise 4: ");
        // Your code here
        for (DaysOfWeek days :DaysOfWeek.values() ){
            if (!days.isWeekend){
                System.out.println(days + " is weekend");

            }else {
                System.out.println(days + " isn't a weekend");
            }
        }

    }

    /**
     * 5:
     *
     *
     * Create an enum called "Operator" with the values "ADD", "SUBTRACT", "MULTIPLY", "DIVIDE".
     *
     * Write a method that takes two integers and an Operator value as input, performs the corresponding operation on the integers, and returns the result.
     */
    private static void exercise5() {
        System.out.println("\nExercise 5: ");
        // Your code here

        double num1 = 5;
        double num2= 2;

        Operator operator = Operator.ADD;
        //double result = operator.calculation(num1, num2, operator);
        //System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
        System.out.println(operator.calculation(num1, num2, operator));
        }

    }


