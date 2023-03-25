package edu.ntudp.fit.velychko.model;

import java.util.Objects;

public abstract class StructuralUnit implements Printable {
    protected String name;
    protected Human headOfUnit;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Human getHeadOfUnit() {
        return headOfUnit;
    }

    public void setHeadOfUnit(Human headOfUnit) {
        this.headOfUnit = headOfUnit;
    }
    public StructuralUnit(String name, Human headOfUnit) {
        this.name = name;
        this.headOfUnit = headOfUnit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StructuralUnit that = (StructuralUnit) o;
        return name.equals(that.name) && headOfUnit.equals(that.headOfUnit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, headOfUnit);
    }
}
