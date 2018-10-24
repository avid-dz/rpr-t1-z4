package ba.unsa.etf.rpr.tutorijal01;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PredmetTest {

    @Test
    void getNazivPredmeta() {
        Predmet p = new Predmet("Logika", 125, 1000);
        assertEquals("Logika", p.getNazivPredmeta());
    }

    @Test
    void setNazivPredmeta() {
        Predmet p = new Predmet("Logika", 125, 1000);
        p.setNazivPredmeta("Matematika");
        assertEquals("Matematika", p.getNazivPredmeta());
    }

    @Test
    void getSifraPredmeta() {
        Predmet p = new Predmet("Logika", 125, 1000);
        assertEquals(125, p.getSifraPredmeta());
    }

    @Test
    void setSifraPredmeta() {
        Predmet p = new Predmet("Logika", 125, 1000);
        p.setSifraPredmeta(180);
        assertEquals(180, p.getSifraPredmeta());
    }

    @Test
    void getBrojStudenata() {
        Predmet p = new Predmet("Logika", 125, 1000);
        assertEquals(0, p.getBrojStudenata());
    }

    @Test
    void getMAX_BROJ_STUDENATA() {
        Predmet p = new Predmet("Logika", 125, 1000);
        assertEquals(1000, p.getMAX_BROJ_STUDENATA());
    }

    @Test
    void upisi() {
        Predmet p = new Predmet("Fizika", 167, 800);
        Student s = new Student("Dzavid", "Brdar", 18182);
        p.upisi(s);
        s = new Student("Meho", "Mehic", 18987);
        p.upisi(s);
        s = new Student("Meho", "Mehic", 18987);
        p.upisi(s);
        assertEquals(3, p.getBrojStudenata());
    }

    @Test
    void ispisi() {
        Predmet p = new Predmet("Fizika", 167, 800);
        Student prvi = new Student("Dzavid", "Brdar", 18182);
        p.upisi(prvi);
        Student drugi = new Student("Mujo", "Mujic", 18199);
        p.upisi(drugi);
        p.ispisi(prvi);
        assertEquals(1, p.getBrojStudenata());
    }

    @Test
    void testViseMetodaKlasePredmet() {
        Predmet p = new Predmet("Matematika", 198, 900);
        Student prvi = new Student("Neko", "Nekic", 18185);
        p.upisi(prvi);
        Student drugi = new Student("Alen", "Alenovic", 18198);
        p.upisi(drugi);
        Student treci = new Student("Nihad", "Nihic", 18222);
        p.upisi(treci);
        p.ispisi(drugi);
        p.setNazivPredmeta("Statistika");
        Student cetvrti = new Student("Haso", "Hasic", 18965);
        p.upisi(cetvrti);
        assertAll("Test vise metoda klase Predmet",
                () -> assertEquals(3, p.getBrojStudenata()),
                () -> assertEquals(900, p.getMAX_BROJ_STUDENATA()),
                () -> assertEquals(198, p.getSifraPredmeta()),
                () -> assertEquals("Statistika", p.getNazivPredmeta())
        );
    }
}