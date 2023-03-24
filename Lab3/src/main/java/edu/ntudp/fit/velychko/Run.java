package edu.ntudp.fit.velychko;

import edu.ntudp.fit.velychko.controller.*;
import edu.ntudp.fit.velychko.model.*;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        University university = createTypicalUniversity();
        System.out.println("The university is created");
        university.printInfo();
        university.getFaculties().get(0).printInfo();
        university.getFaculties().get(0).getDepartments().get(0).printInfo();
        university.getFaculties().get(0).getDepartments().get(0).getGroups().get(0).printInfo();
        university.getFaculties().get(0).getDepartments().get(0).getGroups().get(0).getStudents().get(0).printInfo();
    }
    public static University createTypicalUniversity() {
        String nameOfUniversity = "";
        String firstNameOfHeadOfUniversity = "", lastNameOfHeadOfUniversity = "", patronymicOfHeadOfUniversity = "";
        Sex sexOfHeadOfUniversity = null;
        Human headOfUniversity;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the name of the university: ");
        if (scanner.hasNextLine()) { nameOfUniversity = scanner.nextLine(); }

        System.out.println("Enter the first name of the head of the university: ");
        if (scanner.hasNextLine()) { firstNameOfHeadOfUniversity = scanner.nextLine(); }

        System.out.println("Enter the last name of the head of the university: ");
        if (scanner.hasNextLine()) { lastNameOfHeadOfUniversity = scanner.nextLine(); }

        System.out.println("Enter the patronymic name of the head of the university: ");
        if (scanner.hasNextLine()) { patronymicOfHeadOfUniversity = scanner.nextLine(); }

        System.out.println("Enter the sex of the head of the university (M/F): ");
        if (scanner.hasNextLine()) {
            String inputSex = scanner.nextLine();
            switch (inputSex) {
                case "M" -> sexOfHeadOfUniversity = Sex.Male;
                case "F" -> sexOfHeadOfUniversity = Sex.Female;
                default -> {
                }
            }
        }
        headOfUniversity = new HumanCreator().create(firstNameOfHeadOfUniversity, lastNameOfHeadOfUniversity, patronymicOfHeadOfUniversity, sexOfHeadOfUniversity);
        University university = new UniversityCreator().create(nameOfUniversity, headOfUniversity);
        university.printInfo();

        // faculty 1
        Faculty faculty1 = createTypicalFaculty();
        university.addFaculty(faculty1);
        university.getFaculties().get(0).printInfo();

        faculty1 = university.getFaculties().get(0);
        // department 1 of faculty 1
        Department department1 = createTypicalDepartment();
        faculty1.addDepartment(department1);
        faculty1.getDepartments().get(0).printInfo();

        department1 = faculty1.getDepartments().get(0);
        // group 1 of department 1
        Group group1 = createTypicalGroup();
        department1.addGroup(group1);
        department1.getGroups().get(0).printInfo();
        // student 1 of group 1
        group1 = department1.getGroups().get(0);
        Student student1 = createTypicalStudent();
        student1.setUniversityName(university.getName());
        student1.setFacultyName(faculty1.getName());
        student1.setDepartmentName(department1.getName());
        student1.setGroupName(group1.getName());
        group1.addStudent(student1);
        student1.printInfo();

        return university;
    }
    public static Faculty createTypicalFaculty() {
        String nameOfFaculty = "";
        String firstNameOfHeadOfFaculty = "", lastNameOfHeadOfFaculty = "", patronymicOfHeadOfFaculty = "";
        Sex sexOfHeadOfFaculty = null;
        Human headOfFaculty;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the name of the faculty: ");
        if (scanner.hasNextLine()) { nameOfFaculty = scanner.nextLine(); }

        System.out.println("Enter the first name of the head of the faculty: ");
        if (scanner.hasNextLine()) { firstNameOfHeadOfFaculty = scanner.nextLine(); }

        System.out.println("Enter the last name of the head of the faculty: ");
        if (scanner.hasNextLine()) { lastNameOfHeadOfFaculty = scanner.nextLine(); }

        System.out.println("Enter the patronymic name of the head of the faculty: ");
        if (scanner.hasNextLine()) { patronymicOfHeadOfFaculty = scanner.nextLine(); }

        System.out.println("Enter the sex of the head of the faculty (M/F): ");
        if (scanner.hasNextLine()) {
            String inputSex = scanner.nextLine();
            switch (inputSex) {
                case "M" -> sexOfHeadOfFaculty = Sex.Male;
                case "F" -> sexOfHeadOfFaculty = Sex.Female;
                default -> {
                }
            }
        }
        headOfFaculty = new Human(firstNameOfHeadOfFaculty, lastNameOfHeadOfFaculty, patronymicOfHeadOfFaculty, sexOfHeadOfFaculty);
        FacultyCreator facultyCreator = new FacultyCreator();
        return facultyCreator.create(nameOfFaculty, headOfFaculty);
    }
    public static Department createTypicalDepartment() {
        String nameOfDepartment = "";
        String firstNameOfHeadOfDepartment = "", lastNameOfHeadOfDepartment = "", patronymicOfHeadOfDepartment = "";
        Sex sexOfHeadOfDepartment = null;
        Human headOfDepartment;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the name of the department: ");
        if (scanner.hasNextLine()) { nameOfDepartment = scanner.nextLine(); }

        System.out.println("Enter the first name of the head of the department: ");
        if (scanner.hasNextLine()) { firstNameOfHeadOfDepartment = scanner.nextLine(); }

        System.out.println("Enter the last name of the head of the department: ");
        if (scanner.hasNextLine()) { lastNameOfHeadOfDepartment = scanner.nextLine(); }

        System.out.println("Enter the patronymic name of the head of the department: ");
        if (scanner.hasNextLine()) { patronymicOfHeadOfDepartment = scanner.nextLine(); }

        System.out.println("Enter the sex of the head of the department (M/F): ");
        if (scanner.hasNextLine()) {
            String inputSex = scanner.nextLine();
            switch (inputSex) {
                case "M" -> sexOfHeadOfDepartment = Sex.Male;
                case "F" -> sexOfHeadOfDepartment = Sex.Female;
                default -> {
                }
            }
        }
        headOfDepartment = new Human(firstNameOfHeadOfDepartment, lastNameOfHeadOfDepartment, patronymicOfHeadOfDepartment, sexOfHeadOfDepartment);
        DepartmentCreator departmentCreator = new DepartmentCreator();
        return departmentCreator.create(nameOfDepartment, headOfDepartment);
    }
    public static Group createTypicalGroup() {
        String nameOfGroup = "";
        String firstNameOfHeadOfGroup = "", lastNameOfHeadOfGroup = "", patronymicOfHeadOfGroup = "";
        Sex sexOfHeadOfGroup = null;
        Human headOfGroup;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the name of the group: ");
        if (scanner.hasNextLine()) { nameOfGroup = scanner.nextLine(); }

        System.out.println("Enter the first name of the head of the group: ");
        if (scanner.hasNextLine()) { firstNameOfHeadOfGroup = scanner.nextLine(); }

        System.out.println("Enter the last name of the head of the group: ");
        if (scanner.hasNextLine()) { lastNameOfHeadOfGroup = scanner.nextLine(); }

        System.out.println("Enter the patronymic name of the head of the group: ");
        if (scanner.hasNextLine()) { patronymicOfHeadOfGroup = scanner.nextLine(); }

        System.out.println("Enter the sex of the head of the group (M/F): ");
        if (scanner.hasNextLine()) {
            String inputSex = scanner.nextLine();
            switch (inputSex) {
                case "M" -> sexOfHeadOfGroup = Sex.Male;
                case "F" -> sexOfHeadOfGroup = Sex.Female;
                default -> {
                }
            }
        }
        headOfGroup = new Human(firstNameOfHeadOfGroup, lastNameOfHeadOfGroup, patronymicOfHeadOfGroup, sexOfHeadOfGroup);
        GroupCreator groupCreator = new GroupCreator();
        return groupCreator.create(nameOfGroup, headOfGroup);
    }
    public static Student createTypicalStudent() {
        String firstName = "", lastName = "", patronymic = "";
        Sex sex = null;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first name of the student: ");
        if (scanner.hasNextLine()) { firstName = scanner.nextLine(); }

        System.out.println("Enter the last name of the student: ");
        if (scanner.hasNextLine()) { lastName = scanner.nextLine(); }

        System.out.println("Enter the patronymic name of the student: ");
        if (scanner.hasNextLine()) { patronymic = scanner.nextLine(); }

        System.out.println("Enter the sex of the student (M/F): ");
        if (scanner.hasNextLine()) {
            String inputSex = scanner.nextLine();
            switch (inputSex) {
                case "M" -> sex = Sex.Male;
                case "F" -> sex = Sex.Female;
                default -> {
                }
            }
        }
        StudentCreator studentCreator = new StudentCreator();
        return studentCreator.create(firstName, lastName, patronymic, sex);
    }
}
