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

    public boolean upisi(Student s) {
        boolean pronadjen = false;
        if (brojStudenata != 0) {
            for (int i = 0; i < brojStudenata; i++) {
                if (nizStudenata[i].getIme().equals(s.getIme())
                        && nizStudenata[i].getPrezime().equals(s.getPrezime())
                        && nizStudenata[i].getBrojIndexa() == s.getBrojIndexa()) {
                    pronadjen = true;
                    break;
                }
            }
        }
        if (pronadjen == true) {
            System.out.println("Ne mozete upisati dvaput istog studenta!");
            return false;
        }
        nizStudenata[brojStudenata] = s;
        brojStudenata++;
        System.out.println("Student uspjesno upisan na predmet.");
        return true;
    }
    public boolean ispisi(Student s) {
        if (brojStudenata == 0) return false;
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
    public boolean ispisSpiskaStudenata() {
        if (brojStudenata == 0) return false;
        for (int i = 0; i < brojStudenata; i++) {
            System.out.print((i + 1) + ". ");
            System.out.println(nizStudenata[i]);
        }
        return true;
    }
}
