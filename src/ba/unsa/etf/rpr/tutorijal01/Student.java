package ba.unsa.etf.rpr.tutorijal01;

public class Student {

    private String ime;
    private String prezime;
    private int brojIndexa;

    public String getIme() {
        return ime;
    }
    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }
    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public int getBrojIndexa() {
        return brojIndexa;
    }
    public void setBrojIndexa(int brojIndexa) {
        this.brojIndexa = brojIndexa;
    }

    public Student(String ime, String prezime, int brojIndexa) {
        this.ime = ime;
        this.prezime = prezime;
        this.brojIndexa = brojIndexa;
    }

    public String toString() {
        return prezime + " " + ime + " (" + brojIndexa + ")";
    }
}