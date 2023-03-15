package it.develhope.JavaAdvancedExercise.Es1.ES6ENUMS;

public enum Trafficlight {
    RED, YELLOW, GREEN;

    public Trafficlight nextLight() {
        return this.equals(RED) ? GREEN : this.equals(GREEN)  ? YELLOW : this.equals(YELLOW) ? RED : null;
    }
}
