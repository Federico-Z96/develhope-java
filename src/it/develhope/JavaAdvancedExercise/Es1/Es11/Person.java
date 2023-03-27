package it.develhope.JavaAdvancedExercise.Es1.Es11;

public record Person(String name, int age, String address) {
    @Override
    public String toString() {
        return String.format("person atribute: " + "name: " + name + ", age: " + age + ", address: " + address);
    }
}


