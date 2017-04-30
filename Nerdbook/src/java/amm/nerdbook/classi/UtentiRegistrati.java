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
public class UtentiRegistrati {

    private int idUtente;
    private String nome;
    private String cognome;
    private String urlAvatar;
    private String data;
    private String email;
    private String password;
    private String frase;

    public UtentiRegistrati() {

        this.idUtente = -1;
        this.nome = "";
        this.cognome = "";
        this.urlAvatar = "";
        this.data = "";
        this.email = "";
        this.password = "";
        this.frase = "";
    }

    /**
     * @return the id
     */
    public int getIdUtente() {
        return idUtente;
    }

    /**
     * @param id the id to set
     */
    public void setIdUtente(int id) {

        this.idUtente = id;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the cognome
     */
    public String getCognome() {
        return cognome;
    }

    /**
     * @param cognome the cognome to set
     */
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    /**
     * @return the urlAvatar
     */
    public String getUrlAvatar() {
        return urlAvatar;
    }

    /**
     * @param urlAvatar the urlAvatar to set
     */
    public void setUrlAvatar(String urlAvatar) {
        this.urlAvatar = urlAvatar;
    }

    /**
     * @return the data
     */
    public String getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(String data) {
        this.data = data;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the frase
     */
    public String getFrase() {
        return frase;
    }

    /**
     * @param frase the frase to set
     */
    public void setFrase(String frase) {
        this.frase = frase;
    }

    @Override
    public boolean equals(Object utentediverso) {
        if (utentediverso instanceof UtentiRegistrati) {
            if (this.getIdUtente() == ((UtentiRegistrati) utentediverso).getIdUtente()) {
                return true;
            }
        }
        return false;
    }

    public boolean controlloprofilo(UtentiRegistrati utente) {

        if (utente.getNome().equals("") || utente.getCognome().equals("") || utente.getPassword().equals("")
                || utente.getUrlAvatar().equals("") || utente.getData().equals("")
                || utente.getEmail().equals("") || utente.getFrase().equals("")) {
            return false;
        } else {
            return true;
        }

    }

}
