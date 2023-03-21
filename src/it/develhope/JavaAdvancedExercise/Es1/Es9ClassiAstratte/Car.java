package it.develhope.JavaAdvancedExercise.Es1.Es9ClassiAstratte;

public class Car implements Movable {

    @Override
    public void moveForward() {
        System.out.println("Rap Futuristico");
    }

    @Override
    public void moveBackward() {
        System.out.println("ABABABAB");
    }
}
