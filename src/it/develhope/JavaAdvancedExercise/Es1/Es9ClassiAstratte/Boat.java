package it.develhope.JavaAdvancedExercise.Es1.Es9ClassiAstratte;

public class Boat implements Movable{

    @Override
    public void moveForward() {
        System.out.println("A");
    }

    @Override
    public void moveBackward() {
        System.out.println("B");
    }
}
