package ba.unsa.etf.rpr.tutorijal01;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void getIme() {
        Student s = new Student("Novi", "Studentcic", 18176);
        assertEquals("Novi", s.getIme());
    }

    @Test
    void setIme() {
        Student s = new Student("Novi", "Studentcic", 18176);
        s.setIme("DrugoIme");
        assertEquals("DrugoIme", s.getIme());
    }

    @Test
    void getPrezime() {
        Student s = new Student("Najnoviji", "Studentcic", 18176);
        assertEquals("Studentcic", s.getPrezime());
    }

    @Test
    void setPrezime() {
        Student s = new Student("Novi", "Studentcic", 18176);
        s.setPrezime("DrugoPrezime");
        assertEquals("DrugoPrezime", s.getPrezime());
    }

    @Test
    void getBrojIndexa() {
        Student s = new Student("Novi", "Studentcic", 18176);
        assertEquals(18176, s.getBrojIndexa());
    }

    @Test
    void setBrojIndexa() {
        Student s = new Student("Novi", "Studentcic", 18176);
        s.setBrojIndexa(18189);
        assertEquals(18189, s.getBrojIndexa());
    }

    @Test
    void testIspisaStudenta() {
        Student s = new Student("Dzavid", "Brdar", 18182);
        assertEquals("Brdar Dzavid (18182)", s.toString());
    }

    @Test
    void testViseMetodaKlaseStudent() {
        Student s = new Student("Dzavid", "Brdar", 18182);
        assertAll("Test gettera i ispisivanja studenta zajedno",
                () -> assertEquals("Dzavid", s.getIme()),
                () -> assertEquals("Brdar", s.getPrezime()),
                () -> assertEquals(18182, s.getBrojIndexa()),
                () -> assertEquals("Brdar Dzavid (18182)", s.toString())
        );
    }

    @Test
    void testBrisanjaNepostojecegStudenta() {

    }
}