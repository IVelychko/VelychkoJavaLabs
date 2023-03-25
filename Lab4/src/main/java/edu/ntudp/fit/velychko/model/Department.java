package edu.ntudp.fit.velychko.model;

import java.util.ArrayList;
import java.util.Objects;

public class Department extends StructuralUnit {
    public Department(String name, Human headOfUnit) {
        super(name, headOfUnit);
    }
    private ArrayList<Group> groups = new ArrayList<>();
    public void addGroup(Group group) {
        groups.add(group);
    }
    public boolean removeGroup(Group group) {
        return groups.remove(group);
    }
    public ArrayList<Group> getGroups() { return groups; }
    public void setGroups(ArrayList<Group> groups) { this.groups = groups; }
    public void printInfo() {
        System.out.println("Name of the department: " + name +
                "\nName of the head of the department:\n" +
                "First name: " + headOfUnit.firstName + ". Last name: " + headOfUnit.lastName +
                ". Patronymic name: " + headOfUnit.patronymic + ". Sex: " + headOfUnit.sex);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Department that = (Department) o;
        return groups.equals(that.groups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), groups);
    }
}
