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
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author St3
 */
public class PostFactory {

    private String connectionString;
    //Pattern Design Singleton
    private static PostFactory singleton;

    public static PostFactory getInstance() {
        if (singleton == null) {
            singleton = new PostFactory();
        }
        return singleton;
    }

    public Post getPostById(int id) {
        UtentiRegistratiFactory utente = UtentiRegistratiFactory.getInstance();

        try {
            // path, username, password
            Connection conn = DriverManager.getConnection(connectionString, "stefano", "stefano");

            String query = "select * from posts " + "where idPosts = ?";

            // Prepared Statement
            PreparedStatement stmt = conn.prepareStatement(query);

            // Si associano i valori
            stmt.setInt(1, id);

            // Esecuzione query
            ResultSet res = stmt.executeQuery();

            // ciclo sulle righe restituite
            if (res.next()) {
                Post current = new Post();
                //imposto id del post
                current.setIdPost(res.getInt("idPosts"));

                //impost il contenuto del post
                current.setContent(res.getString("content"));

                //imposto l'autore del post
                current.setUser(utente.getUtentiRegistratiById(res.getInt("author")));
                current.setImage(res.getString("image"));
                current.setUrlVideo(res.getString("urlVideo"));
                current.setLink(res.getString("link"));

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

    public List getPostList(UtentiRegistrati utente) {
        List<Post> listaPost = new ArrayList<Post>();

        try {
            // path, username, password
            Connection conn = DriverManager.getConnection(connectionString, "stefano", "stefano");

            String query = "select * from posts " + "where author = ?";
            // Prepared Statement
            PreparedStatement stmt = conn.prepareStatement(query);

            // Si associano i valori
            stmt.setInt(1, utente.getIdUtente());

            // Esecuzione query
            ResultSet res = stmt.executeQuery();

            // ciclo sulle righe restituite
            while (res.next()) {

                Post current = new Post();
                //imposto id del post
                current.setIdPost(res.getInt("idPosts"));

                //impost il contenuto del post
                current.setContent(res.getString("content"));

                current.setUser(utente);
                current.setImage(res.getString("image"));
                current.setUrlVideo(res.getString("urlVideo"));
                current.setLink(res.getString("link"));

                //imposto l'autore del post
                current.setUser(utente);

                listaPost.add(current);
            }

            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return listaPost;
    }

    public List getPostListforId(int userID) {

        UtentiRegistrati utente = UtentiRegistratiFactory.getInstance().getUtentiRegistratiById(userID);
        List<Post> lista = PostFactory.getInstance().getPostList(utente);

        return lista;
    }

    public List getGlobalPostList() {
        List<Post> listaPost = new ArrayList<Post>();

        try {
            // path, username, password
            Connection conn = DriverManager.getConnection(connectionString, "stefano", "stefano");

            String query = "select * from posts ";
            // Prepared Statement
            PreparedStatement stmt = conn.prepareStatement(query);

            // Esecuzione query
            ResultSet res = stmt.executeQuery();

            // ciclo sulle righe restituite
            while (res.next()) {
                
                    Post current = new Post();
                    //imposto id del post
                    current.setIdPost(res.getInt("idPosts"));

                    //impost il contenuto del post
                    current.setContent(res.getString("content"));

                    current.setUser(UtentiRegistratiFactory.getInstance().getUtentiRegistratiById(res.getInt("author")));
                    current.setImage(res.getString("image"));
                    current.setUrlVideo(res.getString("urlVideo"));
                    current.setLink(res.getString("link"));

                    listaPost.add(current);
                
            }

            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return listaPost;
    }

    public List getPostListGruppi(int idGruppo) {
        List<Post> listaPost = new ArrayList<Post>();

        try {
            // path, username, password
            Connection conn = DriverManager.getConnection(connectionString, "stefano", "stefano");

            String query = "select * from posts " + "where bachecaGruppi = ?";
            // Prepared Statement
            PreparedStatement stmt = conn.prepareStatement(query);

            stmt.setInt(1, idGruppo);

            // Esecuzione query
            ResultSet res = stmt.executeQuery();

            // ciclo sulle righe restituite
            while (res.next()) {

                Post current = new Post();
                //imposto id del post
                current.setIdPost(res.getInt("idPosts"));

                //impost il contenuto del post
                current.setContent(res.getString("content"));

                current.setUser(UtentiRegistratiFactory.getInstance().getUtentiRegistratiById(res.getInt("author")));
                current.setImage(res.getString("image"));
                current.setUrlVideo(res.getString("urlVideo"));
                current.setLink(res.getString("link"));

                listaPost.add(current);

            }

            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return listaPost;
    }

    public void setConnectionString(String s) {
        this.connectionString = s;
    }

    public String getConnectionString() {
        return this.connectionString;

    }

}
