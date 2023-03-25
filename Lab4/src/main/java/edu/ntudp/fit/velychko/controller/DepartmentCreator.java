package edu.ntudp.fit.velychko.controller;

import edu.ntudp.fit.velychko.model.Department;
import edu.ntudp.fit.velychko.model.Human;

public class DepartmentCreator implements StructuralUnitCreatable<Department> {
    public Department create(String name, Human headOfUnit) {
        return new Department(name, headOfUnit);
    }
}
