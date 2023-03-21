package it.develhope.JavaAdvancedExercise.Es1.Es9ClassiAstratte;

public class Guitar extends Instrument implements Playable{
    public Guitar(String name, String brand){
        super(name, brand);
    }
    @Override
    public void play() {
        System.out.println("i have a gibson");

    }
}
