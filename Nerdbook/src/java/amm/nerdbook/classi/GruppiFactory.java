
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amm.nerdbook.classi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author St3
 */
public class GruppiFactory {

    private String connectionString;
    //Pattern Design Singleton
    private static GruppiFactory singleton;

    public static GruppiFactory getInstance() {
        if (singleton == null) {
            singleton = new GruppiFactory();
        }
        return singleton;
    }

    public ArrayList<Gruppi> getDBGruppi() {

        ArrayList<Gruppi> listaGruppi = new ArrayList<Gruppi>();

        try {
            // path, username, password
            Connection conn = DriverManager.getConnection(connectionString, "stefano", "stefano");

            String query = "select * from gruppi";
            // Prepared Statement
            PreparedStatement stmt = conn.prepareStatement(query);

            // Esecuzione query
            ResultSet res = stmt.executeQuery();

            // ciclo sulle righe restituite
            while (res.next()) {

                Gruppi current = new Gruppi();
                current.setIdGruppi(res.getInt("idGruppi"));
                current.setNome(res.getString("nome"));

                listaGruppi.add(current);
            }

            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return listaGruppi;
    }

    public Gruppi getGruppiById(int id) {
        ArrayList<Gruppi> listaGruppi = new ArrayList<Gruppi>();

        try {
            // path, username, password
            Connection conn = DriverManager.getConnection(connectionString, "stefano", "stefano");

            String query = "select * from gruppi";
            // Prepared Statement
            PreparedStatement stmt = conn.prepareStatement(query);

            // Esecuzione query
            ResultSet res = stmt.executeQuery();

            // ciclo sulle righe restituite
            while (res.next()) {

                Gruppi current = new Gruppi();
                current.setIdGruppi(res.getInt("idGruppi"));
                current.setNome(res.getString("nome"));

                listaGruppi.add(current);
            }

            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        for (Gruppi gruppi : listaGruppi) {
            if (gruppi.getIdGruppi() == id) {
                return gruppi;
            }
        }
        return null;
    }

    public void setConnectionString(String s) {
        this.connectionString = s;
    }

    public String getConnectionString() {
        return this.connectionString;

    }

}

