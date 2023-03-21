package it.develhope.JavaAdvancedExercise.Es1.Es9ClassiAstratte;

public class Circle extends Shape{
    double raggio;

    public Circle(double width, double height){
        super(width, height);
        this.raggio = height /2;
    }

    @Override
    public double calculateArea() {
        return  Math.PI * Math.pow((height / 2), 2);
    }

}
