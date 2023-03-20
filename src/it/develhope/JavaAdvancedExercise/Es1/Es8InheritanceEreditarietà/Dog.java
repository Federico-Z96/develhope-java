package it.develhope.JavaAdvancedExercise.Es1.Es8InheritanceEreditarietà;

public class Dog extends Animal{
    String race;


    public Dog(double height, double weight, String race){
        super(height, weight);
        this.race = race;

    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }
    public double runSpeedMetersPerSecond(){
        return getHeight() * 2;
    }
}
