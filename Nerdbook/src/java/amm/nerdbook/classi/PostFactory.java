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
        post1.setContent("Ciao, miei schiavi. Datemi cibo! Adesso! Miaomiaomiaomiaomiao!");
        post1.setIdPost();
        post1.setUser(utentiRegistratiFactory.getUtentiRegistratiById(0));

        Post post2 = new Post();
        post2.setContent("img/djanni1.jpg");
        post2.setIdPost();
        post2.setUser(utentiRegistratiFactory.getUtentiRegistratiById(0));
        post2.setPostType(Post.Type.IMAGE);

        Post post3 = new Post();
        post3.setContent("img/djanni2.jpg");
        post3.setIdPost();
        post3.setUser(utentiRegistratiFactory.getUtentiRegistratiById(0));
        post3.setPostType(Post.Type.IMAGE);

        Post post4 = new Post();
        post4.setContent("I need ansioliticy");
        post4.setIdPost();
        post4.setUser(utentiRegistratiFactory.getUtentiRegistratiById(1));

        Post post5 = new Post();
        post5.setContent("https://68.media.tumblr.com/51942e1f788f7209ee0f6db7cfc5e0fb/tumblr_n37ycpbMZf1rkxod7o1_500.jpg");
        post5.setIdPost();
        post5.setUser(utentiRegistratiFactory.getUtentiRegistratiById(1));
        post5.setPostType(Post.Type.IMAGE);

        listaPost.add(post1);
        listaPost.add(post2);
        listaPost.add(post3);
        listaPost.add(post4);
        listaPost.add(post5);
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
}
