package ba.unsa.etf.rpr.tutorijal01;

public class Predmet {

    private String nazivPredmeta;
    private Student[] nizStudenata;
    private final int MAX_BROJ_STUDENATA;
    private int brojStudenata;
    private int sifraPredmeta;

    public String getNazivPredmeta() {
        return nazivPredmeta;
    }
    public void setNazivPredmeta(String nazivPredmeta) {
        this.nazivPredmeta = nazivPredmeta;
    }

    public int getSifraPredmeta() {
        return sifraPredmeta;
    }
    public void setSifraPredmeta(int sifraPredmeta) {
        this.sifraPredmeta = sifraPredmeta;
    }

    public int getBrojStudenata() {
        return brojStudenata;
    }

    public int getMAX_BROJ_STUDENATA() {
        return MAX_BROJ_STUDENATA;
    }

    public Predmet(String nazivPredmeta, int sifraPredmeta, int maxBrojStudenata) {
        this.MAX_BROJ_STUDENATA = maxBrojStudenata;
        this.nazivPredmeta = nazivPredmeta;
        this.sifraPredmeta = sifraPredmeta;
        brojStudenata = 0;
        nizStudenata = new Student[maxBrojStudenata];
    }

    public void upisi(Student s) {
        nizStudenata[brojStudenata] = s;
        brojStudenata++;
    }
    public boolean ispisi(Student s) {
        boolean pronadjen = false;
        for (int i = 0; i < brojStudenata; i++) {
            if (nizStudenata[i].getIme().equals(s.getIme()) && nizStudenata[i].getPrezime().equals(s.getPrezime())
                    && nizStudenata[i].getBrojIndexa() == s.getBrojIndexa()) {
                for (int j = i; j < brojStudenata - 1; j++) {
                    nizStudenata[j] = nizStudenata[j + 1];
                }
                brojStudenata--;
                pronadjen = true;
                System.out.println("Student uspjesno obrisan.");
            }
        }
        if (pronadjen == false) System.out.println("Nije pronadjen takav student.");
        return pronadjen;
    }
    public void ispisSpiskaStudenata() {
        for (int i = 0; i < brojStudenata; i++) {
            System.out.print((i + 1) + ". ");
            System.out.println(nizStudenata[i]);
        }
    }
}
