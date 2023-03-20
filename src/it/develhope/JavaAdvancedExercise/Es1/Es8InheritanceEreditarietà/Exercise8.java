package it.develhope.JavaAdvancedExercise.Es1.Es8InheritanceEreditarietà;

public class Exercise8 { public static void main(String[] args) {
    exercise1();
    exercise2();
    exercise3();
}

    /**
     * 1:
     *
     *
     * Create a class called "Dog" that extends the Animal class.
     *
     * Add a new field called "breed" to the Dog class.
     *
     * Write a constructor for the Dog class that takes in a breed, height, and weight as parameters, and passes the height and weight to the superclass constructor.
     *
     * Write getters and setters for the breed field.
     */
    private static void exercise1() {
        System.out.println("\nExercise 1: ");
        // Your code here
        Dog cane = new Dog(80,34,"Mastino Napoletano");
        System.out.println(cane.getHeight() + " " + cane.getWeight() + " " + cane.getRace());
    }

    /**
     * 2:
     *
     *
     * Create new classes called "Fish" and "Bird" that extends the Animal class.
     *
     * Add a new field called "species" to the Fish class and "wingSpan" to the Bird class.
     *
     * Also create constructors, getters and setters
     *
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        // Your code here
        Fish trota = new Fish(8.6,3.2,"trota salmonata");
        Bird gazza = new Bird(23.3,6.8,30.4);
        System.out.println(trota.getHeight() + " " + trota.getWeight() + " " +trota.getSpecies());
        System.out.println(gazza.getHeight() + " " + gazza.getWeight() + " " + gazza.getWingSpan());

    }


    /**
     * 3:
     *
     * In the dog class create a method called runSpeedMetersPerSecond() that returns the Dog's Height * 2
     * In the fish class create a method called swimSpeedMetersPerSecond() that returns the Fish's Weight * 2
     * In the bird class create a method called flySpeedMetersPerSecond() that returns the Bird's Wingspan * 4
     *
     * Create instances of each Animal: Dog, Fish and Bird. Fill the constructors with values of your choice
     * and print out which of the animals has the fastest movement speed in MetersPerSecond
     */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        // Your code here
        Dog bracco = new Dog(70,28,"Bracco");
        Fish sturgeon = new Fish(34,50,"Russian Sturgeon");
        Bird martinFisher = new Bird(33,6.2,34.5);

        double maxSpeed = Double.NEGATIVE_INFINITY;
        String fastestAnimal = "";

        double braccoSpeed = bracco.runSpeedMetersPerSecond();
        if (braccoSpeed > maxSpeed) {
            maxSpeed = braccoSpeed;
            fastestAnimal = bracco.getRace();
        }
        double sturgeonSpeed = sturgeon.swimSpeedMetersPerSecond();
        if (sturgeonSpeed > maxSpeed) {
            maxSpeed = sturgeonSpeed;
            fastestAnimal = "Russian Sturgeon";
        }
        double martinSpeed =martinFisher.flySpeedMetersPerSecond();
        if (martinSpeed > maxSpeed) {
            maxSpeed = martinSpeed;
            fastestAnimal = "martinPescatore";
        }
        System.out.println("The fastest animal is the " + fastestAnimal + " with a speed of " + maxSpeed + " meters per second.");

    }
}
