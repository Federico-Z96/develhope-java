package it.develhope.JavaAdvancedExercise.Es1.Es9ClassiAstratte;

public class Rectangle extends Shape{

public Rectangle(double width,double height){
    super(width, height);
}

    @Override
    public double calculateArea() {
        return (width * height);
    }


}
