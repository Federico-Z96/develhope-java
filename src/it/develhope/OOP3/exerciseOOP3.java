package it.develhope.OOP3;

public class exerciseOOP3 {
    public static void main(String[] args) {
    exercise1();
    exercise2();
}

    /**
     * 1: Copy over the student class
     *
     *    Make sure there are 5 fields inside, if they are not simply create some more.
     *    make every field private first.
     *
     *    Then create getters and setters for each of these 5 fields.
     *
     *    Once ready use all 5 below
     */
    private static void exercise1() {
        System.out.println("Exercise 1:");

        // Write and use your 5 getters and setters!
        Student student1 = new Student();
        student1.setName("Adriana");
        student1.setSurname("Celentano");
        student1.setAge(21);
        student1.setColorHair("black");
        student1.setColorEyes("blue");
        System.out.println("Name : " + student1.getName() +"Surname : " + student1.getSurname() + "Age is : " + student1.getAge()
                +"color hair : " + student1.getColorHair() + "color eyes : " + student1.getColorEyes());
    }

    /**
     * 2: Create 3 setter constraints for the student class
     *
     *    Think about what reasonably constraints are?
     *
     *    Should a student be able to be a negative age?
     *
     *    Create a counter for one of the getters, try to think about
     *    what other code could be inside a getter? Why not write it?
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");

        //Write your code here
    }

}
