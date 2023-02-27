package it.develhope.OOP.exercise2;

public class Student {
    String name;
    int age;
    Student(String name, int age) {
        System.out.println("Constructing!");
        this.name = name;
        this.age = age;
        System.out.println("Constructed!");
    }
    Student( int age) {
        System.out.println("Constructing!");
        this.age = age;
        System.out.println("Constructed!");
    }Student(String name) {
        System.out.println("Constructing!");
        this.name = name;
        System.out.println("Constructed!");
    }
    Student() {
    }
    }

