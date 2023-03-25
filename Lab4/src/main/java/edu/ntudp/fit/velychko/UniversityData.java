package edu.ntudp.fit.velychko;

import java.util.Random;

public class UniversityData {
    private final static String[] firstNamesMale = { "Ihor", "Vladislav", "Serhiy", "Mykolay", "Andriy", "Oleh", "Volodymyr", "Danylo", "Denis", "Vasyl" };
    private final static String[] firstNamesFemale = { "Olha", "Olena", "Vitalina", "Hanna", "Myroslava", "Bohdana", "Oksana", "Irina", "Alisa" };
    private final static String[] lastNames = { "Melnyk", "Shevchenko", "Kovalenko", "Boyko", "Velychko", "Tkachenko", "Koval", "Lisenko", "Hordienko" };
    private final static String[] patronymicMaleNames = { "Ihorovich", "Vladislavovich", "Mykolayovich", "Andriyovich", "Olehovich", "Volodymyrovich", "Danylovich", "Denysovich", "Vasylovich" };
    private final static String[] patronymicFemaleNames = { "Ihorivna", "Vladislavivna", "Mykolaivna", "Andriivna", "Olehivna", "Volodymyrivna", "Danylivna", "Denysivna", "Vasylivna" };
    private final static String universityName = "Dnipro University of Technology";
    private final static String[] facultyNames = { "Faculty of Electrical Engineering", "Faculty of Information Technologies", "Faculty of Mechanical Engineering"};
    private final static String[] departmentNames = { "Department of automobiles and automobile economy", "Department of information technology and computer engineering", "Department of information security and telecommunications", "Department of cyberphysical and information-measuring systems", "Department of electric drive" };
    private final static String[] groupNames = { "122-20-3", "122-21-2", "141-20-1", "141-22-4", "132-19-2", "139-20-3" };
    public static String getRandomFirstMaleName() {
        Random random = new Random();
        int minIndex = 0;
        return firstNamesMale[random.nextInt(minIndex, firstNamesMale.length)];
    }
    public static String getRandomFirstFemaleName() {
        Random random = new Random();
        int minIndex = 0;
        return firstNamesFemale[random.nextInt(minIndex, firstNamesFemale.length)];
    }
    public static String getRandomLastName() {
        Random random = new Random();
        int minIndex = 0;
        return lastNames[random.nextInt(minIndex, lastNames.length)];
    }
    public static String getRandomPatronymicMaleName() {
        Random random = new Random();
        int minIndex = 0;
        return patronymicMaleNames[random.nextInt(minIndex, patronymicMaleNames.length)];
    }
    public static String getRandomPatronymicFemaleName() {
        Random random = new Random();
        int minIndex = 0;
        return patronymicFemaleNames[random.nextInt(minIndex, patronymicFemaleNames.length)];
    }
    public static String getUniversityName() {
        return universityName;
    }
    public static String getRandomFacultyName() {
        Random random = new Random();
        int minIndex = 0;
        return facultyNames[random.nextInt(minIndex, facultyNames.length)];
    }
    public static String getRandomDepartmentName() {
        Random random = new Random();
        int minIndex = 0;
        return departmentNames[random.nextInt(minIndex, departmentNames.length)];
    }
    public static String getRandomGroupName() {
        Random random = new Random();
        int minIndex = 0;
        return groupNames[random.nextInt(minIndex, groupNames.length)];
    }
}
