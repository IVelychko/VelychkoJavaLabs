package edu.ntudp.fit.velychko.model;

public class Human implements Printable {
    protected String firstName;
    protected String lastName;
    protected String patronymic;
    protected Sex sex;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public Human(String firstName, String lastName, String patronymic, Sex sex) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.sex = sex;
    }

    public void printInfo() {
        System.out.println("First name: " + firstName + ". Last name: " + lastName +
                ". Patronymic name: " + patronymic + ". Sex: " + sex);
    }
}
