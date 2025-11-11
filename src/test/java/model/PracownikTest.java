package model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PracownikTest {


    @Test
    void shouldReturnFalseIfTwoEmployeesAreSameOfNull(){
        Pracownik p1 = new Pracownik("Anna", "Lobejo", "TechCorp", "lobejo1@sigma.nd", Stanowisko.PROGRAMISTA);
        Pracownik p2 = new Pracownik("Michalinka", "Sin", "TechCorp", "lobejo1@sigma.nd", Stanowisko.PROGRAMISTA);

        boolean result = p1.equals(p2);
        assertEquals(true, result);
    }

}
