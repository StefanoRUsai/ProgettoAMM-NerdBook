/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amm.nerdbook.classi;

/**
 *
 * @author St3
 */
public class Post {

    public enum Type {
        TEXT, IMAGE, URL
    };

    private static int id = 0;
    protected int idpost;
    protected UtentiRegistrati user;
    private String content;
    private Type postType;

    public Post() {
        id++;
        idpost = id;
        user = null;
        content = "";
        postType = Type.TEXT;
    }

    /**
     * @return the id
     */
    public int getId() {
        return idpost;
    }

    /**
     * @param id the id to set
     */
    public void setIdPost() {
        id++;
        this.idpost = id;
    }

    /**
     * @return the user
     */
    public UtentiRegistrati getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(UtentiRegistrati user) {
        this.user = user;
    }

    /**
     * @return the content
     */
    public String getContent() {
        return content;
    }

    /**
     * @param content the content to set
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * @return the postType
     */
    public Type getPostType() {
        return postType;
    }

    /**
     * @param postType the postType to set
     */
    public void setPostType(Type postType) {
        this.postType = postType;
    }
}
