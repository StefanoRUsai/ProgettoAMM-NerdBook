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

    

    protected int idpost;
    protected UtentiRegistrati user;
    private String imageUser;
    private String nomeUtente;
    private String content;
    private String image;
    private String link;
    private String urlVideo;
    
    public Post() {
        
        this.idpost = 0;
        this.user = null;
        this.imageUser = null;
        this.content = "";
        this.image = "";
        this.link = "";
        this.urlVideo = "";
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
    public void setIdPost(int id) {
        
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
        this.imageUser=this.user.getUrlAvatar();
        this.nomeUtente=this.user.getNome()+" "+this.user.getCognome();
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
     * @return the imageUser
     */
    public String getImageUser() {
        return imageUser;
    }

    /**
     * @param imageUser the imageUser to set
     */
    public void setImageUser(String imageUser) {
        this.imageUser = imageUser;
    }

    /**
     * @return the image
     */
    public String getImage() {
        return image;
    }

    /**
     * @param image the image to set
     */
    public void setImage(String image) {
        this.image = image;
    }

    /**
     * @return the urlImage
     */

    /**
     * @return the urlVideo
     */
    public String getUrlVideo() {
        return urlVideo;
    }

    /**
     * @param urlVideo the urlVideo to set
     */
    public void setUrlVideo(String urlVideo) {
        this.urlVideo = urlVideo;
    }

    /**
     * @return the nomeutente
     */
    public String getNomeUtente() {
        return nomeUtente;
    }

    /**
     * @param nomeUtente the nomeUtente to set
     */
    public void setNomeUtente(String nomeUtente) {
        this.nomeUtente = nomeUtente;
    }

    /**
     * @return the link
     */
    public String getLink() {
        return link;
    }

    /**
     * @param link the link to set
     */
    public void setLink(String link) {
        this.link = link;
    }
}
