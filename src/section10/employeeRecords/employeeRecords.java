package section10.employeeRecords;

public class employeeRecords extends employee {
    public employeeRecords (String nume, int cnp, String adresa, String dataAngajari, int salariu) {
        this.nume = nume;
        this.cnp = cnp;
        this.adresa = adresa;
        this.dataAngajari = dataAngajari;
        this.salariu = salariu;
    }
    public void afiseazasalariu() {
        System.out.println("Soldul este " + salariu);
    }

    public void schimbasalariu(int suma) {
        System.out.println("S-a depositat " + suma + "ron");

        if (suma > 0) {
            salariu += suma;
            System.out.println("S-a depozitat " + suma + "ron");
        } else {
            System.out.println("Suma introdusa nu este valabila");
        }
    }
}

