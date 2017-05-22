
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

            // formo il gruppo
            if (res.next()) {

                Gruppi current = new Gruppi();
                current.setIdGruppi(res.getInt("idGruppi"));
                current.setNome(res.getString("nome"));
                current.setAdmin(res.getInt("idAdmin"));
                listaGruppi.add(current);
            

            
                stmt.close();
                conn.close();
                return current;
            }
            
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    public void setConnectionString(String s) {
        this.connectionString = s;
    }

    public String getConnectionString() {
        return this.connectionString;

    }

    public void addNewGroup(Gruppi gruppo) {
        try {
            // path, username, password
            Connection conn = DriverManager.getConnection(connectionString, "stefano", "stefano");

            String query
                    = "insert into gruppi  (idGruppi, nome, image, idAdmin) "
                    + "values (default, ? , ? , ? )";

            // Prepared Statement
            PreparedStatement stmt = conn.prepareStatement(query);

            // Si associano i valori
            stmt.setString(1, gruppo.getNome());

            stmt.setString(2, gruppo.getUrlAvatar());

            stmt.setInt(3, gruppo.getAdmin());

            stmt.executeUpdate();

            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteGruppo(Gruppi gruppo, UtentiRegistrati utente) {

        if (gruppo.getAdmin() == utente.getIdUtente() || utente.getIdUtente() == 1) {

            try {
                Connection conn = DriverManager.getConnection(connectionString, "stefano", "stefano");
                String query
                        = "delete from gruppi "
                        + "where idGruppi = ? ";
                // Si associano i valori

                PreparedStatement stmt = conn.prepareStatement(query);

                // Si associano i valori
                stmt.setInt(1, gruppo.getIdGruppi());

                // Esecuzione query
                stmt.executeUpdate();
                stmt.close();
                conn.close();

            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
    }

}
