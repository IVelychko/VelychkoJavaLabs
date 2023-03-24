package edu.ntudp.fit.velychko.controller;

import edu.ntudp.fit.velychko.model.Human;

public interface StructuralUnitCreatable<T> {
    T create(String name, Human headOfUnit);
}
