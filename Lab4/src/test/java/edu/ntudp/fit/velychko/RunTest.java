package edu.ntudp.fit.velychko;

import edu.ntudp.fit.velychko.model.University;

import static org.junit.jupiter.api.Assertions.*;

class RunTest {

    @org.junit.jupiter.api.Test
    public void universityToJson() {
        University oldUniversity = Run.createTypicalUniversity();
        JsonManager.writeToJsonFile(oldUniversity, "f:\\oldUniversity.json");
        University newUniversity = JsonManager.readFromJsonFile("f:\\oldUniversity.json");
        assertEquals(oldUniversity, newUniversity);
    }
}