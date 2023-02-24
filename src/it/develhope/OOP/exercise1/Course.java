package it.develhope.OOP.exercise1;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 1: Create a new Class in this package
 *
 *    Call this class 'Course'
 *
 *    Inside add the following variables, using an appropriate type.
 *    courseName, maxStudents, qualityRatingOutOf10
 *
 *    On top of this choose 2 variables of your choice!
 */
public class Course {
    String courseName;
    int maxStudents;
    byte qualityRatingOutOf10;

    ArrayList<Student> students = new ArrayList<Student>();
    List<String> studentNames = Arrays.asList("Alice", "Aragon", "Alex");
    List<Integer> studentAges = Arrays.asList(23, 31, 38);
    String name;
    int age;

    public Course(String name, int age){
        this.name = name;
        this.age = age;


    }
    Course student1 = new Course(studentNames.get(0), studentAges.get(0));
    Course student2 = new Course(studentNames.get(1), studentAges.get(1));
    Course student3 = new Course(studentNames.get(2), studentAges.get(2));

}
