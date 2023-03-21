package it.develhope.JavaAdvancedExercise.Es1.Es9ClassiAstratte;

public class Piano extends Instrument implements Playable{
    public Piano(String name, String brand) {
        super(name, brand);
    }

    @Override
    public void play() {
        System.out.println("i play a piano");

    }
}
