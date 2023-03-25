package edu.ntudp.fit.velychko.controller;

import edu.ntudp.fit.velychko.model.Faculty;
import edu.ntudp.fit.velychko.model.Human;

public class FacultyCreator implements StructuralUnitCreatable<Faculty> {
    @Override
    public Faculty create(String name, Human headOfUnit) {
        return new Faculty(name, headOfUnit);
    }
}
