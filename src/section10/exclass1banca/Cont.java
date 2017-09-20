package section10.exclass1banca;

public class Cont {
    private String numeClient;
    private int numarCont;
    private int sold;

    public Cont() {
    }

    public int getSold() {
        return sold;
    }

    public void setSold(int suma) {
        sold = suma;
    }

    public Cont(String numeClient, int numarCont, int sold) {
        this.numeClient = numeClient;
        this.numarCont = numarCont;
        this.sold = sold;
    }


    public void afiseazaSold() {
        System.out.println("Soldul este " + sold);
    }

    public void depoziteazaSold(int suma) {
        System.out.println("S-a depositat " + suma + "ron");

        if (suma > 0) {
            sold += suma;
            System.out.println("S-a depozitat " + suma + "ron");
        } else {
            System.out.println("Suma introdusa nu este valabila");
        }
    }

    public void retrageNumerar(int suma) {
        if (suma < sold) {
            System.out.println("Nu aveti destule fonduri.");
        } else {
            sold -= suma;
            System.out.println("S-a extras " + suma + "ron");
        }
    }
}
