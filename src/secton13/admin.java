package secton13;

import java.sql.*;

public class admin {
    public static void main(String[] args) {
        String dbur1 = "jdbc:postgresql://localhost/Administratie";
        String user = "postgres";
        String password = "1234";

        try {
            Connection myConn = DriverManager.getConnection(dbur1, user, password);
            System.out.println("Ce fain!!!");
            Statement myStmt = myConn.createStatement();
            Angajat pres1 = new Angajat(5, "Hanna", "CJ", 200.00);
            pres1.inregistraza(myStmt, "angajat");
            String crTable = "CREATE TABLE angajat (" +
                    "pk_id int PRIMARY KEY NOT NULL, " +
                    "nume char (60), " +
                    "adresa char (120)," +
                    "salariu real )";
            myStmt.executeUpdate(crTable);
                    /*
                    String db "create database myNewDb";
                    String delDb "drop database myNewDb";
                     */

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("nu merge : (");
        }
    }
}
