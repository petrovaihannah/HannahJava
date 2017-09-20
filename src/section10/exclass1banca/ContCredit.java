package section10.exclass1banca;

public class ContCredit extends Cont {
    private int credit;

    public ContCredit(String numeClient, int numarCont, int sold, int credit) {
        super(numeClient, numarCont, sold);
        this.credit = credit;
    }

    public void retrageNumerar(int suma) {
        int soldVechi = getSold();
        if (suma > soldVechi + credit) {
            System.out.println("----");
        } else {

        }

    }

}

