package edu.ntudp.fit.velychko.model;

import java.util.ArrayList;

public class Group extends StructuralUnit {
    public Group(String name, Human headOfUnit) {
        super(name, headOfUnit);
    }
    private ArrayList<Student> students = new ArrayList<>();
    public void addStudent(Student student) {
        students.add(student);
    }
    public boolean removeStudent(Student student) {
        return students.remove(student);
    }
    public ArrayList<Student> getStudents() { return students; }
    public void setStudents(ArrayList<Student> students) { this.students = students; }
    public void printInfo() {
        System.out.println("Name of the group: " + name +
                "\nName of the head of the group:\n" +
                "First name: " + headOfUnit.firstName + ". Last name: " + headOfUnit.lastName +
                ". Patronymic name: " + headOfUnit.patronymic + ". Sex: " + headOfUnit.sex);
    }
}
