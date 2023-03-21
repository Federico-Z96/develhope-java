package it.develhope.JavaAdvancedExercise.Es1.Es9ClassiAstratte;

public abstract class Instrument implements Playable {

    protected String name;
    protected String brand;

    public Instrument(String name, String brand){
        this.name = name;
        this.brand = brand;
    }

}
