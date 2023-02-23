package it.develhope;

import java.time.LocalDate;
import java.time.Month;

public class es16 {public static void main(String[] args) {
    exercise1();
    exercise3();
}

    /**
     * 1: Write code and fix the program below, you want to accept the questionableFunds
     * into the account!
     */
    private static void exercise1() {
        System.out.println("Exercise 1: ");
        int myBankBalanceEuro = 500;

        String suspiciousEmailMessage =
                """
                            Hello Sir/Madam,
                            
                            I'm a prince here in [redacted] and I need help transferring my billions into 
                            Italy, please provide your bank account details and I will pay you generously.
                            
                            Thanks
                """;

        long questionableFundsEuro = 5_000_000_000l;
        questionableFundsEuro = questionableFundsEuro + myBankBalanceEuro;

        System.out.println("my bank balance is : " + questionableFundsEuro);
        System.out.println(suspiciousEmailMessage);//Add the questionable funds to your bank balance and print it out!
    }

    /**
     * 2: Given the following information, think about the MOST EFFICIENT (which uses least space)
     *    type to use to store such data. Why is this the most efficient?
     *
     *    long = -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807          2c
     *    double = 16 decimal places                                              2b
     *    float = 7 decimal places                                                2e
     *    int = -2,147,483,648 to 2,147,483,647                                   2f
     *    short = -32,768 to 32,768                                               2d
     *    byte = -127 to 127                                                      2a
     *
     *    2a: Someone's age
     *    2b: The age of a baby in months
     *    2c: Money in a hedgefund in euros
     *    2d: Price of a good in euros on amazon.com
     *    2e: The exact weight of an apple measured by scientific equipment
     *    2f: The number of kilometers from any 2 places in the world
     */

    /**
     * 3: Use the LOCALDATE type (LocalDate.now()) to print out the current date
     * <p>
     * Play around with local date! What can you get it to do?
     * Use at least the following methods on myDate().
     * * getDayOfMonth()
     * * getDayOfWeek()
     * * getDayOfYear()
     * * getMonth()
     * * getMonthValue()
     * * use isBefore() and isAfter() to compare with other dates, use LocalDate.of(year, month, day) to
     * create other days
     */
    public static void exercise3() {
        System.out.println("Exercise 3:");

        LocalDate today = LocalDate.now();

        today.getDayOfMonth();
        today.getDayOfWeek();
        today.getMonthValue();
        today.getMonth();

        System.out.println("today is " + today.getDayOfWeek() + " " + today.getDayOfMonth());
        System.out.println(today.getMonth()+ " is a " + today.getMonthValue() + "nd month of the year");

        today.getYear();
        System.out.println("we are in : " + today.getYear());

        LocalDate myBirthDate = LocalDate.of(2023, Month.MAY,12);

        if (myBirthDate.isAfter(today)){
            System.out.println("my birthday is in : " + myBirthDate.getMonth());

        } else if (myBirthDate.isBefore(today)){
            System.out.println("i've got 27 years old");
        }




    }
}
