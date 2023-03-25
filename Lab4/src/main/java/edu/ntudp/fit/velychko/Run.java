package edu.ntudp.fit.velychko;

import edu.ntudp.fit.velychko.model.*;
import edu.ntudp.fit.velychko.controller.*;

public class Run {
    public static void main(String[] args) {
        University oldUniversity = createTypicalUniversity();
        System.out.println("The old university is created");
        JsonManager.writeToJsonFile(oldUniversity, "f:\\oldUniversity.json");
        University newUniversity = JsonManager.readFromJsonFile("f:\\oldUniversity.json");
        System.out.println("The new university is created");
        System.out.println("Is old university equals to new university?: " + oldUniversity.equals(newUniversity));
    }
    public static University createTypicalUniversity() {
        String nameOfStructure = UniversityData.getUniversityName();
        String firstName = UniversityData.getRandomFirstMaleName();
        String lastName = UniversityData.getRandomLastName();
        String patronymic = UniversityData.getRandomPatronymicMaleName();
        Sex sex = Sex.Male;
        Human head = new HumanCreator().create(firstName, lastName, patronymic, sex);
        University university = new UniversityCreator().create(nameOfStructure, head);

        // faculty 1
        nameOfStructure = UniversityData.getRandomFacultyName();
        firstName = UniversityData.getRandomFirstFemaleName();
        lastName = UniversityData.getRandomLastName();
        patronymic = UniversityData.getRandomPatronymicFemaleName();
        sex = Sex.Female;
        Faculty faculty1 = createTypicalFaculty(nameOfStructure, firstName, lastName, patronymic, sex);
        university.addFaculty(faculty1);

        // department 1 of faculty 1
        nameOfStructure = UniversityData.getRandomDepartmentName();
        firstName = UniversityData.getRandomFirstFemaleName();
        lastName = UniversityData.getRandomLastName();
        patronymic = UniversityData.getRandomPatronymicFemaleName();
        Department department1 = createTypicalDepartment(nameOfStructure, firstName, lastName, patronymic, sex);
        faculty1.addDepartment(department1);

        // group 1 of department 1
        nameOfStructure = UniversityData.getRandomGroupName();
        firstName = UniversityData.getRandomFirstMaleName();
        lastName = UniversityData.getRandomLastName();
        patronymic = UniversityData.getRandomPatronymicMaleName();
        sex = Sex.Male;
        Group group1 = createTypicalGroup(nameOfStructure, firstName, lastName, patronymic, sex);
        department1.addGroup(group1);

        // student 1 of group 1
        firstName = UniversityData.getRandomFirstMaleName();
        lastName = UniversityData.getRandomLastName();
        patronymic = UniversityData.getRandomPatronymicMaleName();
        Student student1 = createTypicalStudent(firstName, lastName, patronymic, sex);
        student1.setUniversityName(university.getName());
        student1.setFacultyName(faculty1.getName());
        student1.setDepartmentName(department1.getName());
        student1.setGroupName(group1.getName());
        group1.addStudent(student1);
        // student 2 of group 1
        firstName = UniversityData.getRandomFirstFemaleName();
        lastName = UniversityData.getRandomLastName();
        patronymic = UniversityData.getRandomPatronymicFemaleName();
        sex = Sex.Female;
        Student student2 = createTypicalStudent(firstName, lastName, patronymic, sex);
        student2.setUniversityName(university.getName());
        student2.setFacultyName(faculty1.getName());
        student2.setDepartmentName(department1.getName());
        student2.setGroupName(group1.getName());
        group1.addStudent(student2);
        // group 2 of department 1
        nameOfStructure = UniversityData.getRandomGroupName();
        firstName = UniversityData.getRandomFirstMaleName();
        lastName = UniversityData.getRandomLastName();
        patronymic = UniversityData.getRandomPatronymicMaleName();
        sex = Sex.Male;
        Group group2 = createTypicalGroup(nameOfStructure, firstName, lastName, patronymic, sex);
        department1.addGroup(group2);

        // student 1 of group 2
        firstName = UniversityData.getRandomFirstFemaleName();
        lastName = UniversityData.getRandomLastName();
        patronymic = UniversityData.getRandomPatronymicFemaleName();
        sex = Sex.Female;
        student1 = createTypicalStudent(firstName, lastName, patronymic, sex);
        student1.setUniversityName(university.getName());
        student1.setFacultyName(faculty1.getName());
        student1.setDepartmentName(department1.getName());
        student1.setGroupName(group2.getName());
        group2.addStudent(student1);
        // student 2 of group 2
        firstName = UniversityData.getRandomFirstMaleName();
        lastName = UniversityData.getRandomLastName();
        patronymic = UniversityData.getRandomPatronymicMaleName();
        sex = Sex.Male;
        student2 = createTypicalStudent(firstName, lastName, patronymic, sex);
        student2.setUniversityName(university.getName());
        student2.setFacultyName(faculty1.getName());
        student2.setDepartmentName(department1.getName());
        student2.setGroupName(group2.getName());
        group2.addStudent(student2);

        // department 2 of faculty 1
        nameOfStructure = UniversityData.getRandomDepartmentName();
        firstName = UniversityData.getRandomFirstFemaleName();
        lastName = UniversityData.getRandomLastName();
        patronymic = UniversityData.getRandomPatronymicFemaleName();
        sex = Sex.Female;
        Department department2 = createTypicalDepartment(nameOfStructure, firstName, lastName, patronymic, sex);
        faculty1.addDepartment(department2);

        // group 1 of department 2
        nameOfStructure = UniversityData.getRandomGroupName();
        firstName = UniversityData.getRandomFirstMaleName();
        lastName = UniversityData.getRandomLastName();
        patronymic = UniversityData.getRandomPatronymicMaleName();
        sex = Sex.Male;
        group1 = createTypicalGroup(nameOfStructure, firstName, lastName, patronymic, sex);
        department2.addGroup(group1);

        // student 1 of group 1
        firstName = UniversityData.getRandomFirstMaleName();
        lastName = UniversityData.getRandomLastName();
        patronymic = UniversityData.getRandomPatronymicMaleName();
        student1 = createTypicalStudent(firstName, lastName, patronymic, sex);
        student1.setUniversityName(university.getName());
        student1.setFacultyName(faculty1.getName());
        student1.setDepartmentName(department2.getName());
        student1.setGroupName(group1.getName());
        group1.addStudent(student1);
        // student 2 of group 1
        firstName = UniversityData.getRandomFirstFemaleName();
        lastName = UniversityData.getRandomLastName();
        patronymic = UniversityData.getRandomPatronymicFemaleName();
        sex = Sex.Female;
        student2 = createTypicalStudent(firstName, lastName, patronymic, sex);
        student2.setUniversityName(university.getName());
        student2.setFacultyName(faculty1.getName());
        student2.setDepartmentName(department2.getName());
        student2.setGroupName(group1.getName());
        group1.addStudent(student2);
        // group 2 of department 2
        nameOfStructure = UniversityData.getRandomGroupName();
        firstName = UniversityData.getRandomFirstMaleName();
        lastName = UniversityData.getRandomLastName();
        patronymic = UniversityData.getRandomPatronymicMaleName();
        sex = Sex.Male;
        group2 = createTypicalGroup(nameOfStructure, firstName, lastName, patronymic, sex);
        department2.addGroup(group2);
        // student 1 of group 2
        firstName = UniversityData.getRandomFirstMaleName();
        lastName = UniversityData.getRandomLastName();
        patronymic = UniversityData.getRandomPatronymicMaleName();
        student1 = createTypicalStudent(firstName, lastName, patronymic, sex);
        student1.setUniversityName(university.getName());
        student1.setFacultyName(faculty1.getName());
        student1.setDepartmentName(department2.getName());
        student1.setGroupName(group2.getName());
        group2.addStudent(student1);
        // student 2 of group 2
        firstName = UniversityData.getRandomFirstFemaleName();
        lastName = UniversityData.getRandomLastName();
        patronymic = UniversityData.getRandomPatronymicFemaleName();
        sex = Sex.Female;
        student2 = createTypicalStudent(firstName, lastName, patronymic, sex);
        student2.setUniversityName(university.getName());
        student2.setFacultyName(faculty1.getName());
        student2.setDepartmentName(department2.getName());
        student2.setGroupName(group2.getName());
        group2.addStudent(student2);
        // faculty 2
        nameOfStructure = UniversityData.getRandomFacultyName();
        firstName = UniversityData.getRandomFirstFemaleName();
        lastName = UniversityData.getRandomLastName();
        patronymic = UniversityData.getRandomPatronymicFemaleName();
        Faculty faculty2 = createTypicalFaculty(nameOfStructure, firstName, lastName, patronymic, sex);
        university.addFaculty(faculty2);
        // department 1 of faculty 2
        nameOfStructure = UniversityData.getRandomDepartmentName();
        firstName = UniversityData.getRandomFirstMaleName();
        lastName = UniversityData.getRandomLastName();
        patronymic = UniversityData.getRandomPatronymicMaleName();
        sex = Sex.Male;
        department1 = createTypicalDepartment(nameOfStructure, firstName, lastName, patronymic, sex);
        faculty2.addDepartment(department1);
        // group 1 of department 1
        nameOfStructure = UniversityData.getRandomGroupName();
        firstName = UniversityData.getRandomFirstMaleName();
        lastName = UniversityData.getRandomLastName();
        patronymic = UniversityData.getRandomPatronymicMaleName();
        group1 = createTypicalGroup(nameOfStructure, firstName, lastName, patronymic, sex);
        department1.addGroup(group1);
        // student 1 of group 1
        firstName = UniversityData.getRandomFirstFemaleName();
        lastName = UniversityData.getRandomLastName();
        patronymic = UniversityData.getRandomPatronymicFemaleName();
        sex = Sex.Female;
        student1 = createTypicalStudent(firstName, lastName, patronymic, sex);
        student1.setUniversityName(university.getName());
        student1.setFacultyName(faculty2.getName());
        student1.setDepartmentName(department1.getName());
        student1.setGroupName(group1.getName());
        group1.addStudent(student1);
        // student 2 of group 1
        firstName = UniversityData.getRandomFirstMaleName();
        lastName = UniversityData.getRandomLastName();
        patronymic = UniversityData.getRandomPatronymicMaleName();
        sex = Sex.Male;
        student2 = createTypicalStudent(firstName, lastName, patronymic, sex);
        student2.setUniversityName(university.getName());
        student2.setFacultyName(faculty2.getName());
        student2.setDepartmentName(department1.getName());
        student2.setGroupName(group1.getName());
        group1.addStudent(student2);
        // group 2 of department 1
        nameOfStructure = UniversityData.getRandomGroupName();
        firstName = UniversityData.getRandomFirstMaleName();
        lastName = UniversityData.getRandomLastName();
        patronymic = UniversityData.getRandomPatronymicMaleName();
        group2 = createTypicalGroup(nameOfStructure, firstName, lastName, patronymic, sex);
        department1.addGroup(group2);
        // student 1 of group 2
        firstName = UniversityData.getRandomFirstMaleName();
        lastName = UniversityData.getRandomLastName();
        patronymic = UniversityData.getRandomPatronymicMaleName();
        student1 = createTypicalStudent(firstName, lastName, patronymic, sex);
        student1.setUniversityName(university.getName());
        student1.setFacultyName(faculty2.getName());
        student1.setDepartmentName(department1.getName());
        student1.setGroupName(group2.getName());
        group2.addStudent(student1);
        // student 2 of group 2
        firstName = UniversityData.getRandomFirstFemaleName();
        lastName = UniversityData.getRandomLastName();
        patronymic = UniversityData.getRandomPatronymicFemaleName();
        sex = Sex.Female;
        student2 = createTypicalStudent(firstName, lastName, patronymic, sex);
        student2.setUniversityName(university.getName());
        student2.setFacultyName(faculty2.getName());
        student2.setDepartmentName(department1.getName());
        student2.setGroupName(group2.getName());
        group2.addStudent(student2);
        // department 2 of faculty 2
        nameOfStructure = UniversityData.getRandomDepartmentName();
        firstName = UniversityData.getRandomFirstMaleName();
        lastName = UniversityData.getRandomLastName();
        patronymic = UniversityData.getRandomPatronymicMaleName();
        sex = Sex.Male;
        department2 = createTypicalDepartment(nameOfStructure, firstName, lastName, patronymic, sex);
        faculty2.addDepartment(department2);
        // group 1 of department 2
        nameOfStructure = UniversityData.getRandomGroupName();
        firstName = UniversityData.getRandomFirstFemaleName();
        lastName = UniversityData.getRandomLastName();
        patronymic = UniversityData.getRandomPatronymicFemaleName();
        sex = Sex.Female;
        group1 = createTypicalGroup(nameOfStructure, firstName, lastName, patronymic, sex);
        department2.addGroup(group1);
        // student 1 of group 1
        firstName = UniversityData.getRandomFirstMaleName();
        lastName = UniversityData.getRandomLastName();
        patronymic = UniversityData.getRandomPatronymicMaleName();
        sex = Sex.Male;
        student1 = createTypicalStudent(firstName, lastName, patronymic, sex);
        student1.setUniversityName(university.getName());
        student1.setFacultyName(faculty2.getName());
        student1.setDepartmentName(department2.getName());
        student1.setGroupName(group1.getName());
        group1.addStudent(student1);
        // student 2 of group 1
        firstName = UniversityData.getRandomFirstMaleName();
        lastName = UniversityData.getRandomLastName();
        patronymic = UniversityData.getRandomPatronymicMaleName();
        student2 = createTypicalStudent(firstName, lastName, patronymic, sex);
        student2.setUniversityName(university.getName());
        student2.setFacultyName(faculty2.getName());
        student2.setDepartmentName(department2.getName());
        student2.setGroupName(group1.getName());
        group1.addStudent(student2);
        // group 2 of department 1
        nameOfStructure = UniversityData.getRandomGroupName();
        firstName = UniversityData.getRandomFirstMaleName();
        lastName = UniversityData.getRandomLastName();
        patronymic = UniversityData.getRandomPatronymicMaleName();
        group2 = createTypicalGroup(nameOfStructure, firstName, lastName, patronymic, sex);
        department2.addGroup(group2);
        // student 1 of group 2
        firstName = UniversityData.getRandomFirstFemaleName();
        lastName = UniversityData.getRandomLastName();
        patronymic = UniversityData.getRandomPatronymicFemaleName();
        sex = Sex.Female;
        student1 = createTypicalStudent(firstName, lastName, patronymic, sex);
        student1.setUniversityName(university.getName());
        student1.setFacultyName(faculty2.getName());
        student1.setDepartmentName(department2.getName());
        student1.setGroupName(group2.getName());
        group2.addStudent(student1);
        // student 2 of group 2
        firstName = UniversityData.getRandomFirstMaleName();
        lastName = UniversityData.getRandomLastName();
        patronymic = UniversityData.getRandomPatronymicMaleName();
        sex = Sex.Male;
        student2 = createTypicalStudent(firstName, lastName, patronymic, sex);
        student2.setUniversityName(university.getName());
        student2.setFacultyName(faculty2.getName());
        student2.setDepartmentName(department2.getName());
        student2.setGroupName(group2.getName());
        group2.addStudent(student2);

        return university;
    }
    public static Faculty createTypicalFaculty(
            String nameOfFaculty,
            String firstNameOfHeadOfFaculty,
            String lastNameOfHeadOfFaculty,
            String patronymicOfHeadOfFaculty,
            Sex sexOfHeadOfFaculty) {
        Human headOfFaculty = new Human(firstNameOfHeadOfFaculty, lastNameOfHeadOfFaculty, patronymicOfHeadOfFaculty, sexOfHeadOfFaculty);
        FacultyCreator facultyCreator = new FacultyCreator();
        return facultyCreator.create(nameOfFaculty, headOfFaculty);
    }
    public static Department createTypicalDepartment(
            String nameOfDepartment,
            String firstNameOfHeadOfDepartment,
            String lastNameOfHeadOfDepartment,
            String patronymicOfHeadOfDepartment,
            Sex sexOfHeadOfDepartment) {
        Human headOfDepartment = new Human(firstNameOfHeadOfDepartment, lastNameOfHeadOfDepartment, patronymicOfHeadOfDepartment, sexOfHeadOfDepartment);
        DepartmentCreator departmentCreator = new DepartmentCreator();
        return departmentCreator.create(nameOfDepartment, headOfDepartment);
    }
    public static Group createTypicalGroup(
            String nameOfGroup,
            String firstNameOfHeadOfGroup,
            String lastNameOfHeadOfGroup,
            String patronymicOfHeadOfGroup,
            Sex sexOfHeadOfGroup) {
        Human headOfGroup = new Human(firstNameOfHeadOfGroup, lastNameOfHeadOfGroup, patronymicOfHeadOfGroup, sexOfHeadOfGroup);
        GroupCreator groupCreator = new GroupCreator();
        return groupCreator.create(nameOfGroup, headOfGroup);
    }
    public static Student createTypicalStudent(
            String firstName,
            String lastName,
            String patronymic,
            Sex sex) {
        StudentCreator studentCreator = new StudentCreator();
        return studentCreator.create(firstName, lastName, patronymic, sex);
    }
}
