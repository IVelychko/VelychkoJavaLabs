package edu.ntudp.fit.velychko.model;

import java.util.ArrayList;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Group group = (Group) o;
        return students.equals(group.students);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), students);
    }
}
