package secton13;


import java.sql.SQLException;
import java.sql.Statement;

public class Angajat {
    int id;
    String name;
    String adresa;
    double salariu;

    public Angajat(int id, String name, String adresa, double salariu) {
        this.id = id;
        this.name = name;
        this.adresa = adresa;
        this.salariu = salariu;
    }


    public void inregistraza(Statement stmt, String table) {
        String reg = "insert into " + table
                + "(pk_id,nume,adresa,salariu) values (" +
                this.id + ", '" + this.name + "', '" + this.adresa + "', " + this.salariu +")";
        System.out.println(reg);
        try {
            stmt.executeUpdate(reg);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
