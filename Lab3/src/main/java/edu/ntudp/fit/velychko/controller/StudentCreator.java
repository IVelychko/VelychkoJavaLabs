package edu.ntudp.fit.velychko.controller;

import edu.ntudp.fit.velychko.model.*;

public class StudentCreator implements HumanCreatable<Student> {

    @Override
    public Student create(String firstName, String lastName, String patronymic, Sex sex) {
        return new Student(firstName, lastName, patronymic, sex);
    }
}
