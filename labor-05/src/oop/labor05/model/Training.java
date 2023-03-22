package oop.labor05.model;

import java.util.ArrayList;

public class Training {
    private Course course;
    private MyDate startDate;
    private MyDate endDate;
    private double pricePerStudent;
    private ArrayList<Student> enrolledStudents = new ArrayList<>();


    public Training(Course course, MyDate startDate, MyDate endDate, double pricePerStudent) {
        this.course = course;
        this.startDate = startDate;
        this.endDate = endDate;
        this.pricePerStudent = pricePerStudent;
    }
    public Student findStudentbyID(String ID){
        for (int i=0;i<enrolledStudents.size();i++){

        }


    }

    public Course getCourse() {
        return course;
    }
}
