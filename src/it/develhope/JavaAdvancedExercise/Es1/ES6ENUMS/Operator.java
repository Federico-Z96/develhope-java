package it.develhope.JavaAdvancedExercise.Es1.ES6ENUMS;

public enum Operator {
    ADD, SUBTRACT, MULTIPLY, DIVIDE;


    public double calculation (double num1, double num2, Operator operator) {
        switch (operator) {
            case ADD:
                return num1 + num2;
            case SUBTRACT:
                return num1 - num2;
            case MULTIPLY:
                return num1 * num2;
            case DIVIDE:
                if (num2 == 0) {
                    System.out.println("Cannot divide by zero.");
                }
                return num1 / num2;
            default:
                throw new IllegalArgumentException("Invalid operator.");
        }
    }


}
