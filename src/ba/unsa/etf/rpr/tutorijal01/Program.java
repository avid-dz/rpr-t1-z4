package ba.unsa.etf.rpr.tutorijal01;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        int opcija;
        Scanner scan = new Scanner(System.in);
        Predmet noviPredmet = null;
        while (true) {
            System.out.println("Izaberite opciju (0 za kraj): ");
            System.out.println("1 - Kreiranje novog predmeta");
            System.out.println("2 - Kreiranje novog studenta i upis studenta na predmet");
            System.out.println("3 - Ispis studenta sa predmeta i brisanje studenta");
            System.out.println("4 - Brisanje predmeta");
            System.out.println("5 - Ispis spiska studenata na predmetu");
            opcija = scan.nextInt();
            if (opcija == 0) break;
            switch (opcija) {
                case 1:
                    System.out.print("Unesite naziv predmeta: ");
                    String unesenoImePredmeta = scan.next();
                    System.out.print("Unesite sifru predmeta: ");
                    int unesenaSifraPredmeta = scan.nextInt();
                    System.out.print("Unesite maksimalan broj studenata na predmetu: ");
                    int uneseniMaxBrojStudenata = scan.nextInt();
                    noviPredmet = new Predmet(unesenoImePredmeta, unesenaSifraPredmeta, uneseniMaxBrojStudenata);
                    System.out.println();
                    break;
                case 2:
                    if (noviPredmet.getBrojStudenata() == noviPredmet.getMAX_BROJ_STUDENATA()) {
                        System.out.println("Popunjen kapacitet na predmetu!");
                        System.out.println();
                        break;
                    }
                    System.out.print("Unesite ime studenta: ");
                    String unesenoImeStudenta = scan.next();
                    System.out.print("Unesite prezime studenta: ");
                    String unesenoPrezimeStudenta = scan.next();
                    System.out.print("Unesite broj indexa studenta: ");
                    int uneseniBrojIndexa = scan.nextInt();
                    Student noviStudent = new Student(unesenoImeStudenta, unesenoPrezimeStudenta, uneseniBrojIndexa);
                    noviPredmet.upisi(noviStudent);
                    System.out.println();
                    break;
                case 3:
                    System.out.print("Unesite ime studenta za brisanje: ");
                    String imeStudentaZaBrisanje = scan.next();
                    System.out.print("Unesite prezime studenta za brisanje: ");
                    String prezimeStudentaZaBrisanje = scan.next();
                    System.out.print("Unesite broj indexa studenta za brisanje: ");
                    int brojIndexaZaBrisanje = scan.nextInt();
                    Student studentZaBrisanje = new Student(imeStudentaZaBrisanje, prezimeStudentaZaBrisanje,
                            brojIndexaZaBrisanje);
                    noviPredmet.ispisi(studentZaBrisanje);
                    System.out.println();
                    break;
                case 4:
                    noviPredmet = null;
                    System.out.println("Predmet uspjesno obrisan.");
                    System.out.println();
                    break;
                case 5:
                    noviPredmet.ispisSpiskaStudenata();
                    System.out.println();
                    break;
            }
        }
    }
}