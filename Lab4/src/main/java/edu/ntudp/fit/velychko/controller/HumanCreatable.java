package edu.ntudp.fit.velychko.controller;

import edu.ntudp.fit.velychko.model.Sex;

public interface HumanCreatable<T> {
    T create(String firstName, String lastName, String patronymic, Sex sex);
}
