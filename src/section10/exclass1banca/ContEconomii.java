package section10.exclass1banca;

public class ContEconomii extends Cont {
    double dobanda;
    public ContEconomii(String numeClient, int numarCont, int sold, double dobanda){
        super (numeClient, numarCont, sold);
        this.dobanda = dobanda;
    }


}
