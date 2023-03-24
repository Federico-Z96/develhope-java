package it.develhope.JavaAdvancedExercise.Es1.Es9ClassiAstratte;

public class Circle extends Shape{


    public Circle(double raggio){
        super(raggio, raggio);

    }

    @Override
    public double calculateArea() {
        return  Math.PI * Math.pow((height / 2), 2);
    }

}
