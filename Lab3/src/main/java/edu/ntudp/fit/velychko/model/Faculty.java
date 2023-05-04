package edu.ntudp.fit.velychko.model;

import java.util.ArrayList;
import java.util.List;

public class Faculty extends StructuralUnit {
    public Faculty(String name, Human headOfUnit) {
        super(name, headOfUnit);
    }
    private List<Department> departments = new ArrayList<>();
    public void addDepartment(Department department) {
        departments.add(department);
    }
    public boolean removeDepartment(Department department) {
        return departments.remove(department);
    }
    public List<Department> getDepartments() { return departments; }
    public void setDepartments(List<Department> departments) { this.departments = departments; }
    public void printInfo() {
        System.out.println("Name of the faculty: " + name +
                "\nName of the head of the faculty:\n" +
                "First name: " + headOfUnit.firstName + ". Last name: " + headOfUnit.lastName +
                ". Patronymic name: " + headOfUnit.patronymic + ". Sex: " + headOfUnit.sex);
    }
}
