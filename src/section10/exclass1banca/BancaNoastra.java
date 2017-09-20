package section10.exclass1banca;

public class BancaNoastra {
    public static void main(String[] args) {
        ContEconomii cont1 = new ContEconomii("Alice", 1234, 2000,0);
        cont1.afiseazaSold();
        cont1.depoziteazaSold(100);
        cont1.afiseazaSold();
        cont1.depoziteazaSold(-1000);
        cont1.afiseazaSold();
        cont1.retrageNumerar(200);
        cont1.afiseazaSold();

    }
}
