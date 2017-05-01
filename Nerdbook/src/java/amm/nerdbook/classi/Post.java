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
    private boolean gruppi;
    private Gruppi gruppo;
    private String nomeGruppo;
    private int bacheca;
    private int bachecaGruppi;
    
    public Post() {

        this.idpost = -1;
        this.user = null;
        this.imageUser = "";
        this.content = "";
        this.image = "";
        this.link = "";
        this.urlVideo = "";
        this.gruppi = false;
        this.gruppo = null;
        
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
        this.imageUser = this.user.getUrlAvatar();
        this.nomeUtente = this.user.getNome() + " " + this.user.getCognome();
        this.bacheca = this.user.getIdUtente();
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

    /**
     * @return the gruppi
     */
    public boolean isGruppi() {
        return gruppi;
    }

    /**
     * @param gruppi the gruppi to set
     */
    public void setGruppi(boolean gruppi) {
        this.gruppi = gruppi;
    }


    /**
     * @return the gruppo
     */
    public Gruppi getGruppo() {
        return gruppo;
    }

    /**
     * @param gruppo the gruppo to set
     */
    public void setGruppo(Gruppi gruppo) {
        this.gruppo = gruppo;
        this.bachecaGruppi = this.gruppo.getIdGruppi();
    }


    /**
     * @return the nomeGruppo
     */
    public String getNomeGruppo() {
        return nomeGruppo;
    }

    /**
     * @param nomeGruppo the nomeGruppo to set
     */
    public void setNomeGruppo(String nomeGruppo) {
        this.nomeGruppo = nomeGruppo;
    }

    
    /**
     * @return the Bacheca
     */
    public int getBacheca() {
        return bacheca;
    }

    /**
     * @param Bacheca the Bacheca to set
     */
    public void setBacheca(int bacheca) {
        this.bacheca = bacheca;
    }
    
    
    
    /**
     * @return the bachecaGruppi
     */
    public int getBachecaGruppi() {
        return bachecaGruppi;
    }

    /**
     * @param bachecaGruppi the bachecaGruppi to set
     */
    public void setBachecaGruppi(int bachecaGruppi) {
        this.bachecaGruppi = bachecaGruppi;
    }

    
}
