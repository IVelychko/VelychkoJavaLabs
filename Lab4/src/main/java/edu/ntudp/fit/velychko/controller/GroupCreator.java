package edu.ntudp.fit.velychko.controller;

import edu.ntudp.fit.velychko.model.Group;
import edu.ntudp.fit.velychko.model.Human;

public class GroupCreator implements StructuralUnitCreatable<Group> {
    @Override
    public Group create(String name, Human headOfUnit) {
        return new Group(name, headOfUnit);
    }
}
