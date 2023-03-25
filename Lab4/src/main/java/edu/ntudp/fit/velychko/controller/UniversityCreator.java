package edu.ntudp.fit.velychko.controller;

import edu.ntudp.fit.velychko.model.Human;
import edu.ntudp.fit.velychko.model.University;

public class UniversityCreator implements StructuralUnitCreatable<University> {
    @Override
    public University create(String name, Human headOfUnit) {
        return new University(name, headOfUnit);
    }
}
