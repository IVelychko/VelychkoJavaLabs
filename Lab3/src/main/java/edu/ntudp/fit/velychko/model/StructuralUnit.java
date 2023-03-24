package edu.ntudp.fit.velychko.model;

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
}
