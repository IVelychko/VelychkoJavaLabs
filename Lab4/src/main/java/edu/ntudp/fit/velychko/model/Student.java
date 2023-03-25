package edu.ntudp.fit.velychko.model;

import java.util.Objects;

public class Student extends Human implements Printable {
    public String universityName = "";
    public String facultyName = "";
    public String departmentName = "";
    public String groupName = "";

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
    public Student(String firstName, String lastName, String patronymic, Sex sex) {
        super(firstName, lastName, patronymic, sex);
    }
    @Override
    public void printInfo() {
        System.out.println("First name: " + firstName + ". Last name: " + lastName +
                ". Patronymic name: " + patronymic + ". Sex: " + sex);
        if (!universityName.isEmpty()) {
            System.out.println("University: " + universityName);
        }
        if (!facultyName.isEmpty()) {
            System.out.println("Faculty: " + facultyName);
        }
        if (!departmentName.isEmpty()) {
            System.out.println("Department: " + departmentName);
        }
        if (!groupName.isEmpty()) {
            System.out.println("Group: " + groupName);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Student student = (Student) o;
        return universityName.equals(student.universityName) && facultyName.equals(student.facultyName) && departmentName.equals(student.departmentName) && groupName.equals(student.groupName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), universityName, facultyName, departmentName, groupName);
    }
}
