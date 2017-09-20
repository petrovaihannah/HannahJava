package section10.employeeRecords;

public class employee {
    public String nume;
    public int cnp;
    public String adresa;
    public String dataAngajari;
    public int salariu;

    public void afiseazasalariu() {
        System.out.println("soldul este de " + salariu+ " RON");
    }
    public void schimbasalariu(int suma){
        if (suma > 0) {
            salariu += suma;
            System.out.println("total salary " + suma + " RON");
        }}
          public int getSalariu(){
            return salariu;
    }
          public int getCnp(){
              return cnp;
    }
          public String getAdresa(){
              return adresa;
          }

    public String getDataAngajari() {
        return dataAngajari;
    }
}

