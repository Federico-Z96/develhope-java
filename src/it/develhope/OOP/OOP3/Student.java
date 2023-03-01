package it.develhope.OOP.OOP3;

public class Student {
    private String name;
    private String surname;
    private int age;

    private String colorHair;
    private String colorEyes;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null) {
            System.out.println("invalid name");
        }
        this.name = name;
    }

    public String getSurname() {

        return surname;
    }

    public void setSurname(String surname) {
        if (surname == null) {
            System.out.println("invalid surname");
        }

        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {

        if (age < 10) {
            System.out.println("invalid age: " + age);
        }
        this.age = age;
    }

    public String getColorHair() {
        return colorHair;
    }

    public void setColorHair(String colorHair) {
        this.colorHair = colorHair;
    }


    public String getColorEyes() {
        return colorEyes;
    }

    public void setColorEyes(String colorEyes) {
        this.colorEyes = colorEyes;
    }
}
