package edu.ntudp.fit.velychko.model;

import java.util.ArrayList;
import java.util.Objects;

public class University extends StructuralUnit {
    public University(String name, Human headOfUnit) {
        super(name, headOfUnit);
    }
    private ArrayList<Faculty> faculties = new ArrayList<>();
    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }
    public boolean removeFaculty(Faculty faculty) {
        return faculties.remove(faculty);
    }
    public ArrayList<Faculty> getFaculties() { return faculties; }
    public void setFaculties(ArrayList<Faculty> faculties) { this.faculties = faculties; }
    public void printInfo() {
        System.out.println("Name of the university: " + name +
                "\nName of the head of the university:\n" +
                "First name: " + headOfUnit.firstName + ". Last name: " + headOfUnit.lastName +
                ". Patronymic name: " + headOfUnit.patronymic + ". Sex: " + headOfUnit.sex);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        University that = (University) o;
        return faculties.equals(that.faculties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), faculties);
    }
}
