package edu.ntudp.fit.velychko.controller;

import edu.ntudp.fit.velychko.model.Human;
import edu.ntudp.fit.velychko.model.Sex;

public class HumanCreator implements HumanCreatable<Human> {
    @Override
    public Human create(String firstName, String lastName, String patronymic, Sex sex) {
        return new Human(firstName, lastName, patronymic, sex);
    }
}
