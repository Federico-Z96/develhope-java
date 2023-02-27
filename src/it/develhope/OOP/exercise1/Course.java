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

    ArrayList<Student> students = new ArrayList<>();



    public Course(String name){
        this.courseName = name;



    }

    public double average(){
        double sum = 0;

        for(int i = 0; i < students.size(); i ++){
            sum = sum + students.get(i).age;
        }

        double average = sum / students.size();
        return average;
    }


}
