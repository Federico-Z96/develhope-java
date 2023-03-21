package it.develhope.JavaAdvancedExercise.Es1.Es9ClassiAstratte;

public abstract class Shape {
    double width;
    double height;

    public Shape(double width, double height){
    this.width = width;
    this.height = height;
    }


    public abstract double calculateArea();
}
