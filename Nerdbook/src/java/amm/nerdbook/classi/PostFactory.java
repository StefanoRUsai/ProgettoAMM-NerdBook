/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amm.nerdbook.classi;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author St3
 */
public class PostFactory {

    //Pattern Design Singleton
    private static PostFactory singleton;

    public static PostFactory getInstance() {
        if (singleton == null) {
            singleton = new PostFactory();
        }
        return singleton;
    }

    private ArrayList<Post> listaPost = new ArrayList<Post>();

    private PostFactory() {

        UtentiRegistratiFactory utentiRegistratiFactory = UtentiRegistratiFactory.getInstance();

        //Creazione Post
        Post post1 = new Post();
        post1.setIdPost(1);
        post1.setUser(utentiRegistratiFactory.getUtentiRegistratiById(1));
        post1.setContent(" trallalero trallala che cosa si scriverà?");
        post1.setImage("");
        post1.setLink("");
        post1.setUrlVideo("");

        Post post2 = new Post();
        post2.setIdPost(2);
        post2.setUser(utentiRegistratiFactory.getUtentiRegistratiById(2));
        post2.setContent("Divvertente questa immagine di pack Man ");
        post2.setImage("img/b0979598-c427-4f71-b235-51e4c733753d.jpg");
        post2.setLink("");
        post2.setUrlVideo("");

        Post post3 = new Post();
        post3.setIdPost(3);
        post3.setUser(utentiRegistratiFactory.getUtentiRegistratiById(3));
        post3.setContent("Simpatica la descrizione del minus world");
        post3.setImage("");
        post3.setLink("https://it.wikipedia.org/wiki/Super_Mario_Bros.");
        post3.setUrlVideo("");

        Post post4 = new Post();
        post4.setIdPost(4);
        post4.setUser(utentiRegistratiFactory.getUtentiRegistratiById(4));
        post4.setContent("we we bello sto video!!");
        post4.setImage("");
        post4.setLink("");
        post4.setUrlVideo("https://www.youtube.com/embed/-Khe61uso_o");

        Post post5 = new Post();
        post5.setIdPost(5);
        post5.setUser(utentiRegistratiFactory.getUtentiRegistratiById(4));
        post5.setContent("Che bello quando funzionano le cose e diventi subito contento");
        post5.setImage("img/b0979598-c427-4f71-b235-51e4c733753d.jpg");
        post5.setLink("");
        post5.setUrlVideo("");
        
        
        Post post6 = new Post();
        post6.setIdPost(6);
        post6.setUser(utentiRegistratiFactory.getUtentiRegistratiById(6));
        post6.setContent("Il nuovo video di Coez");
        post6.setImage("");
        post6.setLink("");
        post6.setUrlVideo("https://www.youtube.com/embed/zVzER12pk4o");

        listaPost.add(post1);
        listaPost.add(post2);
        listaPost.add(post3);
        listaPost.add(post4);
        listaPost.add(post5);
        listaPost.add(post6);
    }

    public Post getPostById(int id) {
        for (Post post : this.listaPost) {
            if (post.getId() == id) {
                return post;
            }
        }
        return null;
    }

    public List getPostList(UtentiRegistrati utentediverso) {

        List<Post> listaPost = new ArrayList<Post>();

        for (Post post : this.listaPost) {
            if (post.getUser().equals(utentediverso)) {
                listaPost.add(post);
            }
        }
        return listaPost;
    }

    public List getPostListforId(int userID) {

        UtentiRegistrati utente = UtentiRegistratiFactory.getInstance().getUtentiRegistratiById(userID);
        List<Post> lista = PostFactory.getInstance().getPostList(utente);

        return lista;
    }
    
    
    public List getGlobalPostList(){

        List<Post> listaPost = new ArrayList<Post>();


        return this.listaPost;
    }

}
