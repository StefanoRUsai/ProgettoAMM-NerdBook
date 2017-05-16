/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amm.nerdbook.classi;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Connection;
import java.util.List;




/**
 *
 * @author St3
 */
public class UtentiRegistratiFactory {

    private String connectionString;
    //Pattern Design Singleton
    private static UtentiRegistratiFactory singleton;

    public static UtentiRegistratiFactory getInstance() {
        if (singleton == null) {
            singleton = new UtentiRegistratiFactory();
        }
        return singleton;
    }


    public UtentiRegistrati getUtentiRegistratiById(int id) {

        try {
            // path, username, password
            Connection conn = DriverManager.getConnection(connectionString, "stefano", "stefano");
            
            String query = "select * from utentiRegistrati "+ "where idUtentiRegistrati = ?";
            
            // Prepared Statement
            PreparedStatement stmt = conn.prepareStatement(query);
            
            // Si associano i valori
            stmt.setInt(1, id);
            
            // Esecuzione query
            ResultSet res = stmt.executeQuery();

            // ciclo sulle righe restituite
            if (res.next()) {
                UtentiRegistrati current = new UtentiRegistrati();
                current.setIdUtente(res.getInt("idUtentiRegistrati"));
                current.setNome(res.getString("nome"));
                current.setCognome(res.getString("cognome"));
                current.setPassword(res.getString("password"));
                current.setEmail(res.getString("email"));
                current.setUrlAvatar(res.getString("urlAvatar"));
                current.setData(res.getString("data"));
                current.setFrase(res.getString("frase"));
                current.setType(res.getInt("type"));
                
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
    


    
    public ArrayList<UtentiRegistrati> getDataBaseUtenti(UtentiRegistrati utenteloggato) {
        ArrayList<UtentiRegistrati> nuovalista = new ArrayList<UtentiRegistrati>();
        ArrayList<UtentiRegistrati> listaUtenti = new ArrayList<UtentiRegistrati>();
        try {
            // path, username, password
            Connection conn = DriverManager.getConnection(connectionString, "stefano", "stefano");

            String query = "select * from utentiRegistrati";
            // Prepared Statement
            PreparedStatement stmt = conn.prepareStatement(query);


            // Esecuzione query
            ResultSet res = stmt.executeQuery();

            // ciclo sulle righe restituite
            while (res.next()) {
                
                UtentiRegistrati current = new UtentiRegistrati();
                current.setIdUtente(res.getInt("idUtentiRegistrati"));
                current.setNome(res.getString("nome"));
                current.setCognome(res.getString("cognome"));
                current.setPassword(res.getString("password"));
                current.setEmail(res.getString("email"));
                current.setUrlAvatar(res.getString("urlAvatar"));
                current.setData(res.getString("data"));
                current.setFrase(res.getString("frase"));
                current.setType(res.getInt("type"));
                
               listaUtenti.add(current);
                
            }
            

            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        
        for (UtentiRegistrati utente : listaUtenti) {
            if (!(utente.equals(utenteloggato))) {
                nuovalista.add(utente);
            }
        }
        return nuovalista;
    }
    
        public ArrayList<UtentiRegistrati> getDataBaseUtenti() {
            ArrayList<UtentiRegistrati> listaUtenti = new ArrayList<UtentiRegistrati>();

        try {
            // path, username, password
            Connection conn = DriverManager.getConnection(connectionString, "stefano", "stefano");

            String query = "select * from utentiRegistrati";
            // Prepared Statement
            PreparedStatement stmt = conn.prepareStatement(query);


            // Esecuzione query
            ResultSet res = stmt.executeQuery();

            // ciclo sulle righe restituite
            while (res.next()) {
                
                UtentiRegistrati current = new UtentiRegistrati();
                current.setIdUtente(res.getInt("idUtentiRegistrati"));
                current.setNome(res.getString("nome"));
                current.setCognome(res.getString("cognome"));
                current.setPassword(res.getString("password"));
                current.setEmail(res.getString("email"));
                current.setUrlAvatar(res.getString("urlAvatar"));
                current.setData(res.getString("data"));
                current.setFrase(res.getString("frase"));
                current.setType(res.getInt("type"));
                
                listaUtenti.add(current);
            }
            

            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return listaUtenti;
        }

    public UtentiRegistrati getUtentiRegistratiByNome(String nome) {
        
           ArrayList<UtentiRegistrati> listaUtenti = new ArrayList<UtentiRegistrati>();

        try {
            // path, username, password
            Connection conn = DriverManager.getConnection(connectionString, "stefano", "stefano");

            String query = "select * from utentiRegistrati";
            // Prepared Statement
            PreparedStatement stmt = conn.prepareStatement(query);


            // Esecuzione query
            ResultSet res = stmt.executeQuery();

            // ciclo sulle righe restituite
            while (res.next()) {
                
                UtentiRegistrati current = new UtentiRegistrati();
                current.setIdUtente(res.getInt("idUtentiRegistrati"));
                current.setNome(res.getString("nome"));
                current.setCognome(res.getString("cognome"));
                current.setPassword(res.getString("password"));
                current.setEmail(res.getString("email"));
                current.setUrlAvatar(res.getString("urlAvatar"));
                current.setData(res.getString("data"));
                current.setFrase(res.getString("frase"));
                current.setType(res.getInt("type"));
                
                listaUtenti.add(current);
            }
            

            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        
        
        for (UtentiRegistrati utentiRegistrati : listaUtenti) {
            if (utentiRegistrati.getNome().equals(nome)) {
                return utentiRegistrati;
            }
        }
        return null;
    }
    
    public int getIdByUserAndPassword(String user, String password){
        try {
            // path, username, password
            Connection conn = DriverManager.getConnection(connectionString, "stefano", "stefano");
            
            String query = 
                      "select idUtentiRegistrati from utentiRegistrati "
                    + "where nome = ? and password = ?";
            
            // Prepared Statement
            PreparedStatement stmt = conn.prepareStatement(query);
            
            // Si associano i valori
            stmt.setString(1, user);
            stmt.setString(2, password);
            
            // Esecuzione query
            ResultSet res = stmt.executeQuery();

            // ciclo sulle righe restituite
            if (res.next()) {
                int id = res.getInt("idUtentiRegistrati");

                stmt.close();
                conn.close();
                return id;
            }

            stmt.close();
            conn.close();
        } catch (SQLException e) {
            System.out.println("nada de nada");
            e.printStackTrace();
        }
        return -1;
        
    }

    
    
    public void setConnectionString(String s) {
        this.connectionString = s;
    }

    public String getConnectionString() {
        return this.connectionString;
    
    }
}
